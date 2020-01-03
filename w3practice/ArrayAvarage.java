package w3practice;

import java.util.Scanner;

public class ArrayAvarage {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many element you wish to enter:");
        int x= scanner.nextInt();
       int avarage =  getIntegers(x);
        System.out.println("The avarage is " + avarage);

    }

    private static int getIntegers(int size){
        int[] array = new int[size];
         int a = 0;
        for (int i = 0;i < array.length;i++){
            System.out.println("Enter element " + (i+1) );
            array[i] = scanner.nextInt();
            a += array[i];

        }
        int x = a/array.length;
        return x;
    }
}
