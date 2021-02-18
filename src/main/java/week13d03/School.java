package week13d03;

public class School {

    private String teacher;
    private String subj;
    private String clas;
    private int hours;

    public School(String teacher, String subj, String clas, int hours) {
        this.teacher = teacher;
        this.subj = subj;
        this.clas = clas;
        this.hours = hours;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getSubj() {
        return subj;
    }

    public String getClas() {
        return clas;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
