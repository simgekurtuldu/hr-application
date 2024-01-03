package org.example;
public class Employee {
    String departmentName;
    int departmentID;
    double budget;
    int numberOfEmployees;
    String employeeName;

    public Employee(String departmentName, int departmentID, double budget, int numberOfEmployees, String employeeName){
        this.departmentName = departmentName;
        this.employeeName = employeeName;
        this.departmentID =departmentID;
        this.budget=budget;
        this.numberOfEmployees=numberOfEmployees;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    public int getDepartmentID(){
        return this.departmentID;
    }
    public double getBudget(){
        return this.budget;
    }
    public int getNumberOfEmployees(){
        return this.numberOfEmployees;
    }
}
