package basicsyntax;

import java.util.*;

public class PasswordUtils {
    @UseCase(id = 47, description =
            "Passwords must contain at least one numeric")
    public boolean validatePassword(String passwd) {
        return (passwd.matches("\\w*\\d\\w*"));
    }
    @UseCase(id = 48)
    public String encryptPassword(String passwd) {
        return new StringBuilder(passwd)
                .reverse().toString();
    }
    @UseCase(id = 49, description =
            "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(
            List<String> prevPasswords, String passwd) {
        return !prevPasswords.contains(passwd);
    }

    @UseCase(id = 50, description = "I don't understand anotations")
    public String generatePassword(){
        return "fdafdafd2321";
    }

    public static void main(String[] args) {
        PasswordUtils passwordUtils = new PasswordUtils();

        System.out.println(passwordUtils.validatePassword("444kil"));
    }
}
