package wawa.hackerearth.sandwich.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.Customer;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //Customer saveCustomer(Customer customer);
    //List<Customer> getCustomers();
    @Query(value = "SELECT * FROM Customer WHERE customer_id = ?1", nativeQuery = true)
    Customer getCustomer(String customerId);
}
