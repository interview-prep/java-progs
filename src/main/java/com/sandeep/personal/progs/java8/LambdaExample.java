package com.sandeep.personal.progs.java8;

import java.util.Arrays;

/**
 * Created by SMALA on 9/2/2016.
 */
public class LambdaExample {

    public void method1() {
        Arrays.asList("a", "b", "d").forEach(e -> {
            System.out.println(e);
        });

        Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e));

//        String separator = ",";
        final String separator = ",";
        Arrays.asList("a", "b", "d").forEach(
                // we can local variables inside closures/lambdas
                (String e) -> System.out.print(e + separator));

    }

    public void method2(){
        //The return statement is not required if the lambda body is just a one-liner.
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );

        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );
    }

    public static void main(String[] args) {
        LambdaExample le = new LambdaExample();
        le.method1();

    }
}
