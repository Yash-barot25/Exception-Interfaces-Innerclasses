package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int yash = getIntEAFP();
        System.out.println("yash is " + yash);


    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        return scanner.nextInt();
    }

    private static int getIntLBYL() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        boolean flag = true;
        String yash = scanner.next();

        for (int i = 0; i < yash.length(); i++) {
            if (!Character.isDigit(yash.charAt(i))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return Integer.parseInt(yash);
        }
        return 0;

    }

    private static int getIntEAFP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }

    }
}