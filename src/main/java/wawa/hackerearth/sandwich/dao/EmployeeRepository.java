package wawa.hackerearth.sandwich.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // @Autowired
    //EntityManagerFactory entityManagerFactory;

    //Implement paging and sorting
    //@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
    @Query(value = "SELECT * FROM Employee WHERE id = ?1", nativeQuery = true)
    Employee test(Long id);
}
