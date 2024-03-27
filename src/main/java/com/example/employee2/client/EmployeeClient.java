package com.example.employee2.client;
import com.example.employee2.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.web.bind.annotation.*;
import com.example.employee2.service.EmployeeService;

@FeignClient(
        value = "employeeExternalService",
        url = "https://dummy.restapiexample.com/api/v1/employees")
        //configuration = FeignClientProperties.FeignClientConfiguration.class)

public interface EmployeeClient {

    @GetMapping Employee fetchEmployeeDetailsByID(@RequestParam int id);
    @GetMapping Employee fetchAllEmployees();
    @PostMapping String createNewEmployeeRecord(@RequestParam int id);
    @PutMapping String updateEmployeeRecordByID(@RequestParam int id);
    @DeleteMapping String deleteEmployeeRecordByID(@RequestParam int id);
}
