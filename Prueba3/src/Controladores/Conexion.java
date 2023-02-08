/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
//import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;
import oracle.jdbc.internal.ResultSetCache;
import java.sql.ResultSet;

/**
 *
 * @author ferna
 */
public class Conexion {
    
    private static Connection conn;
    String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    String usuario = "EJERCICIO";
    String password = "EJERCICIO";

    private Conexion() throws SQLException {
        DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
        conn = DriverManager.getConnection(url, usuario, password);
        
    }

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            new Conexion();
            //JOptionPane.showMessageDialog(null,"Conexion correcta");
        }
        return conn;
    }
    
    

    
    
}
