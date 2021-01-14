package week09d03;

import java.util.List;

public class SantaClaus {

    private List<Person> personList;


    public SantaClaus(List<Person> personList) {
        this.personList = personList;
    }


    public void getThroughChimneys(){

        for (Person person: personList){
            person.setPresent();
        }
    }
}
