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
public abstract class Bird extends Animal{
    public Bird(int cals){
        super(cals);
        System.out.println("Building a bird");
    }
}
