package w3practice;

import java.util.Scanner;

public class AddElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("How many element you wish to enter:");
        int x= scanner.nextInt();
        scanner.nextLine();
        int[] y =  getIntegers(x);
        printArrayElement(y);
        System.out.println("Enter element index of an element you wants to change:) ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter value of a new element");
        int value = scanner.nextInt();
        scanner.nextLine();

        if (index > 0 && index <= x) {

            y[index - 1] = value;
            printArrayElement(y);

        }
        else
        {
            System.out.println("Invalid index number");
        }

    }

    private static int[] getIntegers(int size){
        int[] array = new int[size];

        for (int i = 0;i < array.length;i++){
            System.out.println("Enter element " + (i+1) );
            array[i] = scanner.nextInt();

        }
        return array;
    }

    private static void printArrayElement(int[] array){

        for (int i = 0;i<array.length;i++){


            System.out.println("("+(i + 1)+".) " + array[i]);

        }


    }


}
