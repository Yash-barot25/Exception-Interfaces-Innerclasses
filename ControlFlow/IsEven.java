package ControlFlow;

public class IsEven {

    public static void main(String[] args) {

      for (int i = 0; i <= 100; i++){

          isEvenNumber(i);
      }


    }


    private static boolean isEvenNumber(int number){

        if ((number % 2) == 0){
            System.out.print(number + " is an even number:    ");
            return true;
        }

        else {
            System.out.println(number + " is a odd number: ");
            return false;
        }

    }

}
