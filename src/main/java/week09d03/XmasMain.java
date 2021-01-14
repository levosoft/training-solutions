package week09d03;

import java.util.Arrays;

public class XmasMain {

    public static void main(String[] args) {

        Person p1 = new Person("Gizike", 5);
        Person p2 = new Person("Tomi", 17);
        Person p3 = new Person("Ildikó", 38);
        Person p4 = new Person("Zolika", 3);
        Person p5 = new Person("Karcsibácsi", 74);


        SantaClaus Mikulas = new SantaClaus(Arrays.asList(p1,p2,p3,p4,p5));

        Mikulas.getThroughChimneys();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
    }
}
