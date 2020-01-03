package w3practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many element you wish to enter:");
        int x= scanner.nextInt();
        int[] intArray = getIntegers(x);
        String[] stringArray = getString(x);
        System.out.println("The integer array entered by user is : " + Arrays.toString(intArray) );
        System.out.println("The String array entered by user is : " + Arrays.toString(stringArray) );
        Arrays.sort(intArray);
        Arrays.sort(stringArray);
        System.out.println("The integer array after sorting is : " + Arrays.toString(intArray) );
        System.out.println("The String array after sorting is : " + Arrays.toString(stringArray) );

    }

    private static int[] getIntegers(int size){
        System.out.println("Enter an integers:");
        int[] array = new int[size];

        for (int i = 0;i < array.length;i++){
            System.out.println("Enter element " + (i+1) );
            array[i] = scanner.nextInt();

        }
        scanner.nextLine();
        return array;
    }

    private static String[] getString(int size){
        System.out.println("Enter a Strings");
        String[] array = new String[size];

        for (int i = 0;i < array.length;i++){
            System.out.println("Enter element " + (i+1) );
            array[i] = scanner.nextLine();

        }
        return array;
    }


}
