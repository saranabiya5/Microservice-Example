package com.example.employee2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.HashMap;


@Data
@AllArgsConstructor
@NoArgsConstructor
//spring cache
//slfj4
//feignclient
public class Employee {

    public static HashMap<Integer, Employee> empObjMap = new HashMap<Integer, Employee>();
    private int empID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
}
