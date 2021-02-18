package week16d01.travelAgency;

public class Boat {

    private String name;
    private int maxPassengers;

    public Boat(String name, int maxPassengers) {
        this.name = name;
        this.maxPassengers = maxPassengers;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
