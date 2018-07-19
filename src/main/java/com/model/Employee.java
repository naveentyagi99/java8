package com.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + "  Age : " + this.age;
    }

    public static List<Employee> getEmployees() {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Naveen", "Tyagi", 28),
                new Employee("Kuldeep", "Kumar", 31),
                new Employee("Nikhil", "Dixit", 38),
                new Employee("Saurabh", "Katiyar", 22)
        );
        return employeeList;
    }

    public static Map<Employee, Employee> getMap() {
        Map<Employee, Employee> employeeMap = new HashMap();
        getEmployees().forEach(employee -> employeeMap.put(employee, employee));
        return employeeMap;
    }


}