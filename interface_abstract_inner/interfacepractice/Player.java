package interface_abstract_inner.interfacepractice;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable{

private String name;
private int hitpoints;
private int strength;
private String weapon;


    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = "AK-47";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(0,this.name);
        list.add(1,"" + this.hitpoints);
        list.add(2,""+ this.strength);
        list.add(this.weapon);

        return list;

    }

    @Override
    public void read(List<String> list) {

       if (list != null && list.size() > 0){

           this.name = list.get(0);
           this.hitpoints = Integer.parseInt( list.get(1));
           this.strength = Integer.parseInt( list.get(2));
           this.weapon = list.get(3);


       }

    }
}
