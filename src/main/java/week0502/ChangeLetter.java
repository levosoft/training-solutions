package week0502;

public class ChangeLetter {

    public String changeVowels(String text){

        if (text.contains("a") || text.contains("A")){
            text = text.replace("a", "*");
            text = text.replace("A", "*");
        }
        if (text.contains("e") || text.contains("E")){
            text = text.replace("e", "*");
            text = text.replace("E", "*");
        }
        if (text.contains("i") || text.contains("I")){
            text = text.replace("i", "*");
            text = text.replace("I", "*");
        }
        if (text.contains("o") || text.contains("O")){
            text = text.replace("o", "*");
            text = text.replace("O", "*");
        }
        if (text.contains("u") || text.contains("U")){
            text = text.replace("u", "*");
            text = text.replace("U", "*");
        }
        return text;
    }
}
