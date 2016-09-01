package com.sandeep.personal.progs.numbers;

import java.util.Scanner;

/*
 * Created by smala on 9/1/2016.
 *      1
 *     2 2
 *    3 3 3
 *   4 4 4 4
 *  5 5 5 5 5
 * 6 6 6 6 6 6
 */

public class PyramidOne {

    public void printPyramid() {
        Scanner sc = new Scanner(System.in);
        System.out.print("#row : ");
//        int rows = sc.nextInt();
        int rows = 9;
        /*
         0
         1 1
         2 2 2
         3 3 3 3
         4 4 4 4 4
         5 5 5 5 5 5
         6 6 6 6 6 6 6
         */

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            int r = i;
            for (int j = 0; j <= ((rows - r) / 2); j++) {
                System.out.print(" ");
                r--;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

        }
        System.out.println("\n------------------------------------------------------");
        for (int i = 1; i <= rows; i++) {
            System.out.println();
            int r = i;
            for (int j = 0; j <= ((rows - r) / 2); j++) {
                System.out.print(" ");
                r--;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

        }
        System.out.println("\n------------------------------------------------------");

        /*
         6 6 6 6 6 6 6
         5 5 5 5 5 5
         4 4 4 4 4
         3 3 3 3
         2 2 2
         1 1
         0
         */
        /*for (int i = rows; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }*/

    }

    public static void main(String[] args) {
        PyramidOne pyramidOne = new PyramidOne();
        pyramidOne.printPyramid();
    }
}
