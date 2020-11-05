package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;

        message = message + 444;

        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println(b);
        System.out.println(c);

        String firstEmpty = "";
        String secondEmpty = "";
        String concatEmpty = firstEmpty + secondEmpty;
        System.out.println(concatEmpty);
        System.out.println(concatEmpty.length());

        String text = "Abcde";
        System.out.println(text.length());
        System.out.println(text.substring(0,1) + "," + text.substring(2,3));
        System.out.println(text.charAt(0) + "," + text.charAt(2)); //A charAt metódus nem volt az anyagban
        System.out.println(text.substring(0,2));

    }
}
