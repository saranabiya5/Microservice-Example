package com.example.employee2.controller;

import com.example.employee2.model.Employee;
import com.example.employee2.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class EmployeeController {

    EmployeeService empServiceObj = new EmployeeService();

    @PostMapping(value = "/addEmployee", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee reqEmp){

        Employee empObj = empServiceObj.insertEmployeeDetails(reqEmp.getEmpID(),reqEmp.getFirstName(),reqEmp.getLastName(), reqEmp.getPhoneNumber(),reqEmp.getAddress());
        return new ResponseEntity<>(empObj, HttpStatus.OK);
    }
    @GetMapping(value = "/fetchEmployee", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> fetchEmployeeByID(@RequestParam int empID){

        Employee empObj = empServiceObj.fetchEmployeeDetailsByID(empID);
        return new ResponseEntity<>(empObj, HttpStatus.OK);
    }
    @PatchMapping(value = "/updateEmployee", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> updateEmployeeDetailsByID(@RequestParam int empID, @RequestBody Employee reqEmp){

        Employee empObj = empServiceObj.updateEmployeeDetailsByID(empID, reqEmp.getAddress());
        return new ResponseEntity<>(empObj, HttpStatus.OK);
    }
    @DeleteMapping(value = "/deleteEmployee", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteEmployeeByID(@RequestParam int empID){

        empServiceObj.deleteEmployeeDetailsByID(empID);
        return new ResponseEntity<>("Deleted Employee "+ empID +"'s Details Successfully", HttpStatus.OK);
    }
}
