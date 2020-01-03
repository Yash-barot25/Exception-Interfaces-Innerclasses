package w3practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementSum {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many element you wish to enter:");
        int x= scanner.nextInt();
       int[] y =  getIntegers(x);
        int sum = countArrayElement(y);
        System.out.println("Sum of array element is " + sum);


    }

    private static int[] getIntegers(int size){
        int[] array = new int[size];

        for (int i = 0;i < array.length;i++){
            System.out.println("Enter element " + (i+1) );
            array[i] = scanner.nextInt();

        }
        return array;
    }

    private static int countArrayElement(int[] array){
        int x = 0;
        int[] myArray = Arrays.copyOf(array,array.length);
        for (int i = 0; i < myArray.length;i++){

            x += myArray[i];


        }
        return x;

    }
}
