/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneproject;
public class User 
{
    private static String username;
    private static String password;
    
    
    static void setUsername(String user)
    {
        username = "Kent10121";
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
