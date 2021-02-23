/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeopleInheritance;
    
/**
 *
 * @author pauli
 */
public class Person {
    private String name;
    
    public Person(String name){
        System.out.println("Creating a person");
        this.name = name;
    }
    public String greet(){
        String str = "Hello! My name is " + name;
        System.out.println(str);
        return str;
    }
    public String sayCatchphrase(){
        String str = "Hello! I'm a person.";
        System.out.println(str);
        return str;
    }
}
