package introjunit;

import java.util.List;

public class Trainer {
    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNameUppercase() {
        return name.toLowerCase();
    }

    public static void main(String[] args) {
        String name = "Joe";
        String spouse = "Jean";
        switch(name) {
            case "John":
                spouse = "Eve";
            case "Joe":
                spouse = "Sarah";
            case "Jake":
                spouse = "Mary";
        }
        System.out.println(spouse);

        int number = 5;
        while(number < 20) {
            number += 3;
        }
        System.out.println(number);


        for(int i = 2; i < 5; i++) {
            System.out.println("in");
        }


        Trainer trainer2 = new Trainer("teszt");

        System.out.println(trainer2.findPerfectMatch(5));


    }

    public String findPerfectMatch(int number) {
        List<String> words = List.of("ninetyeight", "five", "eight", "ten", "thirteen");
        String perfect = null;

        for(String word: words) {
            if(Math.abs(word.length() - number) > number) {
                continue;
            }
            if(word.length() == number) {
                perfect = word;
                break;
            }
            int newLength = word.length() > number ? number : word.length();
            perfect = word.substring(0, newLength);
        }

        return perfect;
    }
}

