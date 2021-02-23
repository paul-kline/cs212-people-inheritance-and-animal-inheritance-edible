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
public class Ostrich extends Bird {

    public Ostrich(){
        super(3000);
        System.out.println("building an ostrich");
    }
    @Override
    public void makeNoise() {
        System.out.println("bark bark. I'm an ostrich");
    }

    @Override
    public void eat(Edible food) {
        int cals = food.beEaten();
        System.out.println("I'm an ostrich eating.");
        consumedSoFar += 1.1 * cals;
    }

    @Override
    public int beEaten() {
        System.out.println("I'm an ostrich being eaten");
        return 50000;
    }
    
}
