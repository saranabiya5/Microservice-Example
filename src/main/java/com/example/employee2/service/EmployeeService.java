package com.example.employee2.service;

import com.example.employee2.client.EmployeeClient;
import com.example.employee2.model.Employee;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.employee2.model.Employee.empObjMap;

@Service

public class EmployeeService implements EmployeeClient{

     @Autowired
     private final EmployeeClient employeeClient;

     public Employee fetchEmployeeDetailsByID(int empID)
     {
          return employeeClient.fetchEmployeeDetailsByID(empID);
     }

     public Employee fetchAllEmployees()
     {
          return employeeClient.fetchAllEmployees();
     }

     public String createNewEmployeeRecord(int id)//, String employee_name, String employee_salary, int employee_age, String profile_image)
     {
         //Employee empObj1 = new Employee(empID,firstName,lastName,phoneNumber, address);
          Employee empObj = new Employee();
          empObj.setId(id);
//          empObj.setEmployee_name(employee_name);
//          empObj.setEmployee_salary(employee_salary);
//          empObj.setEmployee_age(employee_age);
//          empObj.setProfile_image(profile_image);
          empObjMap.put(id, empObj);
          //return empObj;
          return "Created a new Record";
     }

     public String updateEmployeeRecordByID(int empID)
     {
          Employee empObj = empObjMap.get(empID);
          empObjMap.put(empID, empObj);
          return "Updated a new Record";
     }

     public String deleteEmployeeRecordByID(int empID)
     {
          empObjMap.remove(empID);
          return "Deleted Record";
     }



}
