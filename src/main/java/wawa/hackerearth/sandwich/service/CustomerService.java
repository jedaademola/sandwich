package wawa.hackerearth.sandwich.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wawa.hackerearth.sandwich.dao.CustomerRepository;
import wawa.hackerearth.sandwich.model.entity.Customer;
import wawa.hackerearth.sandwich.model.vo.CustomerRequest;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomer(String customerId) {
        Customer customer = new Customer();
        
        try {
            customer = customerRepository.getCustomer(customerId);
                   
        } catch (Exception e) {

            String msg = "Error while getting Data in CustomerService.getCustomer";
            LOGGER.error(msg, e);
        }
        return customer;
    }

    public List<Customer> getCustomers() {
        List<Customer> list = new ArrayList<>();
        try {
            list = customerRepository.findAll();
        } catch (Exception e) {

            String msg = "Error while getting Data in CustomerService.getCustomers";
            LOGGER.error(msg, e);
        }
        return list;
    }

    public CustomerRequest saveCustomer(CustomerRequest request) {
        LOGGER.info("inCustomerService.saveCustomer:save");
        Customer customer;
        Customer dbResponse;;
        CustomerRequest customerResponse = null;
        try {

            customer = modelMapper.map(request, Customer.class);
            dbResponse = customerRepository.save(customer);

            customerResponse = modelMapper.map(dbResponse, CustomerRequest.class);

        } catch (Exception e) {

            String msg = "Error while persisting Data in CustomerService.save Customer";
            LOGGER.error(msg, e);
        }

        LOGGER.info(" CustomerService.save Customer:end");
        return customerResponse;
    }
}
