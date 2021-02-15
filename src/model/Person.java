/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author apont
 */
public class Person {
    
    int age;
    String gender;
    String name;
    
    // Default Constructor
    public Person(){
        this.age = 18;
        this.gender = "Female";
        this.name = "Amilcar";
    }
    
    public Person(int age, String gender, String name){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
    
    public String run(){
        return this.name + " is running";
    }
    
    public String walk(){
        return this.name + " is walking";
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString(){
        return "Name: " + this.name + " Gender: " + this.gender + " Age: " + this.age;

    }
    
    
}
