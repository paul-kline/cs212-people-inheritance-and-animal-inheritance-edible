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
public class Hummingbird extends Bird implements CanFly{

    public Hummingbird(){
        super(10000000);
        System.out.println("Building a humming bird");
        
    }
    @Override
    public void makeNoise() {
        System.out.println("flapflapflapflapflapflapflapflap");
    }

    @Override
    public void eat(Edible food) {
        int cals = food.beEaten();
        System.out.println("slurpslurpslurpslurpslurp");
        dailyCaloricNeeds+= .85 * cals;
    }

    @Override
    public int beEaten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fly() {
        makeNoise();
    }
    
}
