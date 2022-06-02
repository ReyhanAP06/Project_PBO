/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekcrud;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Reihan MS
 */

    
public class testkoneksi {
      public static Connection koneksi;
      public static Connection configDB(){
          
          try {
            String url = "jdbc:mysql://localhost/db_pbo";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi=DriverManager.getConnection(url,"root","");            
//            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal! \n"+e.getMessage());
            //System.err.println("Koneksi Gagal "+e.getMessage());
        }
        
        
        return koneksi; 
    }
      
      public static void main(String[] args) {
          Connection C = (Connection)testkoneksi.configDB();
        
    }
    
} 

