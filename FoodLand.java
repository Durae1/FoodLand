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
public class FoodLand {
     final static int nibble = 5;
        final static int megaBite = 45;
        
    public static void main(String[] args){

        Donut firstDonut;
        firstDonut = new Donut();
        
        firstDonut.name = "Chris";
        
        // pass our Donut referenced by firstDonut to printObjectData
        printObjectData(firstDonut);
        
        // follow same pattern to make a second Donut object
        Burger firstBurger;
        firstBurger = new Burger();
        firstBurger.containsCheese();
        
        printObjectData(firstBurger);
        
        // now eat some of each donut and print out the stats
        System.out.println("Eating " + firstDonut.name);
        System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
        System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
        System.out.println("Taking megaBite...");
        firstDonut.simulateEating(megaBite);
        printObjectData(firstDonut);
        
        // same pattern for secondDonut
        System.out.println("Eating " + firstBurger.name);
        System.out.println("Taking lots of megaBites");
        int numCalls = 10;
        for(int i = 0; i < numCalls; i++){
            System.out.println("gnam gnam");firstBurger.simulateEating(megaBite);
        }
        
        printObjectData(firstBurger);
        
    } // close main
    
    private static void printObjectData(Donut inputDonut){
        System.out.println("|-------STATS--------|");
        System.out.println("| Name: " + inputDonut.name);
        System.out.println("| PercRemaining: " + inputDonut.getPercRemaining());
        System.out.println("|--------------------|");
    } // close printObjectData method
} // close class

