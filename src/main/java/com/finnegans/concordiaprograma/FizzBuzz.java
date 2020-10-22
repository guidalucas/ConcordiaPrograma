/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finnegans.concordiaprograma;

/**
 *
 * @author Lucas
 */
public class FizzBuzz {

    public static void Metodo1() {

        int x;
        for (x = 1; x <= 100; x++) {

            if (x % 3 == 0 && x % 5 == 0) {

                System.out.println("FizzBuzz");

            } else {
                if (x % 3 == 0) {

                    System.out.println("Fizz");

                } else {
                    if (x % 5 == 0) {

                        System.out.println("Buzz");

                    } else {

                        System.out.println(x);
                    }
                }
            }

        }
    }

    public static void Metodo2() {

        int divisor3 = 3;
        int divisor5 = 5;
        int division3;
        int division5;
        int multiplicar3;
        int multiplicar5;

        for (int x = 1; x <= 100; x++) {

            division3 = x / divisor3;
            multiplicar3 = division3 * divisor3;

            division5 = x / divisor5;
            multiplicar5 = division5 * divisor5;

            if (multiplicar3 == x && multiplicar5 == x) {

                System.out.println("FizzBuzz");

            } else {
                if (multiplicar3 == x) {
                    System.out.println("Fizz");
                } else {

                    if (multiplicar5 == x) {
                        System.out.println("Buzz");
                    } else {

                        System.out.println(x);

                    }
                }
            }
        }

    }

    public static void main(String[] args) {

        Metodo1();
        //Metodo2();
    }
}
