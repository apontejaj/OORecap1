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
public class Car {
    
    private String make;
    private int year;
    
    /**
     * Default constructor
     * If we don't define any parameter, this is the constructor that
     * runs by default
     */
    public Car(){
        // We can define defaull values for the attributes
        // We don't have to, but it's good practice
        this.make = "Toyota";
        this.year = 2019;
    }
    
    // We can have multiple constructors and we can mix and match with the
    // attributes
    
    /**
     * Constructor for make
     * @param make 
     */
    public Car(String make){
        this.make = make;
        this.year = 2019;
    }
    
    /**
     * Constructor for year
     * @param year 
     */
    public Car(int year){
        this.make = "Toyota";
        this.year = year;
    }
    
    // Some behaviour could be setters and getters
    
    /**
     * Make setter
     * @param make 
     */
    public void setMake(String make){
        this.make = make;
    }
    
    /**
     * Make getter
     * @return 
     */
    public String getMake(){
        return this.make;
    }
    
        
    
}
