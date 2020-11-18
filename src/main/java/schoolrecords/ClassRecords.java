package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public String getClassName() {
        return className;
    }

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student name){
        boolean studentAdded = false;
        return studentAdded;
    }

    public double calculateClassAverage(){
        double classAverage = 0.0;
        return classAverage;
    }

    public double calculateClassAverageBySubject(Subject subjectName){
        double classAverageBySubject = 0.0;
        return classAverageBySubject;
    }

    public Student findStudentByName(String name){
        Student student = null;
        return student;
    }

    private boolean isEmpty(String string){
        boolean empty = false;
        return empty;
    }

    public String listStudentNames(){
        String studentNames = "";
        return studentNames;
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> studyResults = null;
        return studyResults;
    }

    public boolean removeStudent(Student name){
        boolean studentRemoved = false;
        return studentRemoved;
    }

    public Student repetition(){
        Student student = null;
        return student;
    }
}
