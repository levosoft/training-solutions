package sajatgyak;

public class StringPractice {

    public static void main(String[] args) {

        //SPLIT
        String name = "John:Doe";
        String[] names = name.split(":");

        System.out.println(names[0]);
        System.out.println(names[1]);


        //REPEAT
        System.out.println("*".repeat(3));
    }
}
