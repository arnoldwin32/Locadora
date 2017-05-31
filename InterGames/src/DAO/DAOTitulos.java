/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Titulos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class DAOTitulos extends Conexao {
    public ResultSet resultado;
    public void salvarTitulos(int codigo, String genero,String nome,String ano,String midia,String atores,String audios,String legendas,String classind,String sinopse)
    {
        try{
            Statement stm = con.createStatement();
            String sql = "INSERT INTO db_locadora.tb_titulos"
                    + "(codigo,genero,nome,ano,midia,atores,audio,legendas,classificacao,sinopse)"
                    + "VALUES("+codigo+",'"+genero+"','"+nome+"','"+ano+"','"+midia+"','"+atores+"','"+audios+"','"+legendas+"','"+classind+"','"+sinopse+"')";
            System.out.println(sql);
           stm.execute(sql);
           JOptionPane.showMessageDialog(null,"Save Sucessfull!!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Save error!!");
            
        }
    }
    public ArrayList<Titulos> buscarTitulos(){
    ArrayList<Titulos> novotitulo = new ArrayList<Titulos>();
    Statement stm;
    ResultSet res;
    try
    {
        stm = con.createStatement();
        String sql_busca = "Select midia from db_locadora.tb_titulos";
        res = stm.executeQuery(sql_busca);
        while(res.next()){
            Titulos titulo = new Titulos();
            titulo.setMidia("");
            novotitulo.add(titulo);
             System.out.println(res);
        }
    }catch(SQLException ex){
    Logger.getLogger(DAOTitulos.class.getName()).log(Level.SEVERE,null,ex);
        
    }
    return novotitulo;
    }
    public boolean executeSQL(String sql)
    {
        try{
        Statement smt = con.createStatement();
         resultado = smt.executeQuery(sql);
        return true;
    }catch(SQLException ex)
    {
        System.out.println(ex.getMessage());
        return false;
    }
    }
}
