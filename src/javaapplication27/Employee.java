/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author stasi
 */
public class Employee extends Person{
    
    private double salary;
    
    public Employee(String name, String last_name, int birthdate,double salary) {
        super(name, last_name, birthdate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
