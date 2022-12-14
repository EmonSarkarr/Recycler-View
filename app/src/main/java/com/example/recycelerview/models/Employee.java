package com.example.recycelerview.models;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }


    public static List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Emon", "CEO"));
        employees.add(new Employee("musfiq Sarkarrrr", "CEO"));
        employees.add(new Employee("rahman", "Director"));
        employees.add(new Employee("maruf", "CEO"));
        employees.add(new Employee("kausar", "Sales Executive"));
        employees.add(new Employee("zihad", "CEO"));
        employees.add(new Employee("ABC", "CEO")); //emonn
        employees.add(new Employee("IRON MAN", "Super Hero"));
        return employees;
    }

}
