package Login;


/**
 * @author Paul Duschek
 * @version 1.0, 8.12.2020
 */

public class LoginModel {
    private String UserName;
    private String password;

    public LoginModel()
    {
        UserName = "duschek.pau";
        password = "HTLwels";
    }

    public boolean checkLogin(String username, String passwd)
    {
        if(username.equals(UserName) && passwd.equals(password))
        {
            return true;
        }
        else
        {
            System.out.println("False Username or password!");
            return false;
        }
    }
}
