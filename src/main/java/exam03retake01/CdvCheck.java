package exam03retake01;

public class CdvCheck {

    public boolean check(String s) {

        int lastDigit;
        int charToInt;
        int sum = 0;
        int validator;

        lastDigit = Integer.parseInt(s.substring(8,9));

        for (int i = 0; i <= s.length()-1; i++) {
            charToInt = s.charAt(i) - '0';
            sum += charToInt * (i+1);
        }

        int dividedInt = sum % 11;

        if(s.length() > 10 || s.length() < 10){
            throw new IllegalArgumentException("The parameter is not correct!");
        }
        else if(s.contains("a")){
            throw new IllegalArgumentException("The parameter is not correct!");
        }
        else{
            if(dividedInt == lastDigit){
                return true;
            }else{
                return false;
            }
        }
    }

}
