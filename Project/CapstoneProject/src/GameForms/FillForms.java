/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameForms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jevon
 */
public class FillForms {
    
    public static String getTitle(int gameId)
    {
        String title = "";
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String titleQuery = "SELECT TITLE FROM GAMES WHERE Game_ID = ?";
            PreparedStatement titlePS = con.prepareStatement(titleQuery);
            titlePS.setInt(1, gameId);
            ResultSet titleRS = titlePS.executeQuery();
            if (titleRS.next())
            {
                title = titleRS.getString("Title");
            }
            con.close();
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
        return title;
        
    }
    public static String getSynopsis(int gameId)
    {
        String synopsis = "";
        try
        {
           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String synopsisQuery = "SELECT Synopsis FROM GAMES WHERE Game_ID = ?";
            PreparedStatement synopsisPS = con.prepareStatement(synopsisQuery);
            synopsisPS.setInt(1, gameId);
            ResultSet synopsisRS = synopsisPS.executeQuery();
            if (synopsisRS.next())
            {
                synopsis = synopsisRS.getString("Synopsis");
            }
            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return synopsis;
    }
    public static String getSub1(int gameId)
    {
        String subIDStr = "";
        int subID = -1;
        String sub = "";
        
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String idStrQuery = "SELECT Subgenre1 FROM GAMES WHERE Game_ID = ?";
            PreparedStatement idStrPS = con.prepareStatement(idStrQuery);
            idStrPS.setInt(1,gameId);
            ResultSet idStrRS = idStrPS.executeQuery();
            if(idStrRS.next())
            {
                subIDStr = idStrRS.getString("Subgenre1");
                subID = Integer.parseInt(subIDStr);
            }
            String idQuery = "SELECT Genre_Name FROM Genre WHERE Genre_ID = ?";
            PreparedStatement idPS = con.prepareStatement(idQuery);
            idPS.setInt(1, subID);
            ResultSet idRS = idPS.executeQuery();
            if(idRS.next())
            {
                sub = idRS.getString("Genre_Name");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return sub;
    }
    public static String getSub2(int gameId)
    {
         String subIDStr = "";
        int subID = -1;
        String sub = "";
        
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String idStrQuery = "SELECT Subgenre2 FROM GAMES WHERE Game_ID = ?";
            PreparedStatement idStrPS = con.prepareStatement(idStrQuery);
            idStrPS.setInt(1,gameId);
            ResultSet idStrRS = idStrPS.executeQuery();
            if(idStrRS.next())
            {
                subIDStr = idStrRS.getString("Subgenre2");
                subID = Integer.parseInt(subIDStr);
            }
            String idQuery = "SELECT Genre_Name FROM Genre WHERE Genre_ID = ?";
            PreparedStatement idPS = con.prepareStatement(idQuery);
            idPS.setInt(1, subID);
            ResultSet idRS = idPS.executeQuery();
            if(idRS.next())
            {
                sub = idRS.getString("Genre_Name");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return sub;
    }
    public static String getSub3(int gameId)
    {
         String subIDStr = "";
        int subID = -1;
        String sub = "";
        
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String idStrQuery = "SELECT Subgenre3 FROM GAMES WHERE Game_ID = ?";
            PreparedStatement idStrPS = con.prepareStatement(idStrQuery);
            idStrPS.setInt(1,gameId);
            ResultSet idStrRS = idStrPS.executeQuery();
            if(idStrRS.next())
            {
                subIDStr = idStrRS.getString("Subgenre3");
                subID = Integer.parseInt(subIDStr);
            }
            String idQuery = "SELECT Genre_Name FROM Genre WHERE Genre_ID = ?";
            PreparedStatement idPS = con.prepareStatement(idQuery);
            idPS.setInt(1, subID);
            ResultSet idRS = idPS.executeQuery();
            if(idRS.next())
            {
                sub = idRS.getString("Genre_Name");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return sub;
    }
}
