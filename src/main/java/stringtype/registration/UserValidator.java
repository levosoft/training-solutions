package stringtype.registration;

public class UserValidator {
    private String username;
    private String password1;
    private String password2;
    private String email;

    public UserValidator(String username, String password1, String password2, String email) {
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword1() {
        return password1;
    }

    public String getPassword2() {
        return password2;
    }

    public String getEmail() {
        return email;
    }

    public boolean isValidUsername(String username){
        boolean valid = false;

        if (username != null){
            valid = true;
        }else {
            valid = false;
        }

        return valid;
    }

    public boolean isValidPassword(String password1, String password2){
        boolean valid = false;

        if(password1 != null){
            if(password1.equals(password2)){
                if(password1.length() >= 8){
                    valid = true;
                }else{
                    valid = false;
                }
            }else{
                valid = false;
            }
        }else{
            valid = false;
        }
        return valid;
    }

    public boolean isValidEmail(String email){
        boolean valid = false;

        if(email != null){
            if(email.contains("@")){
                if(email.contains(".")){
                    if((!email.startsWith("@")) && (!email.endsWith("."))){
                        if(email.indexOf(".") - email.indexOf("@") > 1){
                            valid = true;
                        }else {
                            valid = false;
                        }
                    }else{
                        valid = false;
                    }
                }else{
                    valid = false;
                }
            }else{
                valid = false;
            }
        }else{
            valid = false;
        }
        return valid;
    }

}
