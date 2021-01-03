package week08d01;

public class Robot {

    /*
    * A feladatban egy robot mozgását fogjuk szimulálni. Képzelj el egy koordináta rendszert, ahol a robot az origóban van.
    * A robot négy irányba képes mozogni fel, le, balra és jobbra. A week08d01.Robot osztályban írj egy move() metódust ami egy karaktersorozatot vár.
    * pl: FFLLLLLBBBBJJJJJJJ, ahol az F = fel, L=le, B=bal, J=jobb. A metódus visszatérési értéke legyen a robot mozgás utáni pozíciója.
    * A feladat szabadon bővíthető osztályokkal és metódusokkal. Bónusz kiegészítés, hogyha más karaktert is tartalmaz a paraméter String nem csak a FLBJ valamelyikét,
    * akkor dobjunk IllegalArgumentExceptiont!*/


    private Position position;

    public Robot(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public Position move(String input){

        int x = 0;
        int y = 0;

        for (int i = 0; i <= input.length()-1; i++) {
             switch (input.charAt(i)){
                 case 'F':
                     y = y + 1;
                     break;
                 case 'L':
                     y = y - 1;
                     break;
                 case 'J':
                     x = x + 1;
                     break;
                 case 'B':
                     x = x - 1;
                     break;
             }
        }

        Position position = new Position(x, y);

        return position;
    }
}
