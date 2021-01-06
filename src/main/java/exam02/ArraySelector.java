package exam02;

public class ArraySelector {

    public String selectEvens(int[] intArray){

        String evens = "";

        if(intArray.length == 0){
            return evens;
        }else if (intArray.length == 1 || intArray.length == 2){
            evens = "[" + intArray[0] + "]";
            return evens;
        }else {

            for (int i = 0; i < intArray.length; i++) {
                if(i % 2 == 0){
                    evens = evens + intArray[i] + ", ";
                }
            }

            evens = evens.substring(0, evens.length() - 2);

            evens = "[" + evens + "]";
            return evens;
        }
    }
}
