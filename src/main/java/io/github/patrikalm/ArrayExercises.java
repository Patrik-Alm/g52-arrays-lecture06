package io.github.patrikalm;


import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {


        exercise4();

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

    public static void exercise4() {

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

    }
}


