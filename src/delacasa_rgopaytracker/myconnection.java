package delacasa_rgopaytracker;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Angelica DC
 */
public class myconnection {
    Connection conn = null;
    
    public static Connection dbConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rgo_paytracker");
            return conn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
