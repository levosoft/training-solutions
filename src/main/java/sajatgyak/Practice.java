package sajatgyak;

import exam03retake02.State;
import exam03retake02.Todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

public class Practice {

    private List<Todo> todos = new ArrayList();



    public static void main(String[] args) {

        //Lista rendezése ABC-sorrendben (helyi beállításoknak megfelelően)
        List<String> nevek = Arrays.asList("Cecil", "Ádám", "Béla");

        Collections.sort(nevek, Collator.getInstance());
        System.out.println(nevek);


        //Lista rendezése Comparator-ral (Anonymus belső osztály!) (Integer)
        List<Integer> szamok = Arrays.asList(3,2,1,4);

        szamok.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(szamok);


        //Lista rendezése Comparatorral (Anonymus belső osztály!) (String)
        List<Student> tanulok = Arrays.asList(new Student("Zsoca", 35), new Student("Bonca", 34), new Student("Matyi", 33));

//        tanulok.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        System.out.println(tanulok);


        //Lista rendezése Lambda kifejezéssel (Anonymus belső osztály nélkül!!!)
        tanulok.sort((tanulok1, tanulok2) -> tanulok1.getName().compareTo(tanulok2.getName()));
        System.out.println(tanulok);


        //Fájl beolvasás Classpath-ról (resources/package)
        BufferedReader reader = new BufferedReader(new InputStreamReader(Practice.class.getResourceAsStream("myFile.txt")));
        System.out.println(new Practice().getReader(reader));

    }

    //File olvasása soronként - Paraméter reader!
    public List<String> getReader(BufferedReader reader) {

        List<String> myList = new ArrayList<>();
        String id;
        String line;

        try(reader){
            while ((line = reader.readLine()) != null){
                if(line.contains("ID")){
                    String[] datas = line.split(":");
                    myList.add(datas[1]);
                }
            }
            return myList;
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }


    //Törlés egy listából ciklusban
    public void deleteCompleted() {

        List<Todo> toRemove = new ArrayList<>();

        for (Todo todo: todos) {
            if (todo.getState() == State.COMPLETED) {
                toRemove.add(todo);
            }
        }
        todos.removeAll(toRemove);
    }

}
