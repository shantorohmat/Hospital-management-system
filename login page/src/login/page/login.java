/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.page;

/**
 *
 * @author Hp
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form login
     */
    public login() {
        super("Register");
        initComponents();
        conn = javaconnect.ConnecrDb();
        
        //initComponents();
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
        Password = new javax.swing.JPasswordField();
        User_Name = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Answer = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        G_mail = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("User Name: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 100, 40));

        Password.setBackground(new java.awt.Color(51, 51, 51));
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setCaretColor(new java.awt.Color(255, 255, 255));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 220, 40));

        User_Name.setBackground(new java.awt.Color(51, 51, 51));
        User_Name.setForeground(new java.awt.Color(255, 255, 255));
        User_Name.setCaretColor(new java.awt.Color(255, 255, 255));
        User_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_NameActionPerformed(evt);
            }
        });
        getContentPane().add(User_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 220, 40));

        Register.setBackground(new java.awt.Color(51, 51, 51));
        Register.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Register.setForeground(new java.awt.Color(0, 102, 102));
        Register.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-registration-56.png")); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 400, 50));

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 102, 102));
        Login.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-forward-button-32.png")); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Secure Question :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Answer : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 80, 30));

        Answer.setBackground(new java.awt.Color(51, 51, 51));
        Answer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Answer.setForeground(new java.awt.Color(255, 255, 255));
        Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerActionPerformed(evt);
            }
        });
        getContentPane().add(Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 220, 40));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-find-user-male-30.png")); // NOI18N
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 40, 40));

        jButton4.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-password-1-24.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 40, 40));

        jButton5.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-query-24.png")); // NOI18N
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 440, 40, 40));

        jButton6.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-security-configuration-26.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 510, 40, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("G-mail: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, 30));

        G_mail.setBackground(new java.awt.Color(51, 51, 51));
        G_mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        G_mail.setForeground(new java.awt.Color(255, 255, 255));
        G_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_mailActionPerformed(evt);
            }
        });
        getContentPane().add(G_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 220, 40));

        jButton7.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-gmail-24.png")); // NOI18N
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 300, 40, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Who was your enemy in primary school?", "Are You a smoker?", "What was/is your High school name?", "Do you wake up early in the morning?", "You are afraid of your father." }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 220, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\Close.png")); // NOI18N
        jButton1.setText("close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("G:\\Project\\logo\\image (2) (2).jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void User_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_NameActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        int f = 0 ;
         try{
            String sql = "Insert into  register (UserName,Gmail,Password,SecureQuestion,Answer) values (?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,User_Name.getText());
            pst.setString(2,G_mail.getText());
            pst.setString(3,Password.getText());
            pst.setString(4,(String)jComboBox1.getSelectedItem());
            pst.setString(5,Answer.getText());
            pst.execute();
           
            JOptionPane.showMessageDialog(null, "registered");
            //rs.close();
            //pst.close();
            f =  1;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }
         }
         if(f == 1)
         {
             home x = new home();
             x.setVisible(true);
         }
    }//GEN-LAST:event_RegisterActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void G_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G_mailActionPerformed

    private void AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //login x = new login();
        setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
       setVisible(false);
        register x = new register();
        x.setVisible(true);
        x.setBounds(450,150,650,500);
        x.setResizable(false);
    }//GEN-LAST:event_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JTextField G_mail;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Register;
    private javax.swing.JTextField User_Name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
