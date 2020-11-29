package week05d05;

public class User {

    /*Készíts egy osztályt week05d05.User néven, melynek van egy firstName (String), egy lastName (String) és egy email (String) mezője.
    Legyen ellenőrzés az User konstruktorában, mely hibát jelez, ha nincs @ és . (pont) az e-mail cimben!
    Készíts egy metódust is getFullName névvel, mely visszaadja a firstName és a lastName változókat összefűzve. Legyen közöttük egy whitespace (" ").
    Bónusz feladat: írjunk teszteket*/


    private String firstName;
    private String lastName;
    private String email;


    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;

        if(email != null){
            if(email.contains("@")){
                if(email.contains(".")){
                    if((!email.startsWith("@")) && (!email.endsWith("."))){
                        if(email.indexOf(".") - email.indexOf("@") > 1){
                            this.email = email;
                        }else {
                            throw new IllegalArgumentException("Nem megfelelő e-mail cím!");
                        }
                    }else{
                        throw new IllegalArgumentException("Nem megfelelő e-mail cím!");
                    }
                }else{
                    throw new IllegalArgumentException("Nem megfelelő e-mail cím!");
                }
            }else{
                throw new IllegalArgumentException("Nem megfelelő e-mail cím!");
            }
        }else{
            throw new IllegalArgumentException("Nem megfelelő e-mail cím!");
        }


    }


    public String getFullName(){
        return firstName + " " + lastName;
    }
}
