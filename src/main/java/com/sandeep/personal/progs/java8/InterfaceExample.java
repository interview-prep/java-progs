package com.sandeep.personal.progs.java8;

/**
 * Created by SMALA on 9/2/2016.
 */

interface Defaultable {
    // Interfaces now allow default methods, the implementer may or
// may not implement (override) them.
    default String notRequired() {
        return "Default implementation";
    }

    default void printDash(){
        System.out.println("-------------------------------");
    }
}

public class InterfaceExample implements Defaultable {

    public void printDash(){
        System.out.println("############################");
    }
    public static void main(String[] args) {
        InterfaceExample ie= new InterfaceExample();
        System.out.println(ie.notRequired());
        ie.printDash();
    }
}
