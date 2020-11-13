package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> titles = new ArrayList<>();

    public static void main(String[] args) {
        Books books = new Books();

        books.add("Arany ember");
        books.add("Téli berek");
        books.add("A láthatatlan ember");
        books.add("Rokonok");
        books.add("Télapó itt van");

        System.out.println(books.findAllByPrefix("Tél").toString());

        System.out.println(books.getTitles().toString());
    }

    public void add(String title){
        titles.add(title);
    }

    public List<String> findAllByPrefix(String prefix){
        List<String> matchingTitle = new ArrayList<>();

        int i = prefix.length();

        for (String title: titles){
            if(title.substring(0,i).equals(prefix)){
                matchingTitle.add(title);
            }
        }
        return matchingTitle;
    }

    public List<String> getTitles(){
        return titles;
    }

}
