/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBaseDatos;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.ResultSet;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sotoc
 */
public class Main {
  public static void main(String[] args) {
    CConexion objetoConexion=new CConexion();
   objetoConexion.establecerConexion();

  
   }
  
  }      
