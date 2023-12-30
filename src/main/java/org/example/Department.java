package org.example;

public class Department {
    public void getEmployee(String departmentName, int departmentID, double budget, int numberOfEmployees, String employeeName){
        System.out.println(employeeName+" isimli çalışan "+departmentName+" departmanında çalışmaktadır.");
        System.out.println("Aylık geliri:"+budget);
        System.out.println("Çalıştığı departman idsi:"+departmentID);
        System.out.println("Departmanda toplam çalışan sayısı:"+numberOfEmployees);

    }

}
