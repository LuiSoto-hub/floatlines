/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author sotoc
 */

public class CConexion {
    Connection conectar = null;
    String usuario = "root";
    String contrasenia = "Joseluischavez5";
    String bd = "FloatLines";
    String ip = "localhost";
    String puerto = "3306";
    
    // Corrige el prefijo de la cadena JDBC
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection establecerConexion() {
        try {
            // Corrige el nombre del controlador
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            //JOptionPane.showMessageDialog(null, "Se conectó a la base de datos correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.toString());
        }
        return conectar;
    }
}

