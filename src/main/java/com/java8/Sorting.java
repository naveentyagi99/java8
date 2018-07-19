package com.java8;

import com.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Sorting {

    public static void main(String arr[]) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Naveen", "Tyagi", 28),
                new Employee("Kuldeep", "Kumar", 31),
                new Employee("Nikhil", "Dixit", 38),
                new Employee("Saurabh", "Katiyar", 22)
        );
        System.out.println("Before Sorting:..");
        employeeList.forEach((employee)-> System.out.println(employee));
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("After Sorting:...");
        employeeList.forEach((employee)-> System.out.println(employee));
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        System.out.println("After Sorting on name: ");
        employeeList.forEach(System.out::println);
    }
}