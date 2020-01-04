/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inerfaces;

import Funciones.Desencriptar;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class Interfaz3 extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz2
     */
    public Interfaz3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Texto = new javax.swing.JTextField();
        Clave = new javax.swing.JTextField();
        Desencriptar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Des = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desencriptar");
        setMinimumSize(new java.awt.Dimension(419, 311));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Encriptación MAC");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 206, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Texto a Desencriptar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 181, 22);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Clave (16 Letras)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 145, 22);

        Texto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoActionPerformed(evt);
            }
        });
        getContentPane().add(Texto);
        Texto.setBounds(210, 67, 220, 30);

        Clave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveActionPerformed(evt);
            }
        });
        getContentPane().add(Clave);
        Clave.setBounds(210, 120, 220, 30);

        Desencriptar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Desencriptar.setText("Desencriptar");
        Desencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesencriptarActionPerformed(evt);
            }
        });
        getContentPane().add(Desencriptar);
        Desencriptar.setBounds(20, 230, 153, 30);

        Regresar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar);
        Regresar.setBounds(300, 230, 119, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Texto Desencriptado");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 180, 22);

        Des.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesActionPerformed(evt);
            }
        });
        getContentPane().add(Des);
        Des.setBounds(210, 170, 220, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoActionPerformed

    private void ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClaveActionPerformed

    private void DesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesencriptarActionPerformed
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_DesencriptarActionPerformed

     private void Validar()
    {
        if(Texto.getText().length()!=16 || Clave.getText().length()!=16)
        {
            JOptionPane.showMessageDialog(null, "Debe tener 16 caracteres el texto y la clave", "Importante", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Desencriptar D= new Desencriptar();
            String Text=Texto.getText();
            String Clav=Clave.getText();
            D.SeparaLetras(Text, Clav);
            String TextDes = D.Terminado();
            Des.setText(TextDes);
        }
    }
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        Interfaz1 I=new Interfaz1();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void DesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Clave;
    private javax.swing.JTextField Des;
    private javax.swing.JButton Desencriptar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField Texto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}