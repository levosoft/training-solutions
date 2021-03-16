package week20d02;

public class SoftWareMain {

    public static void main(String[] args) {



        OfficeSoftware officeSoftware = new OfficeSoftware("oSoft", 10);
        DeveloperSoftware developerSoftware = new DeveloperSoftware("dSoft", 10);

        officeSoftware.increasePrice();
        developerSoftware.increasePrice();

        System.out.println(officeSoftware.getPrice());
        System.out.println(developerSoftware.getPrice());

    }
}
