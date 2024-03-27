package com.example.employee2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    public static HashMap<Integer, Employee> empObjMap = new HashMap<Integer, Employee>();
    private int id;
    private String employee_name;
    private String employee_salary;
    private int employee_age;
    private String profile_image;
}
