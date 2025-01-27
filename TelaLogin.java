/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.financaspessoa.classes;

import com.mycompany.financaspessoa.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Administrador
 */
public class TelaLogin extends javax.swing.JFrame {

    private final ControladorTelaLogin controlador;
       
    /**
     * Creates new form TelaLogin
     */
    
    public TelaLogin() {
        
        initComponents();
        setLocationRelativeTo(null);
        controlador = new ControladorTelaLogin(this);
                
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButonLogin = new javax.swing.JButton();
        CaixaUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CaixaSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButonLogin.setBackground(new java.awt.Color(66, 141, 255));
        ButonLogin.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        ButonLogin.setText("Entrar");
        ButonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonLoginActionPerformed(evt);
            }
        });
        ButonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButonLoginKeyPressed(evt);
            }
        });
        getContentPane().add(ButonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 160, 20));

        CaixaUsuario.setBackground(new java.awt.Color(234, 241, 247));
        CaixaUsuario.setForeground(new java.awt.Color(51, 51, 255));
        CaixaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaUsuarioActionPerformed(evt);
            }
        });
        CaixaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CaixaUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(CaixaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 118, 160, 20));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 10)); // NOI18N
        jLabel5.setText("Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 10)); // NOI18N
        jLabel6.setText("Senha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        CaixaSenha.setBackground(new java.awt.Color(234, 241, 247));
        CaixaSenha.setForeground(new java.awt.Color(66, 141, 255));
        CaixaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaSenhaActionPerformed(evt);
            }
        });
        CaixaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CaixaSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(CaixaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 152, 160, 20));

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jButton1.setText("Realizar Cadastro");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\FinancasPessoa\\target\\classes\\com\\mycompany\\financaspessoa\\loginpronta2.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonLoginActionPerformed

        controlador.entrarSistema();
        

    }//GEN-LAST:event_ButonLoginActionPerformed

    private void CaixaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaUsuarioActionPerformed

    private void CaixaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaSenhaActionPerformed

    private void CaixaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CaixaUsuarioKeyPressed
      if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      CaixaSenha.requestFocus();
      }
    }//GEN-LAST:event_CaixaUsuarioKeyPressed

    private void CaixaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CaixaSenhaKeyPressed
  if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      controlador.entrarSistema();
  }
    }//GEN-LAST:event_CaixaSenhaKeyPressed

    private void ButonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButonLoginKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
       controlador.entrarSistema();
    }//GEN-LAST:event_ButonLoginKeyPressed
    }
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonLogin;
    private javax.swing.JPasswordField CaixaSenha;
    private javax.swing.JTextField CaixaUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

  

    public JTextField getCaixaUsuario() {
        return CaixaUsuario;
    }

    public JPasswordField getCaixaSenha() {
        return CaixaSenha;
    }

    public void setCaixaUsuario(JTextField CaixaUsuario) {
        this.CaixaUsuario = CaixaUsuario;
    }
    void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null,mensagem);

    }

    
    
}

