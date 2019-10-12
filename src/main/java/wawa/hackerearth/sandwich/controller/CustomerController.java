package wawa.hackerearth.sandwich.controller;

import io.swagger.annotations.Api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import wawa.hackerearth.sandwich.exception.ConflictException;
import wawa.hackerearth.sandwich.model.entity.Customer;
import wawa.hackerearth.sandwich.model.vo.CustomerRequest;
import wawa.hackerearth.sandwich.model.vo.Response;
import wawa.hackerearth.sandwich.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@Api("Endpoint for CustomerController")
public class CustomerController {
	 private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") String customerId) {
        return customerService.getCustomer(customerId);
    }
    @PostMapping(path =  "/customer")
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
}
