package finalmodifier;

public class CylinderCalculator {
    public double calculateVolume(double r, double h){
        double volume = CircleCalculator.PI * r * r * h;
        return volume;
    }

    public double calculateSurfaceArea(double r, double h){
        double area = (CircleCalculator.PI * 2 * r * h) + (CircleCalculator.PI * r * r) * 2;
        return area;
    }
}
