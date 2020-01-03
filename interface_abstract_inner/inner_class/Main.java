package interface_abstract_inner.inner_class;

public class Main {
    public static void main(String[] args) {

          GearBox mclaran = new GearBox(6);

        GearBox.Gear gear = mclaran.new Gear(5,55);

         mclaran.clutchIsIn(true);
         mclaran.changeGear(3);
         mclaran.clutchIsIn(false);
         mclaran.clutchIsIn(true);
         mclaran.changeGear(4);
        System.out.println(mclaran.wheelSpeed(10));
//        mclaran.clutchIsIn(true);
//        mclaran.changeGear(3);
//        System.out.println(mclaran.wheelSpeed(55));

    }
}
