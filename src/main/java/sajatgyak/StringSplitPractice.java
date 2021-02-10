package sajatgyak;

public class StringSplitPractice {

    public static void main(String[] args) {

        String name = "John:Doe";
        String[] names = name.split(":");

        System.out.println(names[0]);
        System.out.println(names[1]);
    }
}
