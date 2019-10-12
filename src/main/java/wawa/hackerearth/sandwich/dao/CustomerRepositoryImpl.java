package wawa.hackerearth.sandwich.dao;


import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.Customer;
import wawa.hackerearth.sandwich.model.entity.Profile;

import java.util.List;

@Repository
public abstract class CustomerRepositoryImpl implements CustomerRepositoryDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRepositoryImpl.class);
    @Autowired
    private CustomerRepository customerRepository;
    /*public Customer getCustomer(String customerId) {
        // public List<CustomerRequest> getCustomers() {
        Customer customer = new Customer();
        try {
            customer = customerRepository.getCustomer(customerId);
        } catch (Exception e) {

            String msg = "Error while getting Data in CustomerService.getCustomer";
            LOGGER.error(msg, e);
        }
        return customer;
    }
*/
  /*  @Override
    public Customer saveCustomer(Customer customer) {
        String msg = null;
        Customer newCustomer = null;
        try {
            newCustomer = customerRepository.save(customer);
        } catch (HibernateException e) {
            msg = e.getMessage();
            LOGGER.error(msg, e);
            throw new HibernateException(msg, e);
        }

        return newCustomer;
    }*/


}
