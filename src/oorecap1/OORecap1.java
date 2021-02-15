/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oorecap1;

import model.Car;
import model.Dog;
import model.Person;


/**
 *
 * @author apont
 */
public class OORecap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person p1 = new Person();
        
        Person p2 = new Person(25, "Male", "Diego");
        
        System.out.println(p1);
        System.out.println(p2);
        
        
        Car c1 = new Car();
        
        System.out.println(c1.getMake());
        
        Dog d1 = new Dog("Fluffy");
        d1.setOwner(p2);
        
        System.out.println(d1);
        

        
    }
    
}
