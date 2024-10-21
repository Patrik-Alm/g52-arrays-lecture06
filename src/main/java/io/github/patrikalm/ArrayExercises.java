package io.github.patrikalm;


import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {


        exercise9();

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

   /* public static void exercise6() {

        int [] values = {43, 5, 23, 17, 2, 14};
        double sum =0;

        for (int element : values) {

            sum = sum + element;

        }

        DecimalFormat df = new DecimalFormat("#.#");

        System.out.println("Average is: " + df.format(sum/ values.length));

    } */


       /*  public static void exercise7() {

            int [] numbers = {1, 2, 4, 7, 9, 12};

            System.out.print("Array: ");

            for (int element : numbers) {

                System.out.print(element + " ");
            }

            System.out.println();
            System.out.print("Odd array: ");

            for (int element : numbers) {

                if (element % 2 != 0) {

                    System.out.print(element + " ");
                }
            } */

       /* public static void exercise8() {

            int [] duplicatedArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};

            System.out.print("Array: ");
            printArray(duplicatedArray);

            for (int i = 0; i < duplicatedArray.length; i++) {

                for (int j = i+1; j < duplicatedArray.length; j++) {

                    if (duplicatedArray[i] == duplicatedArray[j]) {

                            duplicatedArray[j] = 0;
                    }
                }
            }

            System.out.print("Odd Array: ");
            printArray(duplicatedArray);
        }

    public static void printArray(int [] arrayToPrint) {

        for (int number : arrayToPrint) {

            if (number != 0) {

                System.out.print(number + " ");

            }
        }
        System.out.println();
    } */

    public static void exercise9() {

        double [] numbers = {1.3, 2.7, 4.9, 1.7};

        double [] numbersToAdd = {2.3, 5.5, 8.9};

        System.out.println();
        System.out.print("Existing numbers: ");
        System.out.println(Arrays.toString(numbers));

        System.out.print("Numbers to add: ");
        System.out.println(Arrays.toString(numbersToAdd));

        double [] newNumbersArray = Arrays.copyOf(numbers, numbers.length + numbersToAdd.length);

        for (int i = 0; i < numbersToAdd.length; i++) {

            newNumbersArray [i + numbers.length] = numbersToAdd[i];
        }

        System.out.println();
        System.out.print("New number array: ");
        System.out.println(Arrays.toString(newNumbersArray));

    }


}


