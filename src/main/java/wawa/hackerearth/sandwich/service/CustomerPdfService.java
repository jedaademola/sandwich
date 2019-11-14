package wawa.hackerearth.sandwich.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wawa.hackerearth.sandwich.dao.CustomerPdfRepository;
import wawa.hackerearth.sandwich.model.entity.CustomerPdf;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerPdfService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
    @Autowired
    private CustomerPdfRepository customerPdfRepository;

    @PostConstruct
    public void init() throws Exception {

        if (getCustomerPdfs().isEmpty()) {
            // save a list of Customers
            List<CustomerPdf> customers = Arrays.asList(
                    new CustomerPdf(Long.valueOf(1), "Jack Smith", "Massachusetts", "Jack Smith", "Massachusetts", 23),
                    new CustomerPdf(Long.valueOf(2), "Adam Johnson", "New York", "Adam Johnson", "New York", 27),
                    new CustomerPdf(Long.valueOf(3), "Katherin Carter", "Washington DC", "Katherin Carter", "Washington DC", 26),
                    new CustomerPdf(Long.valueOf(4), "Jack London", "Nevada", "Jack London", "Nevada", 33),
                    new CustomerPdf(Long.valueOf(5), "Jason Bourne", "California", "Jason Bourne", "California", 36));

            // save a list of Customers
            saveAll(customers);
        }

    }

    public List<CustomerPdf> getCustomerPdfs() {
        List<CustomerPdf> list = new ArrayList<>();
        try {
            list = customerPdfRepository.findAll();
        } catch (Exception e) {

            String msg = "Error while getting Data in CustomerPdfService.getCustomerPdfs";
            LOGGER.error(msg, e);
        }
        return list;
    }

    public void saveAll(List<CustomerPdf> customerPdfs) {
        customerPdfRepository.saveAll(customerPdfs);
    }
}
