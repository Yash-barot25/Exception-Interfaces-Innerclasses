package contactlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Contact myContact = new Contact("yashu",64712535,"yc@gmail.com");
        System.out.println( myContact.toString());
        saveObject(myContact);
        loadObject(myContact);
        System.out.println( myContact);


        ISavable myInfo = new Info("yashu",82,"yy");
        ((Info) myInfo).getName();





    }

    private static ArrayList<String> insert() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;


        System.out.println("Enter your choice...\npress\n (1.) To quit.\n (2.) To Insert info.");
        int count = 0;
        while (!flag) {
            System.out.println("Enter your option:-");
            int value = scanner.nextInt();
            scanner.nextLine();


            switch (value) {


                case 1:
                    System.out.println("GOOD BYE:)");
                    flag = true;
                    break;

                case 2:
                    System.out.println("Enter a String:");
                    String x = scanner.nextLine();
                    list.add(count, x);
                    count++;
                    break;


            }
        }

    return list;
    }


    private static void saveObject(ISavable objectToSave){

        for (int i =0; i < objectToSave.write().size();i++){
            System.out.println("saving "  + objectToSave.write().get(i) + " to storage device:");
        }
    }


    private static void loadObject(ISavable objectToLoad){

        ArrayList<String> myList = insert();
        objectToLoad.read(myList);



    }
























}
