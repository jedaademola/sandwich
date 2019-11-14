package wawa.hackerearth.sandwich.controller;


import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wawa.hackerearth.sandwich.exception.BadRequestException;
import wawa.hackerearth.sandwich.model.entity.Employee;
import wawa.hackerearth.sandwich.service.EmployeeService;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/employees")
@Api("Endpoint for EmployeeController")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") Long employeeId)
            throws BadRequestException {
        Employee employee = Optional.ofNullable(employeeService.test(employeeId))
                .orElseThrow(() -> new BadRequestException("001", "Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
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
