package ControlFlow;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        int sum = 0;



            for (int i = 1; i <= 10; i++) {

                System.out.println("Enter number #" + i);

                boolean yashu = scanner.hasNextInt();

                if (yashu) {


                    int yash = scanner.nextInt();
//                    scanner.next();
                    sum += yash;


                } else {

                    System.out.println("Invalid input:)");
                    scanner.next();

                     i--;


                }
            }

        System.out.println("Sum of all entered numbers is :" + sum);

    }
}