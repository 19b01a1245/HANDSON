package com.gen.day4;

class Person {
    private String firstName;
    private String lastName;

    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public String getFirstName() {
        return firstName;
    }

    
    public String getLastName() {
        return lastName;
    }
}

class Employe extends Person {
    private int employeeId;
    private String jobTitle;

    
    public Employe(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    
    public int getEmployeId() {
        return employeeId;
    }

    
    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }


    public static void main(String[] args) {
        
        Employe employee = new Employe("John", "Doe", 12345, "Software Engineer");

       
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name with Job Title: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeId());
    }
}
