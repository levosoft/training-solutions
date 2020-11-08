package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        this.meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for(int i = 0; i < this.meetingRooms.size(); i++){
            System.out.println(this.meetingRooms.get(i).getName());
        }
    }

    public void printNamesReverse(){
        for(int i = this.meetingRooms.size(); i < 0; i--){
            System.out.println(this.meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames(){
        for(int i = 0; i < this.meetingRooms.size(); i++){
            if(i % 2 == 0){
                System.out.println(this.meetingRooms.get(i).getName());
            }
        }
    }


}
