
import java.awt.Color;
import static java.awt.Color.red;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class Login1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login1() {
       initComponents();
    }

    private void JTextFieldHint(JTextField jTextField, String endereço_de_email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botaologin = new javax.swing.JButton();
        botaosaibamais = new javax.swing.JButton();
        botaoacessar = new javax.swing.JButton();
        txtsenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(910, 280, 70, 120);

        txtemail.setBorder(null);
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail);
        txtemail.setBounds(710, 320, 450, 40);

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Senha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(910, 410, 100, 20);

        botaologin.setContentAreaFilled(false);
        botaologin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaologin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                botaologinMouseDragged(evt);
            }
        });
        botaologin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaologinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaologinMouseEntered(evt);
            }
        });
        botaologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaologinActionPerformed(evt);
            }
        });
        getContentPane().add(botaologin);
        botaologin.setBounds(690, 460, 480, 50);

        botaosaibamais.setContentAreaFilled(false);
        botaosaibamais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaosaibamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosaibamaisActionPerformed(evt);
            }
        });
        getContentPane().add(botaosaibamais);
        botaosaibamais.setBounds(1150, 30, 120, 30);

        botaoacessar.setContentAreaFilled(false);
        botaoacessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoacessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoacessarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoacessar);
        botaoacessar.setBounds(130, 320, 140, 50);

        txtsenha.setBorder(null);
        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtsenha);
        txtsenha.setBounds(710, 400, 440, 30);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\paginas\\acesso1.png")); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1315, 725);

        setSize(new java.awt.Dimension(1331, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaologinActionPerformed
        String email = txtemail.getText();
        String senha = txtsenha.getText();
        
        if (email.equals("admin") && senha.equals("admin")) {
        TelaInicial t1 = new TelaInicial();
        JOptionPane.showMessageDialog(null, "Usuário logado com sucesso");
        hide(); 
        t1.setVisible(true);     
        } else if (email.isEmpty() == true || senha.isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha não encontrados, tente novamente");
        }
    }//GEN-LAST:event_botaologinActionPerformed

    private void botaosaibamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosaibamaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaosaibamaisActionPerformed

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void botaoacessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoacessarActionPerformed
        dispose();
        Login2adm lgadm1 = new Login2adm();
        lgadm1.setVisible(true);
    }//GEN-LAST:event_botaoacessarActionPerformed

    private void botaologinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaologinMouseClicked
       
    }//GEN-LAST:event_botaologinMouseClicked

    private void botaologinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaologinMouseEntered
        
    }//GEN-LAST:event_botaologinMouseEntered

    private void botaologinMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaologinMouseDragged
        
    }//GEN-LAST:event_botaologinMouseDragged

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoacessar;
    private javax.swing.JButton botaologin;
    private javax.swing.JButton botaosaibamais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables

    void dispose(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
