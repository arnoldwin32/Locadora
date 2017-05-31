/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ALUNO
 */
import DAO.Conexao;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JDialog;
public class telaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    
    
    Conexao con = new Conexao();
    String url="localhost";
    public telaPrincipal() {
        initComponents();
        Calendar cal=Calendar.getInstance(); 
        String fecha=cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR); 
        String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND); 
        this.data.setText(fecha); 
        this.hora.setText(hora); 
        setLocationRelativeTo(null);
        
       if(Conexao.conectar())
        {
            //Conexao.conectar();
            status.setForeground(Color.green);
            status.setText("Conectado ao MySql!");
           
        }
        if(!Conexao.conectar())
        {
             status.setForeground(Color.red);
             status.setText("Erro na conexão com o banco!!");
        }
    }
  
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        status = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        as = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCadastrarTitulos = new javax.swing.JMenu();
        CadTitulos = new javax.swing.JMenuItem();
        pesquisarTitulos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenuItem();
        pesquisarClientes = new javax.swing.JMenuItem();
        testar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        locar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        status.setText("Status");

        msg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        msg.setText("Conectado em :");

        as.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        as.setText("às");

        data.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        data.setText("00/00/00");

        hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hora.setText("00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                .addComponent(status)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(518, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(status))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        jMCadastrarTitulos.setText("Titulos");
        jMCadastrarTitulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastrarTitulosActionPerformed(evt);
            }
        });

        CadTitulos.setText(" Cadastar Titulos");
        CadTitulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadTitulosActionPerformed(evt);
            }
        });
        jMCadastrarTitulos.add(CadTitulos);

        pesquisarTitulos.setText("Pesquisar Titulos");
        pesquisarTitulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarTitulosActionPerformed(evt);
            }
        });
        jMCadastrarTitulos.add(pesquisarTitulos);

        jMenuBar1.add(jMCadastrarTitulos);

        jMenu2.setText("Clientes");

        CadCliente.setText("Cadastrar Clientes");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        jMenu2.add(CadCliente);

        pesquisarClientes.setText("Pesquisar Clientes");
        pesquisarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarClientesActionPerformed(evt);
            }
        });
        jMenu2.add(pesquisarClientes);

        testar.setText("Testar");
        testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testarActionPerformed(evt);
            }
        });
        jMenu2.add(testar);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Locação");

        locar.setText(" Realizar Locação");
        locar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locarActionPerformed(evt);
            }
        });
        jMenu1.add(locar);

        jMenuItem2.setText("Devolução");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Histórico de Locações");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMCadastrarTitulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastrarTitulosActionPerformed
        
    }//GEN-LAST:event_jMCadastrarTitulosActionPerformed

    private void CadTitulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadTitulosActionPerformed
        IncluirTitulo novo = new IncluirTitulo();
        getContentPane().validate();
        getContentPane().setVisible(false);
        getContentPane().remove(0);
        getContentPane().add(novo);
        getContentPane().setVisible(true);
    }//GEN-LAST:event_CadTitulosActionPerformed

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
       CadastroCLientes cliente = new CadastroCLientes();
       getContentPane().validate();
       getContentPane().setVisible(false);
       getContentPane().remove(0);
       getContentPane().add(cliente);
       getContentPane().setVisible(true);
    }//GEN-LAST:event_CadClienteActionPerformed

    private void pesquisarTitulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarTitulosActionPerformed
        PesquisarTitulos titulo = new PesquisarTitulos(con);
       getContentPane().validate();
       getContentPane().setVisible(false);
       getContentPane().remove(0);
       getContentPane().add(titulo);
       getContentPane().setVisible(true);
    }//GEN-LAST:event_pesquisarTitulosActionPerformed

    private void pesquisarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarClientesActionPerformed
       pesquisarClientes cliente = new pesquisarClientes(con);
       getContentPane().validate();
       getContentPane().setVisible(false);
       getContentPane().remove(0);
       getContentPane().add(cliente);
       getContentPane().setVisible(true);
    }//GEN-LAST:event_pesquisarClientesActionPerformed

    private void testarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testarActionPerformed
        
    }//GEN-LAST:event_testarActionPerformed

    private void locarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locarActionPerformed
        Emprestimo emp = new Emprestimo();
           getContentPane().validate();
           getContentPane().setVisible(false);
           getContentPane().remove(0);
           getContentPane().add(emp);
           getContentPane().setVisible(true);
    }//GEN-LAST:event_locarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenuItem CadTitulos;
    private javax.swing.JLabel as;
    private javax.swing.JLabel data;
    private javax.swing.JLabel hora;
    private javax.swing.JMenu jMCadastrarTitulos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem locar;
    private javax.swing.JLabel msg;
    private javax.swing.JMenuItem pesquisarClientes;
    private javax.swing.JMenuItem pesquisarTitulos;
    private javax.swing.JLabel status;
    private javax.swing.JMenuItem testar;
    // End of variables declaration//GEN-END:variables
}
