package io.github.patrikalm;


import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {


        exercise6();

    }

   /* public static void ex1() {

        int[] numbers = {11, 23, 29};

        for (int element : numbers) {

            System.out.print(element + " ");

        }
    } */

   /* public static void indexOf() {

        int[] numbers = {2, 3, 5};

        for (int i= 0; i < numbers.length; i++) {

            if(numbers[i] == 5) {
                System.out.println("Index position of number 5 is: " + i);
            }
            else if (numbers[numbers.length-1] != 5) {
                System.out.println(-1);

            }
        }
    } */

/*public static void sortString() {

    String [] cities = {"Paris", "London", "New York", "Stockholm"};

    Arrays.sort(cities);

    System.out.println(Arrays.toString(cities));


    } */

    /* public static void exercise4() {

        int [] firstArray = {1, 15, 20};

        int [] secondArray = Arrays.copyOf(firstArray, firstArray.length);

        System.out.print("Elements from first array: ");
        printArray(firstArray);

        System.out.print("Elements from second array: ");
        printArray(secondArray);
    }

    public static void printArray(int [] arrayToPrint) {

        for (int letter : arrayToPrint) {

            System.out.print(letter + " ");
        }
        System.out.println();

    } */

    /* public static void exercise5() {

        String [][] geoArray = new String[2][2];

        geoArray [0][0] = "France";
        geoArray [0][1] = "Sweden";
        geoArray [1][0] = "Paris";
        geoArray [1][1] = "Stockholm";

        System.out.println(geoArray[0][0] + " " + geoArray[1][0]);
        System.out.println(geoArray[0][1] + " " + geoArray[1][1]);

    } */

    public static void exercise6() {

        int [] values = {43, 5, 23, 17, 2, 14};
        double sum =0;

        for (int element : values) {

            sum = sum + element;

        }

        DecimalFormat df = new DecimalFormat("#.#");

        System.out.println("Average is: " + df.format(sum/ values.length));

    }




}


