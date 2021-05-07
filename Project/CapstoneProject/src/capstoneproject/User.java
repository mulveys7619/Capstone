package capstoneproject;
public class User 
{
    private static String username;
    private static String password;
    
    
    static void setUsername(String user)
    {
        username = user;
    }
    static void setPassword(String pass)
    {
        password = pass;
    }
    public static String getUsername()
    {
        return username;
    }
    public static String getPassword()
    {
        return password;
    }
}
