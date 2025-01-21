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
    Connection conectar =null;
    String usuario="root";
    String contrasenia="Joseluischavez5";
    String bd="FloatLines";
    String ip="localhost";
    String puerto="3307";
    
    String cadena="jbdc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
    try{
        Class.forName("com.mysql.jdb.Driver");
        conectar=DriverManager.getConnection(cadena,usuario,contrasenia);
        JOptionPane.showMessageDialog(null, "se conecto a la base de datos");
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "error al conectar base de datos:"+e.toString());
    }
   return conectar;
    
    }
}

