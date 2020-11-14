package math.game;
import java.util.Random;

public class Warrior {
    private String name;
    private Point position;
    private int stamina;
    private double skill;

    Random rnd = new Random();

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        this.stamina = 20 + rnd.nextInt(81);
        this.skill = rnd.nextDouble();
    }

    public Point getPosition() {
        return position;
    }

    public void move(Warrior movement){

    }
}
