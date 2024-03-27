package com.example.employee2.controller;

import com.example.employee2.client.EmployeeClient;
import com.example.employee2.model.Employee;
import com.example.employee2.service.EmployeeService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController

public class EmployeeController {

    @Autowired
    private final EmployeeService empServiceObj;
    //private final EmployeeClient empClient;

    @GetMapping(value = "/employee/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> fetchEmployee(@PathVariable int id){

        //Employee empObj = empServiceObj.fetchAllEmployees();
        //return new ResponseEntity<>(empObj, HttpStatus.OK);

        System.out.println("In Controller");
        return ResponseEntity.ok(empServiceObj.fetchEmployeeDetailsByID(id));
    }
    @PostMapping(value = "/addEmployee", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee reqEmp){

        //Employee empObj = empServiceObj.insertEmployeeDetails(reqEmp.getEmpID(),reqEmp.getFirstName(),reqEmp.getLastName(), reqEmp.getPhoneNumber(),reqEmp.getAddress());
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PatchMapping(value = "/updateEmployee", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> updateEmployeeDetailsByID(@RequestParam int empID, @RequestBody Employee reqEmp){

        //Employee empObj = empServiceObj.updateEmployeeDetailsByID(empID, reqEmp.getAddress());
        //return new ResponseEntity<>(empObj, HttpStatus.OK)
        return null;
    }
    @DeleteMapping(value = "/deleteEmployee", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteEmployeeByID(@RequestParam int empID){

        empServiceObj.deleteEmployeeRecordByID(empID);
        return new ResponseEntity<>("Deleted Employee "+ empID +"'s Details Successfully", HttpStatus.OK);
    }
}
