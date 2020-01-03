package interface_abstract_inner.inner_class;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int currentGear = 0;
    private int maxGear;
    private boolean cluthIsIn;


    public GearBox(int maxGear) {
        this.maxGear = maxGear;
        gears = new ArrayList<>();
//        Gear nutural = new Gear(0,0.0);
//        this.gears.add(nutural);

        for (int i = 0;i < maxGear;i++){
            addGear(i,i * 5.3);
        }
    }

    public void clutchIsIn(boolean in){
        this.cluthIsIn = in;
    }

    public void addGear(int number,double ratio){

        if (number>=0 && number < maxGear){
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int number) {
        if (number >= 0 && number < this.gears.size() && (this.cluthIsIn)) {
            System.out.println("Gear is changed to " + number + " Gear:");
            this.currentGear = number;
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;

        }
    }
        public double wheelSpeed(int revs){

        if (cluthIsIn){
            System.out.println("SCREAM>>>>>huh huh huh huh huh");
            return  0.0;
        }
        return revs * this.gears.get(currentGear).getRatio();
    }

    public class Gear{


        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

//        public double driveSpeed(int revs){
//            return revs * this.ratio;
//        }
    }
}
