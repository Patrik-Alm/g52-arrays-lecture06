package io.github.patrikalm;


public class ArrayExercises {

    public static void main(String[] args) {

        indexOf();

    }

   /* public static void ex1() {

        int[] numbers = {11, 23, 29};

        for (int element : numbers) {

            System.out.print(element + " ");

        }
    } */

    public static void indexOf() {

        int[] numbers = {2, 3, 5};

        for (int i= 0; i < numbers.length; i++) {

            if(numbers[i] == 5) {
                System.out.println("Index position of number 5 is: " + i);
            }
            else if (numbers[numbers.length-1] != 5) {
                System.out.println(-1);

            }
        }
    }

}

