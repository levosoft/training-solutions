package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl ic = new IntroControl();

        System.out.println(ic.substractTenIfGreaterThanTen(5));
        System.out.println(ic.substractTenIfGreaterThanTen(25));

        System.out.println(ic.describeNumber(0));
        System.out.println(ic.describeNumber(111));

        System.out.println(ic.greetingToJoe("Joe"));
        System.out.println(ic.greetingToJoe("Donald"));

        System.out.println(ic.calculateBonus(1200000));

        ic.printNumbers(20);
        System.out.println();

        ic.printNumbersBetween(13,33);
        System.out.println();

        ic.printNumbersBetweenAnyDirection(1, 9);
        System.out.println();
        ic.printNumbersBetweenAnyDirection(9, 1);
        System.out.println();

        ic.printOddNumbers(15);

    }
}
