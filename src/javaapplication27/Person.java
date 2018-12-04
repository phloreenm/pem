/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.time.Year;

/**
 *
 * @author stasi
 */
public abstract class Person {
    
    private String name;
    private String lastName;
    private int birthdate;
   

    public Person(String name, String last_name, int birthdate) {
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        int age=Year.now().getValue()-this.birthdate;
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String last_name) {
        this.lastName = lastName;
    }

    

   
    
}
