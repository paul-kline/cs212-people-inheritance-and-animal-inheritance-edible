/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author pauli
 */
public abstract class Animal implements Edible {

    public Animal(int dailyCals){
        System.out.println("Building animal");
        dailyCaloricNeeds = dailyCals;
    }
    int dailyCaloricNeeds;
    double consumedSoFar = 0;

    //makeNoise
    //daily caloric intake.
    //eats a Food what's a food?
    public abstract void makeNoise();

    public abstract void eat(Edible food);

}
