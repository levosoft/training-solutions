package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        this.meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        System.out.println("A tárgyalók nevei (sorrendben):");

        for(int i = 0; i < this.meetingRooms.size(); i++){
            System.out.print(this.meetingRooms.get(i).getName() + ", ");
        }
    }

    public void printNamesReverse(){
        System.out.println("A tárgyalók nevei (fordított sorrendben):");

        for(int i = this.meetingRooms.size(); i < 0; i--){
            System.out.print(this.meetingRooms.get(i).getName() + ", ");
        }
    }

    public void printEvenNames(){
        System.out.println("A páros tárgyalók nevei:");

        for(int i = 0; i < this.meetingRooms.size(); i++){
            if(i % 2 == 0){
                System.out.print(this.meetingRooms.get(i).getName() + ", ");
            }
        }
    }

    public void printAreas(){
        for (int i = 0; i < this.meetingRooms.size(); i++) {
            System.out.println("Név: " + this.meetingRooms.get(i).getName());
            System.out.println("Szélesség: " + this.meetingRooms.get(i).getWidth() + " m");
            System.out.println("Hosszúság: " + this.meetingRooms.get(i).getLength() + " m");
            System.out.print("Terület: " + this.meetingRooms.get(i).getArea(this.meetingRooms.get(i).getLength(), this.meetingRooms.get(i).getWidth()) + " m2");
            System.out.println();
        }
    }

    public void printMeetingRoomsWithName(String name){
        System.out.println("Találat azonos nevű tárgyalóra:");

        for(int i = 0; i < this.meetingRooms.size(); i++){
            if(name.equals(this.meetingRooms.get(i).getName())){
                System.out.print(this.meetingRooms.get(i).getName());
            }
        }
    }

    public void printMeetingRoomsContains(String part){
        System.out.println("Találat töredék nevű tárgyalóra:");

        for(int i = 0; i < this.meetingRooms.size(); i++){
            if(this.meetingRooms.get(i).getName().contains(part)){
                System.out.println("Név: " + this.meetingRooms.get(i).getName());
                System.out.println("Szélesség: " + this.meetingRooms.get(i).getWidth() + " m");
                System.out.println("Hosszúság: " + this.meetingRooms.get(i).getLength() + " m");
                System.out.print("Terület: " + this.meetingRooms.get(i).getArea(this.meetingRooms.get(i).getLength(), this.meetingRooms.get(i).getWidth()) + " m2");
                System.out.println();
            }
        }
    }

    public void printAreasLargerThan(int area){
        System.out.println("Találat nagyobb területű tárgyalókra:");
        int calculatedArea;

        for(int i = 0; i < this.meetingRooms.size(); i++){

            calculatedArea = this.meetingRooms.get(i).getWidth() * this.meetingRooms.get(i).getLength();

            if(calculatedArea > area){
                System.out.println("Név: " + this.meetingRooms.get(i).getName());
                System.out.println("Szélesség: " + this.meetingRooms.get(i).getWidth() + " m");
                System.out.println("Hosszúság: " + this.meetingRooms.get(i).getLength() + " m");
                System.out.print("Terület: " + this.meetingRooms.get(i).getArea(this.meetingRooms.get(i).getLength(), this.meetingRooms.get(i).getWidth()) + " m2");
                System.out.println();
            }
        }
    }

}
