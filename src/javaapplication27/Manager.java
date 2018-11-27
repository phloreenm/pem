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
public class Manager extends Employee{
    
    
    private double bonus;

    public Manager(String name, String last_name, int age, double salary) {
        super(name, last_name, age, salary);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = getSalary()*0.5;
    }
    
    
    }

    
