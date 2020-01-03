package loacationgame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are at the front of your computer:"));
        locations.put(1, new Location(1, "You are at 430 mcmurchy"));
        locations.put(2, new Location(2, "You are at playground"));
        locations.put(3, new Location(3, "You are getting your tiffin"));
        locations.put(4, new Location(4, "You are at tuck shop"));
        locations.put(5, new Location(5, "You are at shoppers drug mart"));

        locations.get(1).addexits("N", 3);
        locations.get(1).addexits("S", 2);
        locations.get(1).addexits("E", 4);
        locations.get(1).addexits("W", 5);
        locations.get(1).addexits("Q", 0);

        locations.get(2).addexits("N", 1);
        locations.get(2).addexits("E", 4);
        locations.get(2).addexits("Q", 0);

        locations.get(3).addexits("S", 1);
        locations.get(3).addexits("Q", 0);

        locations.get(4).addexits("N", 3);
        locations.get(4).addexits("S", 2);
        locations.get(4).addexits("Q", 0);

        locations.get(5).addexits("E", 1);
        locations.get(5).addexits("Q", 0);

        Map<String,String> direction = new HashMap<>();
        direction.put("QUIT","Q");
        direction.put("NORTH","N");
        direction.put("SOUTH","S");
        direction.put("WEST","E");
        direction.put("EAST","W");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits...");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String yash = scanner.nextLine().toUpperCase();
            if (yash.length() > 1){
                String[] yashu = yash.split(" ");
                for (String key : yashu){
                    if (direction.containsKey(key)){
                        yash = direction.get(key);
                        break;
                    }
                }
            }

            if (exits.containsKey(yash)) {
                loc = exits.get(yash);
            } else {
                System.out.println("You can't go in that direction");
            }


        }
    }
}
