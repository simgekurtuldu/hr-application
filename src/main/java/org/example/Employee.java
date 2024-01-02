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
    public String getEmployee(){
        return employeeName+" isimli çalışan "+departmentName+" departmanında çalışmaktadır." + "\n" +
                "Aylık geliri:"+budget + "\n" + "Çalıştığı departman idsi:" + departmentID + "\n" + "Departmanda toplam çalışan sayısı:"+numberOfEmployees;

    }


}
