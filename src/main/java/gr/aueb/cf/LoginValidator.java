package gr.aueb.cf;

public class LoginValidator {
    public static boolean isValidLogin(String username, String password) {
        return "admin".equals(username) && "1234".equals(password);
    }
}
