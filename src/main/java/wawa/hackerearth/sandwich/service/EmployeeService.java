package wawa.hackerearth.sandwich.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import wawa.hackerearth.sandwich.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(Long id);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Long id);

    List<Employee> getAllEmployees();

    Employee test(Long id);

    Page<Employee> findAll(Pageable pageable);
}
