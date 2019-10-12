package wawa.hackerearth.sandwich.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wawa.hackerearth.sandwich.model.entity.Customer;
import wawa.hackerearth.sandwich.model.vo.CustomerRequest;
import wawa.hackerearth.sandwich.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/profile")
@Api("Endpoint for CustomerController")
public class CustomerController {

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
    public void saveCustomer(@RequestBody CustomerRequest customer) {
    //validations
        customerService.saveCustomer(customer);
    }
}
