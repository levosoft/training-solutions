package math.game;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point otherPoint){
        double dist = Math.sqrt(Math.pow(otherPoint.x - this.x,2) + Math.pow(otherPoint.y - this.y,2));
        return dist;
    }
}
