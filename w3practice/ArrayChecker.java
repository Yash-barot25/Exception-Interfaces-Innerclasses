package w3practice;

import java.util.Scanner;

public class ArrayChecker {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many element you wish to enter:");
        int x= scanner.nextInt();
        int[] myArray = getIntegers(x);
        System.out.println("Enter an element you wish to check:");
        int y= scanner.nextInt();
boolean flag = true;

        int count = -1;
        for (int i : myArray){
            count++;
            if (y == i){
                System.out.println("Element " + i + " is exist in the array at index " + count );
                flag = false;
                break;
            }


        }
        if (flag){
        System.out.println("Sorry the element isn't found in the array");}

    }

    private static int[] getIntegers(int size){
        int[] array = new int[size];

        for (int i = 0;i < array.length;i++){
            System.out.println("Enter element " + (i+1) );
            array[i] = scanner.nextInt();

        }
        return array;
    }
}
