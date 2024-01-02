package org.example;

public class HRApplication {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Test",1002,15000,25,"Simge Kurtuldu");
        Employee employee2 = new Employee("Test",1234,10000,100,"Ali Solmaz");
        System.out.println(employee1.getEmployee());
        System.out.println(employee2.getEmployee());

    }
}
