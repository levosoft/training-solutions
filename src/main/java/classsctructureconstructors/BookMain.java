package classsctructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Jókai Mór", "Aranyember");
        book.setRegNumber("0011223344");

        System.out.println("Szerző:" + book.getAuthor());
        System.out.println("Cím:" + book.getTitle());
        System.out.println("Regisztrációs szám:" + book.getRegNumber());
    }

}
