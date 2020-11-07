package introcontrol;

public class IntroControl {
    public int substractTenIfGreaterThanTen(int number){
        if(number <= 10){
            return number;
        }else{
            return number - 10;
        }
    }

    public String describeNumber(int number){
        if(number == 0){
            return "zero";
        }else{
            return "not zero";
        }
    }

    public String greetingToJoe(String name){
        if(name.equals("Joe")){
            return "Hello Joe!";
        }else{
            return "";
        }
    }

    public int calculateBonus(int sale){
        double bonus = 0;

        if(sale > 1_000_000){
            bonus = sale * 0.1;
        }else{
            bonus = 0;
        }
        return (int) bonus;
    }

    /*public int calculateConsumption(int prev, int next){

    }*/

    public void printNumbers(int max){
        for (int i = 0; i <= max; i++) {
            System.out.print(i + ", ");
        }
    }

    public void printNumbersBetween(int min, int max){
        for (int i = min; i <= max; i++) {
            System.out.print(i + ", ");
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (b > a) {
            for (int i = a; i <= b; i++) {
                if (i > 0) {
                    System.out.print(i % 2 == 0 ? i : " ");
                }
            }
        } else {
            for (int i = a; i >= b; i--) {
                if (i > 0) {
                    System.out.print(i % 2 == 0 ? i : " ");
                }
            }
        }
    }


}
