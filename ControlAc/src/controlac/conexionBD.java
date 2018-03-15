/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kiOo1
 */
public class conexionBD {
    Connection comm;
    
     public Connection conec_base_de_datos(){
        try{
            comm = DriverManager.getConnection("jdbc:mysql://localhost/cactividades", "root", "123a123a");
        }
        catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error"+ e);
         }
         return comm;
    }
    
    
    
}
