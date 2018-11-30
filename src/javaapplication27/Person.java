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
    private String last_name;
    private int age;

    public Person(String name, String last_name, int birthdate) {
        this.name = name;
        this.last_name = last_name;
        this.age = Year.now().getValue()-birthdate;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    
}
