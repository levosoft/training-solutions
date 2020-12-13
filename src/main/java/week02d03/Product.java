package week02d03;

public class Product {

    /*Írj egy Product oszályt String name és String code attribútumokkal! Legyen egy konstruktora a két attribútummal!
    Legyen egy areTheyEqual() metódusa, mely kap egy másik Product példányt, és eldönti, hogy azonos-e az adott példánnyal. Két termék akkor egyezik, ha a nevük megegyezik.
    Bónusz: szigorúbb egyelőség a feltételre: a két termék kódjának hosszának különbsége maximum egy karakter lehet.*/

    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public boolean areTheyEqual(Product product){
        boolean answer;

        if(this.getName() == product.getName()){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Product termek1 = new Product("villanykörte", "0001");
        Product termek2 = new Product("led izzó", "0002");
        Product termek3 = new Product("villanykörte", "0003");


        System.out.println(termek1.areTheyEqual(termek3));
        System.out.println(termek2.areTheyEqual(termek3));

    }
}
