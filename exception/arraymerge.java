package exception;

public class arraymerge {
    public static void main(String[] args) {



        int[] x= {2,10,4,44,1,1 ,6,6,7,8};
        System.out.println(find(x));

//        int[] a = {1,2,3,4,5,6};
//        int[] b = {4,5,6,7,8,9,10,11};
//
//        System.out.println("a = " + Arrays.toString(a));
//        System.out.println("b = " + Arrays.toString(b));
//
//      int x = a.length;
//      int y = b.length;
//
//      int z = x + y;
//
//      int[] c = new int[z];
//
//      for (int i = 0; i < x;i++){
//          c[i] = a[i];
//          int d = 0;
//          for (int j = y; j < z;j++){
//
//              c[j] = b[d];
//              d++;
//
//          }
//      }
//
//        System.out.println("c = " + Arrays.toString(c));
//    }
    }

    private static int find(int[] x) {
      //  int[] x= {2,10,4,7,1,4,6,7,8};

        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {

                if (x[i] == x[j]) {
                     return x[i];
                }

            }

        }
        return 0;


    }
}
