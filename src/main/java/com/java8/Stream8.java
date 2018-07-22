package com.java8;

import com.model.Employee;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Stream8 {

    public static void main(String arr[]) {
        List<Employee> employeeList = Employee.getEmployees();

        System.out.println("Filter on List");
        employeeList.stream()
                .filter(employee -> employee.getLastName().equals("Kumar"))
                .forEach(System.out::println);

        System.out.println("System out println:->");

        System.out.println("ToList");
        employeeList.stream()
                .filter(employee -> employee.getFirstName().contains("N"))
                .collect(toList())
                .stream()
                .forEach(System.out::println);

        Employee result = employeeList.stream()
                .filter(employee -> employee.getFirstName().equals("Naveen"))
                .findAny()
                .orElse(null);
        System.out.println(result);

        String name = employeeList.stream()
                .filter(employee -> employee.getFirstName().equals("Naveen"))
                .map(Employee::getLastName)
                .findAny()
                .orElse(null);
        System.out.println("Printing last name with Map: " + name);


        //Upper Case
        System.out.println("UpperCase");
        List<String> list = Employee.getEmployeeName();
        List<String> toUpperCase = list.stream()
                .map(String::toUpperCase)
                .collect(toList());
        System.out.println(toUpperCase);

        //Double Number

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubleInt = intList.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(doubleInt);

        //Get List of the name of all the Employee

        List<String> names = employeeList.stream()
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .collect(toList());
        System.out.println(names);

        String[] array = {"a", "b", "c", "d", "e"};

        Supplier<Stream<String>> stream = () -> Stream.of(array);
        stream.get().forEach(System.out::println);

        long count = stream.get().filter(e -> e.equals("b"))
                .count();
        System.out.println("Number of B are: " + count);

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        Map<String, Integer> result2 = new LinkedHashMap<>();
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
        System.out.println(result2);

        Map<String, Integer> result3 = new LinkedHashMap<>();
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> result3.put(x.getKey(), x.getValue()));
        System.out.println(result2);

        System.out.println("Compare by value");
        System.out.println(result3);

        //Converting List to Map

        Map<String, Integer> mapFromList = Employee.getEmployees()
                .stream()
                .collect(Collectors.toMap(Employee::getFirstName, Employee::getAge));
        System.out.println("List To map:-");
        System.out.println(mapFromList);


        //Convert Map to List

        List<Employee> employeeMap = Employee.getMap().keySet()
                .stream()
                .collect(Collectors.toList());

        //Filter Map and convert to map
        List<Employee> filterList = Employee.getMap().keySet()
                .stream()
                .filter(e -> e.getFirstName().equals("Naveen"))
                .collect(toList());




    }
}
