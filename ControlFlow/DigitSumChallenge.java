package ControlFlow;

import java.util.Scanner;

public class DigitSumChallenge {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number :");

        boolean hasNext = scanner.hasNextInt();
        if (hasNext) {

            int yash = sumDigit(scanner.nextInt());
            if (!(yash == -1)) {
                System.out.println(yash);
            } else {

                System.out.println("Invalid input");

            }
        } else
        {
            System.out.println("Invalid input");
        }

}

    private static int sumDigit(int digit) {

        int sum = 0;

        if (digit <= 9) {

            return -1;

        } else {

            while (digit > 0) {

                int x = digit % 10;

                digit = digit / 10;

                sum += x;

            }

            return sum;


        }


    }

}
