package week16d01.travelAgency;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger){
        if (boat.getMaxPassengers() == passengers.size()){
            throw new IllegalArgumentException("Overbooking!");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger){
        double price = passenger.getCruiseClass().getMultiplier() * basicPrice;
        return price;
    }

    public Passenger findPassengerByName(String name){

        Passenger findedPassenger = null;       //Nem null-t kell dobni, hanem inkább exception-t

        for (Passenger p : passengers){
            if(p.getName().equals(name)){
                findedPassenger = p;
            }
        }

        return findedPassenger;
    }

    public List<String> getPassengerNamesOrdered(){

        List<String> list = List.of("p1", "p2");
        return list;
    }

    public double sumAllBookingsCharged(){

        double sum = 0.0;
        for (Passenger passenger : passengers){
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }


//    public Map<CruiseClass, Integer> countPassengerByClass() {
//
//
//    }
}
