/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import sun.nio.cs.ext.TIS_620;

/**
 *
 * @author stasi
 */
public class Manager extends Employee{
    
    
    private double bonus;

    public Manager(String name, String last_name, int birthdate, double salary) {
        super(name, last_name,birthdate , salary);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
      this.bonus=getSalary()*0.5;
    }
  
    }

    
