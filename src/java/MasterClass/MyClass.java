/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MasterClass;

import Beans.MasterBean;
import Utilites.DbConn;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pandit
 */
public class MyClass
{
    public static int add(String a,String b, String c, String d)
    {
        int result = 0;
        Connection con = null;
        Statement st = null;
        try
        {
            con= DbConn.connect();
            st= (Statement) con.createStatement();
            String qry = "insert into feedback(name,email,subject,mesg) values('"+a+"','"+b+"','"+c+"','"+d+"');";
            result = st.executeUpdate(qry);
        }
        catch(Exception ex)
        {

        }


        return result;
    }

    public static int addmini(String a, String b, String c, String d)
    {
        int result=0;
        Connection con = null;
        Statement st = null;
        try
        {
            con = DbConn.connect();
            st = (Statement) con.createStatement();
            String qry = "insert into booking (mob,name,pick,desti,date) values('"+a+"','"+b+"','"+c+"','"+d+"',sysdate())";
            result = st.executeUpdate(qry);

        }
        catch (SQLException ex)
        {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

     public static int addsedan(String a, String b, String c, String d)
    {
        int result=0;
        Connection con = null;
        Statement st = null;
        
        try
        {
            con = DbConn.connect();
            st = (Statement) con.createStatement();
            
            String qry = "insert into booking (mob,name,pick,desti,date) values('"+a+"','"+b+"','"+c+"','"+d+"',sysdate())";
            result = st.executeUpdate(qry);

        }
        catch (SQLException ex)
        {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

      public static int addsuv(String a, String b, String c, String d)
    {
        int result=0;
        Connection con = null;
        Statement st = null;
        try
        {
            con = DbConn.connect();
            st = (Statement) con.createStatement();
            String qry = "insert into booking (mob,name,pick,desti,date) values('"+a+"','"+b+"','"+c+"','"+d+"',sysdate())";
            result = st.executeUpdate(qry);

        }
        catch (SQLException ex)
        {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
      public static ArrayList showEntry()
    {
          Connection con = null;
          Statement st = null;
          ResultSet rs = null;
          ArrayList al = new ArrayList();
        try
        {
            con = DbConn.connect();
            st = (Statement) con.createStatement();
            String qry= "select * from booking";
            rs= st.executeQuery(qry);

            while (rs.next())
            {
                MasterBean mb = new MasterBean();
                mb.setMobile(rs.getString(2));
                mb.setName(rs.getString(3));
                mb.setPickup(rs.getString(4));
                mb.setDesti(rs.getString(5));
                mb.setDate(rs.getString(6));
                al.add(mb);
            }

        }
        catch (SQLException ex)
        {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }
          return al;
      }
}
