/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Utilites;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pandit
 */
public class DbConn
{
    public static Connection connect() throws SQLException
    {
             Connection con = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");

            con =  (Connection) DriverManager.getConnection("jdbc:mysql:///dummy3","root","");
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DbConn.class.getName()).log(Level.SEVERE, null, ex);
        }
             return con;

}
}
