package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance();

        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int onlyKM = (int) distance.getDistanceInKm();
        System.out.println(onlyKM);
    }


}
