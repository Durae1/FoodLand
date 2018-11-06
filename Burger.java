/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author lewic
 */
public class Burger {
    public int percRemaining = 100;
    public boolean containsCheese;
    public boolean toppings;
    
    
    public void eatBurger(int percEaten){
        System.out.println("Inside simulateEating method");
        percRemaining = percRemaining - percEaten;
    } // close method
    
    // method: takes no input parameters and returns percRemaining
    public void addTomato(){
     
    } // close method
    
}
