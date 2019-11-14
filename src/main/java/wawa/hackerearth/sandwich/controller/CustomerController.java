package wawa.hackerearth.sandwich.controller;

import io.swagger.annotations.Api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import wawa.hackerearth.sandwich.exception.ConflictException;
import wawa.hackerearth.sandwich.model.entity.Customer;
import wawa.hackerearth.sandwich.model.entity.CustomerPdf;
import wawa.hackerearth.sandwich.model.vo.CustomerRequest;
import wawa.hackerearth.sandwich.model.vo.Response;
import wawa.hackerearth.sandwich.service.CustomerPdfService;
import wawa.hackerearth.sandwich.service.CustomerService;
import wawa.hackerearth.sandwich.util.ExcelGenerator;
import wawa.hackerearth.sandwich.util.PDFGenerator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/customers")
@Api("Endpoint for CustomerController")
public class CustomerController {
	 private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

	@Autowired
	CustomerPdfService customerPdfService;

    @GetMapping()
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") String customerId) {
        return customerService.getCustomer(customerId);
    }

    @PostMapping()
    public ResponseEntity<?>  saveCustomer(@RequestBody CustomerRequest customer) {
        //validations
    	//  if (CollectionUtils.(customer.getCustomerId()))
            //  throw new BadRequestException(CustomResponseCode.INVALID_REQUEST, "Role ID cannot be empty");
    	  
    	 HttpStatus httpCode = HttpStatus.INTERNAL_SERVER_ERROR;
    	 LOGGER.info("CustomerId: "+customer.getCustomerId());
    	 LOGGER.info("Customer JSOn: "+customer.toString());
        Response resp = new Response();
        Customer customerExist = customerService.getCustomer(customer.getCustomerId());
    	
    	if(null != customerExist)
    		  throw new ConflictException("01", " Customer account already exist");
    	else {
    		CustomerRequest customerResponse =  customerService.saveCustomer(customer);
    		if( null != customerResponse && null != customerResponse.getId())
    		{
	    	    resp.setCode("00");
		        resp.setDescription("Successful");
		        httpCode = HttpStatus.CREATED;
    		}
    		else {
    			 resp.setCode("500");
                 resp.setDescription("Not successful");
                 httpCode = HttpStatus.INTERNAL_SERVER_ERROR;
    		}
    	}
    	return new ResponseEntity<>(resp, httpCode);	
    }


	@GetMapping(value = "/pdf",
			produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> customersReport() throws IOException {
		//List<CustomerPdf> customers = (List<CustomerPdf>) customerPdfService.getCustomerPdfs();
		List<CustomerPdf> customers = customerPdfService.getCustomerPdfs();
		ByteArrayInputStream bis = PDFGenerator.customerPDFReport(customers);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=customers.pdf");
		//headers.add(“Content-Disposition”, “attachment; filename=customers.pdf”); //TODO to download the PDF

		return ResponseEntity
				.ok()
				.headers(headers)
				.contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(bis));
	}

	@GetMapping(value = "/download/customers.xlsx")
	public ResponseEntity<InputStreamResource> excelCustomersReport() throws IOException {
		List<CustomerPdf> customers = customerPdfService.getCustomerPdfs();

		ByteArrayInputStream in = ExcelGenerator.customersToExcel(customers);
		// return IOUtils.toByteArray(in);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=customers.xlsx");

		return ResponseEntity
				.ok()
				.headers(headers)
				.body(new InputStreamResource(in));
	}
}
