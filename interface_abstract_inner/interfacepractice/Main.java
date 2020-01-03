package interface_abstract_inner.interfacepractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ISavable yash = new Player("yashu",50,100);
        System.out.println(yash.toString());
        saveObject(yash);
        //loadObject(yash);
       // System.out.println(yash.toString());



        Monster dipo = new Monster("Dipo dando",100,200);
        System.out.println(dipo.toString());
        saveObject(dipo);
        loadObject(dipo);
        ((Monster) dipo).getHitPoints();
        System.out.println(dipo.toString());


    }


    private static ArrayList<String> readValue(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        ArrayList<String> myList = new ArrayList<>();

        System.out.println("Enter your choice...\npress:- \n (1.) To Quit.\n (2.) To enter a string.");
        int counter = 0;

        while (!flag){
            System.out.println("Your choice...");
            int value = scanner.nextInt();
            scanner.nextLine();

            switch (value){
                case 1:
                    System.out.println("BYE - BYE");
                    flag = true;
                    break;
                case 2:
                    System.out.println("Enter A String:-");
                    String stringValue = scanner.nextLine();
                    myList.add(counter,stringValue);
                    counter++;
                    break;
            }
        }
        return myList;
    }


    private static void saveObject(ISavable objectToSave) {

        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    private static  void loadObject(ISavable objectToLoad){
        ArrayList<String> list = readValue();
        objectToLoad.read(list);
    }

    private void test(){
    }

}
