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
public class Lion extends Animal {

    public Lion(){
        super(4000);
        System.out.println("Building a Lion");
        
    }
    @Override
    public void makeNoise() {
        System.out.println("Roar. I'm a lion.");
    }

    @Override
    public void eat(Edible food) {
        int cals = food.beEaten();
        System.out.println("I am a lion consuming: " + cals  + "calories");
        consumedSoFar += .80 * cals;
    }

    @Override
    public int beEaten() {
        System.out.println("oh nooooo I'm a lion being eaten.");
        return 100000;
    }

}
