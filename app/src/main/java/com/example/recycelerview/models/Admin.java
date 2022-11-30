package com.example.recycelerview.models;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String name;
    private String salary;
    private String phoneNumber;

    public Admin(String name, String salary, String phoneNumber) {
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static List<Admin> getAllAdminDetails() {
        List<Admin> admins = new ArrayList<>();
        admins.add(new Admin("Emon", "20000","01723315828"));
        admins.add(new Admin("MON  ", "50000","15828"));
        admins.add(new Admin("MOSFIQ", "20000","01723315828"));
        admins.add(new Admin("ARON", "205000","0828"));
        admins.add(new Admin("KAUSAR", "21000","0172114565828"));
        admins.add(new Admin("ZIHAD", "15000","0172358"));
        admins.add(new Admin("LABIB", "170000","01723315828"));
        admins.add(new Admin("SORON", "180000","017233115828"));
        admins.add(new Admin("RAKIB", "10000","0142328"));
        admins.add(new Admin("RASHED", "650000","01720765028"));

        return admins;
    }

}
