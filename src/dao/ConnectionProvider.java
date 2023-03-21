/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?allowPublicKeyRetrieval=true&useSSL=false","root","Korir#001");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
             //JOptionPane.showMessageDialog(null,e, "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    
}
