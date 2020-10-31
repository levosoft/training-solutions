package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {

        Note note = new Note();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a nevet, témakört, jegyzetet:");
        note.setName(scanner.nextLine());
        note.setTopic(scanner.nextLine());
        note.setText(scanner.nextLine());

        //A jegyzet kiiratása a bekért adatok alapján
        System.out.println(note.getNoteText(note.getName(), note.getTopic(), note.getText()));
    }
}
