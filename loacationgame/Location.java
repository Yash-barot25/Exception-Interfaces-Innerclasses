package loacationgame;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final String description;
    private final int locationID;
    private final Map<String,Integer> exits;

    public Location( int locationID,String description) {
        this.description = description;
        this.locationID = locationID;
        exits = new HashMap<>();
    }

    public void addexits(String direction,int locID){
        exits.put(direction,locID);
    }

    public String getDescription() {
        return description;
    }

    public int getLocationID() {
        return locationID;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
