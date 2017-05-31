/*Projeto InterGames Locadora
 * Classe de conexão com o banco de dados MySql.
 */
package DAO;

import java.sql.*;
//import javax.swing.JOptionPane;

/**
 *
 * Author: Arnold
 */
public class Conexao {
    protected static Connection con;
    private static String driver ="com.mysql.jdbc.Driver";
    public static boolean conectar(/*String url,String usuario,String senha*/) 
    {
       if(con == null){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307","root","usbw");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:"+url+"3307",usuario,senha);
            //JOptionPane.showMessageDialog(null, "Connection Sucessfull!!");
            System.out.println("Connection Sucessfull!!");
        }catch(SQLException ef){
            //JOptionPane.showMessageDialog(null, "SQL Connection Error");
            System.out.println("SQL Connection Error");
            //return false;
        }catch(ClassNotFoundException e){
            //JOptionPane.showMessageDialog(null, "SQL Driver not found!");
             System.out.println("SQL Driver not found!");
        }
    }
       return true;
}
}