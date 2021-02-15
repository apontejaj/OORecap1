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
public class Dog {
    
    private String name;
    private String breed;
    private boolean vaccined;
    private Person owner;
    
    
    public Dog(String name){
        this.name = name;
        this.breed = "Mixed";
        this.vaccined = false;
        this.owner = null;
          
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isVaccined() {
        return vaccined;
    }


    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + " Owner: " + this.owner.getName();
    }
    
    
    
}
