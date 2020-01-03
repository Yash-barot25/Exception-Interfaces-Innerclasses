package interface_abstract_inner.annonomous_class_local_class;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static   Button btn = new Button("SUBMIT");
    public static void main(String[] args) {
//
//         class ClickListener implements Button.OnClickListener{
//
//             public ClickListener() {
//                 System.out.println("Im attached:");
//             }
//
//             @Override
//             public void onClick(String title) {
//                 System.out.println(title + " is clicked:");
//             }
//
//         }
         btn.setOnClickListener(new Button.OnClickListener() {
             @Override
             public void onClick(String title) {
                 System.out.println(title + " is clicked");
             }
         });
         print();

    }
    private static  void print(){
        boolean flag  = false;
        System.out.println("press...\n 0. To Quit.\n 1. To Click button");
        while (!flag) {
            int x = scanner.nextInt();
            scanner.nextLine();

            switch (x) {
                case 0:
                    flag = true;
                    break;
                case 1:
                    btn.onClick();
                    break;

            }

        }
    }
}
