package wawa.hackerearth.sandwich.controller;


import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import wawa.hackerearth.sandwich.model.entity.Employee;
import wawa.hackerearth.sandwich.model.vo.UserRequest;
import wawa.hackerearth.sandwich.service.EmployeeService;

@RestController
@RequestMapping(value = "/api/v1/employee")
@Api("Endpoint for EmployeeController")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") Long employeeId) {
        return employeeService.test(employeeId);
    }

    //GET /questions?page=0&size=2&sort=createdAt,desc
    @GetMapping()
    public Page<Employee> getEmployees(Pageable pageable) {
        return employeeService.findAll(pageable);
    }

    @PostMapping()
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @PutMapping()
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

}
