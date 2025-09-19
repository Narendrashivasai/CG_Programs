package com.codegnan.oppexamples;

public class Employ {
    private String name;
    private Double salary;
    private int employeeId;
    public Employ() {
    }
    public Employ(String name, Double salary, int employeeId) {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
    	if (salary != null && salary > 0) {
        this.salary = salary;
    	 } else {
             System.out.println("Salary is invalid");
         }
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
public void displayInfo() {
    System.out.println("Employ ID: " + employeeId);
    System.out.println("Employ Name: " + name);
    System.out.println("Employ Salary: " + salary);
    }
}
