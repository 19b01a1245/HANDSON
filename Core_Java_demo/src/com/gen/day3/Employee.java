package com.gen.day3;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Software Engineer", 50000.0);
        employee.displayInfo();

        double newSalary = 55000.0;
        employee.setSalary(newSalary);
        employee.displayInfo();

        double increasePercentage = 10.0;
        employee.increaseSalary(increasePercentage);
        employee.displayInfo();
    }
}

