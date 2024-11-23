/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billingsystem;
import java.sql.*;
/**
 *
 * @author dexte
 */
public class connection {
    
    String sUrl, sUser, sPass;
        
        Connection connection ;
        Statement st;
        
        connection(){
        try{
        sUrl = "jdbc:MYSQL://localhost:3306/ewb";
        sUser = "root";
        sPass = "";
        

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
            Statement st = con.createStatement();
}catch(Exception e){
    e.printStackTrace();
}
        } 
    
}
