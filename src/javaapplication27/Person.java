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
public abstract class Person {
    private String name;
    private String last_name;
    private int birthdate;

    public Person(String name, String last_name, int birthdate) {
        this.name = name;
        this.last_name = last_name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getBirthdate() {
        return birthdate;
    }

   
    
}
