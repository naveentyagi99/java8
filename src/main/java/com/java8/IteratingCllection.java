package com.java8;

import com.model.Employee;

import java.util.List;
import java.util.Map;

public class IteratingCllection {

    public static void main(String arr[]) {

        //Iterating through List
        List<Employee> employeeList = Employee.getEmployees();
        employeeList.forEach(System.out::println);

        employeeList.forEach(item -> {
                    if (item.getLastName().equals("Naveem")) {
                        System.out.println(item);
                    }
                }
        );
        System.out.println();
        System.out.println("Filter on List");
        employeeList.stream()
                .filter(employee -> employee.getLastName().equals("Kumar"))
                .forEach(System.out::println);

        //Iterating through Map
        System.out.println();
        System.out.println("Printing Map --> ");
        Map<Employee, Employee> employeeMap = Employee.getMap();
        employeeMap.forEach((k, v) -> System.out.println(k));
    }
}
