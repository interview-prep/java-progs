package com.sandeep.personal.progs.java8;

import java.util.function.Supplier;

/**
 * Created by SMALA on 9/2/2016.
 */
public class StaticInterface {
    public static StaticInterface create(final Supplier<StaticInterface> supplier) {
        return supplier.get();
    }

    public static void collide(final StaticInterface car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final StaticInterface another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}