package com.sandeep.personal.progs.java8;

import java.util.Optional;

/**
 * Created by SMALA on 9/6/2016.
 */
public class OptionalsExample {

    public static void main(String[] args) {
//        Optional< String > fullName = Optional.ofNullable( null );
        Optional< String > fullName = Optional.ofNullable( "sandeep" );
        System.out.println( "Full Name is set? " + fullName.isPresent() );
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
    }
}
