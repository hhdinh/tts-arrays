package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = { 5, 10, 15, 20, 25, 30 };
        int sum = 0;

        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Sum of array is: " + sum);

        // The output for this block of code is 2.
        // Not sure if this is what question 2 is asking for?
        double[] exampleArray = { 1, 5, 6, 5, 4, 1 };

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = i;
            }
        }

        System.out.println(index);

        // calling the toPower method
        System.out.println(Arrays.toString(toPower(4, 2)));
    }

    // toPower method
    public static int[] toPower(int size, int power) {

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.pow(i, power);
        }
        return result;
    }
}
