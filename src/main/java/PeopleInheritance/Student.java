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
public class Student extends Person {
    String major;
    String minor;
    float gpa;
    
    public Student(String name){
        super(name);
        System.out.println("Creating a student");
        major = "undecided";
        minor = "Spanish";
        gpa= (float) 0.0;
    }
    
    @Override
    public String greet(){
        String str = super.greet();
        str += "\nwhat up, dawg.";
        System.out.println(str);
        return str;
    }
    
}
