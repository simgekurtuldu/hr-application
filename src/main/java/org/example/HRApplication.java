package org.example;

public class HRApplication {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Test",1002,15000,25,"Simge Kurtuldu");
        Employee employee2 = new Employee("Test",1234,10000,100,"Ali Solmaz");
        System.out.println(employee1.getEmployeeName()+ " isimli çalışan " + employee1.getDepartmentName()+ " departmanında çalışmaktadır.");
        System.out.println("Aylık geliri: " + employee1.getBudget());
        System.out.println("Çalıştığı departman idsi: "+ employee1.getDepartmentID());
        System.out.println("Departmanında toplam çalışan sayısı: "+employee1.getNumberOfEmployees());
        System.out.println(employee2.getEmployeeName()+ " isimli çalışan " + employee2.getDepartmentName()+ " departmanında çalışmaktadır.");
        System.out.println("Aylık geliri: " + employee2.getBudget());
        System.out.println("Çalıştığı departman idsi: "+ employee2.getDepartmentID());
        System.out.println("Departmanında toplam çalışan sayısı: "+employee2.getNumberOfEmployees());

    }
}
