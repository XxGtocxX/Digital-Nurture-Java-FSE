package com.debanuj;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(101, "Alice", "Developer", 70000));
        manager.addEmployee(new Employee(102, "Bob", "Tester", 55000));
        manager.addEmployee(new Employee(103, "Charlie", "Manager", 90000));

        System.out.println("All Employees");

        manager.traverseEmployees();

        System.out.println("\nSearch Employee");

        System.out.println(manager.searchEmployee(102));

        manager.deleteEmployee(102);

        System.out.println("\nAfter Delete");

        manager.traverseEmployees();
    }
}