package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Mark> marks = new ArrayList<>();
    private String name;

    public double calculateAverage(){
        double average = 0.0;
        return average;
    }

    public double calculateSubjectAverage(Subject subjectName){
        double subjectAverage = 0.0;
        return subjectAverage;
    }

    /*public boolean equals(Object object) {
        boolean equals = false;
        return equals;
    }*/

    public String getName() {
        return name;
    }

    public void grading(Mark mark){

    }

    private boolean isEmpty(String string){
        boolean empty = false;
        return empty;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
