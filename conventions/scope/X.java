package conventions.scope;

public class X {

    private  int x;


    public X() {
    }

    public void x(int x){
        for (this.x = 1;x < 13; x++){
            System.out.println(x + " * " + this.x + " = " + this.x * x);
        }
    }
}
