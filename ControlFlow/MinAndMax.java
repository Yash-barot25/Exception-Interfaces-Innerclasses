package ControlFlow;

import java.util.Scanner;

public class MinAndMax {

    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number:");

            boolean hasNext = scanner.hasNextInt();

            if (hasNext) {

                int yash01 = scanner.nextInt();

                if (yash01 > max) {

                    max = yash01;

                }

                if (yash01 < min) {
                    min = yash01;
                }


            } else {
                System.out.println("Min : " + min + " Max : " + max);
                break;
            }

        }

    }
}
