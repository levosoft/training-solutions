package introdate;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance("Bon Jovi", 1998,4,20,20,00,22,00);

        System.out.println(getInfo(performance));
    }

    public static String getInfo(Performance performance){
        String performanceInfo = performance.getArtist() + " " + performance.getDate() + " " + performance.getStartTime() + "-" + performance.getEndTime();
        return performanceInfo;
    }
}
