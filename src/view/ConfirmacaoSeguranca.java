/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerRegistrosFuncionarios;
import javax.swing.JTextField;

/**
 *
 * @author ryanp
 */
public class ConfirmacaoSeguranca extends javax.swing.JFrame {

    private final ControllerRegistrosFuncionarios controller3;
    TelaPrincipal tela = new TelaPrincipal();
    private static ConfirmacaoSeguranca confirmacaoseguranca = new ConfirmacaoSeguranca();
    
    public ConfirmacaoSeguranca() {
        initComponents();
        controller3 = new ControllerRegistrosFuncionarios(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cupanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        senhaSistema = new javax.swing.JTextField();
        confirmarSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("DIGITE A SENHA PARA CADASTRAR");

        senhaSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaSistemaActionPerformed(evt);
            }
        });

        confirmarSenha.setText("Confirmar");
        confirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cupanelLayout = new javax.swing.GroupLayout(cupanel);
        cupanel.setLayout(cupanelLayout);
        cupanelLayout.setHorizontalGroup(
            cupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cupanelLayout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addGroup(cupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cupanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cupanelLayout.createSequentialGroup()
                        .addComponent(confirmarSenha)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cupanelLayout.createSequentialGroup()
                        .addComponent(senhaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(308, 308, 308))))
        );
        cupanelLayout.setVerticalGroup(
            cupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cupanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(senhaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(confirmarSenha)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(cupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarSenhaActionPerformed
  
        controller3.registrarFuncionario(TelaPrincipal.getTelaPrincipal());    
        
    }//GEN-LAST:event_confirmarSenhaActionPerformed

    private void senhaSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaSistemaActionPerformed

        
        
    }//GEN-LAST:event_senhaSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmacaoSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmacaoSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmacaoSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmacaoSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                confirmacaoseguranca.setVisible(true);
            }
        });
    }

    public JTextField getSenhaSistema() {
        return senhaSistema;
    }

    public void setSenhaSistema(JTextField senhaSistema) {
        this.senhaSistema = senhaSistema;
    }

    public static ConfirmacaoSeguranca getConfirmacaoseguranca() {
        return confirmacaoseguranca;
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarSenha;
    private javax.swing.JPanel cupanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField senhaSistema;
    // End of variables declaration//GEN-END:variables
}
