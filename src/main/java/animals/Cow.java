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
public class Cow extends Animal {

    public Cow(){
        super(6000);
        System.out.println("Building a cow");
        
    }
    @Override
    public void makeNoise() {
        System.out.println("Mooooo");
    }

    @Override
    public void eat(Edible food) {
        int cals = food.beEaten();
        System.out.println("I'm a cow eating. calories: " + cals);
        consumedSoFar += .50 * cals;
    }

    @Override
    public int beEaten() {
        System.out.println("Ouch. I'm a cow being eaten.");
        return 1000000;
    }

}
