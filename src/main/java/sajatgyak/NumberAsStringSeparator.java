package sajatgyak;

public class NumberAsStringSeparator {


    public static void main(String[] args) {
        String numberAsString1 = "1000000";
        String numberAsString2 = "999999";
        String numberAsString3 = "50000";
        String numberAsString4 = "5000";
        String numberAsString5 = "500";
        String numberAsString6 = "50";
        String numberAsString7 = "10000000";
        String numberAsString8 = "100000000";
        String numberAsString9 = "1000000000";
        String numberAsString10 = "20000000000";


        NumberAsStringSeparator nas = new NumberAsStringSeparator();
        /*System.out.println("tS1: " + nas.ThousandSeparator1(numberAsString1));
        System.out.println("tS2: " + nas.ThousandSeparator1(numberAsString2));
        System.out.println("tS3: " + nas.ThousandSeparator1(numberAsString3));
        System.out.println("tS4: " + nas.ThousandSeparator1(numberAsString4));
        System.out.println("tS5: " + nas.ThousandSeparator1(numberAsString5));
        System.out.println("tS6: " + nas.ThousandSeparator1(numberAsString6));
         */

        /*
        NumberAsStringSeparator nas2 = new NumberAsStringSeparator();
        System.out.println("tS1: " + nas2.ThousandSeparator2(numberAsString1));
        System.out.println("tS2: " + nas2.ThousandSeparator2(numberAsString2));
        System.out.println("tS3: " + nas2.ThousandSeparator2(numberAsString3));
        System.out.println("tS4: " + nas2.ThousandSeparator2(numberAsString4));
        System.out.println("tS5: " + nas2.ThousandSeparator2(numberAsString5));
        System.out.println("tS6: " + nas2.ThousandSeparator2(numberAsString6));
        System.out.println("tS7: " + nas2.ThousandSeparator2(numberAsString7));
         */

        NumberAsStringSeparator nas3 = new NumberAsStringSeparator();
        System.out.println("tS1: " + nas3.ThousandSeparator3(numberAsString1));
        System.out.println("tS2: " + nas3.ThousandSeparator3(numberAsString2));
        System.out.println("tS3: " + nas3.ThousandSeparator3(numberAsString3));
        System.out.println("tS4: " + nas3.ThousandSeparator3(numberAsString4));
        System.out.println("tS5: " + nas3.ThousandSeparator3(numberAsString5));
        System.out.println("tS6: " + nas3.ThousandSeparator3(numberAsString6));
        System.out.println("tS7: " + nas3.ThousandSeparator3(numberAsString7));
        System.out.println("tS8: " + nas3.ThousandSeparator3(numberAsString8));
        System.out.println("tS9: " + nas3.ThousandSeparator3(numberAsString9));
        System.out.println("tS10: " + nas3.ThousandSeparator3(numberAsString10));
    }

    public String ThousandSeparator1(String numberToSeparate){

        StringBuilder sb = new StringBuilder();
        String separatedNumberAsString = "";

        if(numberToSeparate.length()%3==0){
            int j = 1;

            for (int i = 0; i < numberToSeparate.length(); i++) {
                System.out.println(j + ": " + numberToSeparate.charAt(i));

                if(i>=0){
                    if(j==3){
                        sb.append(numberToSeparate.charAt(i) + " ");
                        j=0;
                    }else{
                        sb.append(numberToSeparate.charAt(i));
                    }
                }
                j++;
            }
            separatedNumberAsString = sb.toString();

        }else{
            int j = 0;
            sb.append(numberToSeparate.charAt(0) + " ");

            for (int i = 0; i < numberToSeparate.length(); i++) {
                System.out.println(j + ": " + numberToSeparate.charAt(i));

                if(i>0){
                    if(j==3){
                        sb.append(numberToSeparate.charAt(i) + " ");
                        j=0;
                    }else{
                        sb.append(numberToSeparate.charAt(i));
                    }
                }
                j++;
            }
            separatedNumberAsString = sb.toString();
        }
        return separatedNumberAsString;
    }



    public String ThousandSeparator2(String numberToSeparate){

        StringBuilder sb = new StringBuilder();
        String separatedNumberAsString = "";

        if(numberToSeparate.length()>3){
            if((numberToSeparate.length()%3==0)){
                int j = 1;

                for (int i = 0; i < numberToSeparate.length(); i++) {
                    //System.out.println(j + ": " + numberToSeparate.charAt(i));

                    if(i>=0){
                        if(j==3){
                            sb.append(numberToSeparate.charAt(i) + " ");
                            j=0;
                        }else{
                            sb.append(numberToSeparate.charAt(i));
                        }
                    }
                    j++;
                }
                separatedNumberAsString = sb.toString();

            }else{
                int j = 0;
                if (numberToSeparate.length()!=5){
                    //int j = 0;
                    sb.append(numberToSeparate.charAt(0) + " ");

                    for (int i = 0; i < numberToSeparate.length(); i++) {
                        //System.out.println(j + ": " + numberToSeparate.charAt(i));

                        if(i>0){
                            if(j==3){
                                sb.append(numberToSeparate.charAt(i) + " ");
                                j=0;
                            }else{
                                sb.append(numberToSeparate.charAt(i));
                            }
                        }
                        j++;
                    }
                    separatedNumberAsString = sb.toString();
                }else{
                    sb.append(numberToSeparate.charAt(0));
                    sb.append(numberToSeparate.charAt(1) + " ");

                    for (int i = 0; i < numberToSeparate.length(); i++) {
                        //System.out.println(j + ": " + numberToSeparate.charAt(i));

                        if(i>1){
                            sb.append(numberToSeparate.charAt(i));
                        }
                        j++;
                    }
                    separatedNumberAsString = sb.toString();
                }
            }
        }else{
            separatedNumberAsString = numberToSeparate;
        }

        return separatedNumberAsString;
    }


    public String ThousandSeparator3(String numberToSeparate){

        StringBuilder sb = new StringBuilder();
        String separatedNumberAsString = "";
        int j = 0;

       switch (numberToSeparate.length()){
            case 1:
               separatedNumberAsString = numberToSeparate;
               break;
           case 2:
               separatedNumberAsString = numberToSeparate;
               break;
           case 3:
               separatedNumberAsString = numberToSeparate;
               break;
           case 4:
               sb.append(numberToSeparate.charAt(0) + " ");
               sb.append(numberToSeparate.charAt(1));
               sb.append(numberToSeparate.charAt(2));
               sb.append(numberToSeparate.charAt(3));
               separatedNumberAsString = sb.toString();
               break;
           case 5:
               sb.append(numberToSeparate.charAt(0));
               sb.append(numberToSeparate.charAt(1) + " ");
               sb.append(numberToSeparate.charAt(2));
               sb.append(numberToSeparate.charAt(3));
               sb.append(numberToSeparate.charAt(4));
               separatedNumberAsString = sb.toString();
               break;
           case 6:
               sb.append(numberToSeparate.charAt(0));
               sb.append(numberToSeparate.charAt(1));
               sb.append(numberToSeparate.charAt(2) + " ");
               sb.append(numberToSeparate.charAt(3));
               sb.append(numberToSeparate.charAt(4));
               sb.append(numberToSeparate.charAt(5));
               separatedNumberAsString = sb.toString();
               break;
           case 7:
               sb.append(numberToSeparate.charAt(0) + " ");
               sb.append(numberToSeparate.charAt(1));
               sb.append(numberToSeparate.charAt(2));
               sb.append(numberToSeparate.charAt(3) + " ");
               sb.append(numberToSeparate.charAt(4));
               sb.append(numberToSeparate.charAt(5));
               sb.append(numberToSeparate.charAt(6));
               separatedNumberAsString = sb.toString();
               break;
           case 8:
               sb.append(numberToSeparate.charAt(0));
               sb.append(numberToSeparate.charAt(1) + " ");
               sb.append(numberToSeparate.charAt(2));
               sb.append(numberToSeparate.charAt(3));
               sb.append(numberToSeparate.charAt(4) + " ");
               sb.append(numberToSeparate.charAt(5));
               sb.append(numberToSeparate.charAt(6));
               sb.append(numberToSeparate.charAt(7));
               separatedNumberAsString = sb.toString();
               break;
           case 9:
               sb.append(numberToSeparate.charAt(0));
               sb.append(numberToSeparate.charAt(1) );
               sb.append(numberToSeparate.charAt(2)+ " ");
               sb.append(numberToSeparate.charAt(3));
               sb.append(numberToSeparate.charAt(4) );
               sb.append(numberToSeparate.charAt(5)+ " ");
               sb.append(numberToSeparate.charAt(6));
               sb.append(numberToSeparate.charAt(7));
               sb.append(numberToSeparate.charAt(8));
               separatedNumberAsString = sb.toString();
               break;
           case 10:
               sb.append(numberToSeparate.charAt(0) + " ");
               sb.append(numberToSeparate.charAt(1));
               sb.append(numberToSeparate.charAt(2));
               sb.append(numberToSeparate.charAt(3)+ " ");
               sb.append(numberToSeparate.charAt(4) );
               sb.append(numberToSeparate.charAt(5));
               sb.append(numberToSeparate.charAt(6)+ " ");
               sb.append(numberToSeparate.charAt(7));
               sb.append(numberToSeparate.charAt(8));
               sb.append(numberToSeparate.charAt(9));
               separatedNumberAsString = sb.toString();
               break;
           case 11:
               sb.append(numberToSeparate.charAt(0));
               sb.append(numberToSeparate.charAt(1) + " ");
               sb.append(numberToSeparate.charAt(2));
               sb.append(numberToSeparate.charAt(3));
               sb.append(numberToSeparate.charAt(4)+ " ");
               sb.append(numberToSeparate.charAt(5));
               sb.append(numberToSeparate.charAt(6));
               sb.append(numberToSeparate.charAt(7)+ " ");
               sb.append(numberToSeparate.charAt(8));
               sb.append(numberToSeparate.charAt(9));
               sb.append(numberToSeparate.charAt(10));
               separatedNumberAsString = sb.toString();
               break;
           default:
               break;
        }

        return separatedNumberAsString;
    }


}
