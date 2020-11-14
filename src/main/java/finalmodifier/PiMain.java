package finalmodifier;
import static finalmodifier.CircleCalculator.PI;

public class PiMain {
    public static void main(String[] args) {

        CircleCalculator circle = new CircleCalculator();
        CylinderCalculator cylinder = new CylinderCalculator();

        System.out.println(PI);
        System.out.println(circle.calculateArea(2.5));
        System.out.println(circle.calculatePerimeter(2.5));
        System.out.println(cylinder.calculateVolume(2.5, 4.0));
        System.out.println(cylinder.calculateSurfaceArea(2.5, 4.0));
    }
}
