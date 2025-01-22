/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBaseDatos;


import com.mycompany.flotline.FrameCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

/**
 *
 * @author sotoc
 */
public class CLogin {
    public void ValidaUsuario(JTextField usuario, JPasswordField contrasenia){
   
       try{
           ResultSet rs=null;
           PreparedStatement ps=null;
           
           ConexionBaseDatos.CConexion objetoConexion =new ConexionBaseDatos.CConexion();
           
           String consulta="select *from usuarios where usuarios.usuario=(?) and usuarios.contraseña =(?);"; 
           ps=objetoConexion.establecerConexion().prepareStatement(consulta);
           String contra=String.copyValueOf(contrasenia.getPassword());
           ps.setString(1,usuario.getText());
           ps.setString(2, contra);
           
           rs=ps.executeQuery();
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "el usuario es correcto");
               FrameCliente objetoMenu =new FrameCliente();
               objetoMenu.setVisible(true);
               
           }
           else{
            JOptionPane.showMessageDialog(null,"el usuario no es correcto");
           }
       
           
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"error"+e.toString());
       }
}

}
