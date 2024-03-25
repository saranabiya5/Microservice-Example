package com.example.employee2.service;

import com.example.employee2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import static com.example.employee2.model.Employee.empObjMap;

public class EmployeeService {

     public Employee insertEmployeeDetails(int empID, String firstName, String lastName, String phoneNumber, String address)
     {
         //Employee empObj1 = new Employee(empID,firstName,lastName,phoneNumber, address);
          Employee empObj = new Employee();
          empObj.setEmpID(empID);
          empObj.setFirstName(firstName);
          empObj.setLastName(lastName);
          empObj.setPhoneNumber(phoneNumber);
          empObj.setAddress(address);
          empObjMap.put(empID, empObj);
          return empObj;
     }

     public Employee fetchEmployeeDetailsByID(int empID)
     {
          return empObjMap.get(empID);
     }

     public Employee updateEmployeeDetailsByID(int empID, String address)
     {
          Employee empObj = empObjMap.get(empID);
          empObj.setAddress(address);
          empObjMap.put(empID, empObj);
          return empObj;
     }
     public void deleteEmployeeDetailsByID(int empID)
     {
          System.out.println("Size:"+empObjMap.size());
          empObjMap.remove(empID);
          System.out.println("Size:"+empObjMap.size());
     }


}
