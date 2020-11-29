package week05d05;

public class User {

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

    public String getEmail() {
        return email;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}
