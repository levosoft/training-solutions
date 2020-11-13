package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> capsules = new ArrayList<>();

    public static void main(String[] args) {
        Capsules c = new Capsules();

        c.addFirst("blue");
        c.addLast("red");
        c.addLast("white");
        c.addLast("green");
        c.addLast("yellow");
        c.removFirst();
        c.removeLast();
        System.out.println(c.getColors().toString());

    }

    public void addLast(String color){
        capsules.add(color);
    }

    public void addFirst(String color){
        capsules.add(0, color);
    }

    public void removFirst(){
        capsules.remove(0);
    }

    public void removeLast(){
        int lastIndex = capsules.size();
        capsules.remove(lastIndex-1);
    }

    public List<String> getColors(){
        return capsules;
    }
}
