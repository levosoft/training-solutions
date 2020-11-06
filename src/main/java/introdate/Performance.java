package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Performance {
    private String artist;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    public Performance(String artist, int year, int month, int day, int startHour, int startMin, int endHour, int endMin) {
        this.artist = artist;
        this.date = LocalDate.of(year, month, day);
        this.startTime = LocalTime.of(startHour, startMin);
        this.endTime = LocalTime.of(endHour, endMin);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }


}
