/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.Conexao.con;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class DAOClientes extends Conexao{
    public ResultSet resultado;
    public void salvarClientes(int codigo,String nome,String cpf,String rg,String dtexp,String sexo,String telefone,String celular,String comercial,String outro,String rua,String numero,String complemento,String cep,String bairro,String cidade,String uf,String email,String comprovante,String nomedep1,String obs1,String nomedep2,String obs2)
    {
        try{
            Statement stm = con.createStatement();
            String sql="INSERT INTO db_locadora.tb_clientes"
                    + "(codigo,nome,cpf,rg,dtexp,sexo,telefone,celular,comercial,outro,rua,numero,complemento,cep,bairro,cidade,uf,email,comprovante,nomedep1,obs1,nomedep2,obs2)"
                    +"VALUES("+codigo+",'"+nome+"','"+cpf+"','"+rg+"','"+dtexp+"','"+sexo+"','"+telefone+"','"+celular+"','"+comercial+"','"+outro+"','"+rua+"','"+numero+"','"+complemento+"','"+cep+"','"+bairro+"','"+cidade+"','"+uf+"','"+email+"','"+comprovante+"','"+nomedep1+"','"+obs1+"','"+nomedep2+"','"+obs2+"')";
                    System.out.println(sql);
                    stm.execute(sql);
                    JOptionPane.showMessageDialog(null,"Save Sucessfull!!");
        }catch(SQLException ex){
            System.out.println("Erro ao salvar os dados!!!");
            JOptionPane.showMessageDialog(null,"Erro ao salvar dados!!");
            
        }
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
