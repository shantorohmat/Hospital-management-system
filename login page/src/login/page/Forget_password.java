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
public class Forget_password extends javax.swing.JFrame {
      Connection conn;
    ResultSet rs;
    PreparedStatement pst;


    /**
     * Creates new form Forget_password
     */
    public Forget_password() {
         super("Forget Password");
        initComponents();
        conn = javaconnect.ConnecrDb();
       // initComponents();
    }
    public void Search()
    {
        String a1 = User_Name.getText();
        String sql = "select *from register where username = '"+a1+"'";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                G_mail.setText(rs.getString(2));
                jTextField1.setText(rs.getString(4));
                rs.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null,"incorrect user name");
            }
        }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                    
                    }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }
         }
                
        
    }
    public void find_password()
    {
        int k = 0;
        String a1 = jTextField1.getText();
        String a2 = Answer.getText();
        String sql = "select *from register where Answer = '"+a2+"'";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                k = 1;
                Password.setText(rs.getString(3));
                
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
                }
        if(k  == 0)
        {
            JOptionPane.showMessageDialog(null,"Wrong Answer");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        User_Name = new javax.swing.JTextField();
        G_mail = new javax.swing.JTextField();
        Answer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("User Name : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("G-mail : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Sequirity Qustion : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Answer  : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        User_Name.setBackground(new java.awt.Color(0, 102, 102));
        User_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        User_Name.setForeground(new java.awt.Color(255, 255, 255));
        User_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_NameActionPerformed(evt);
            }
        });
        getContentPane().add(User_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 340, 41));

        G_mail.setBackground(new java.awt.Color(0, 102, 102));
        G_mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        G_mail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(G_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 340, 39));

        Answer.setBackground(new java.awt.Color(0, 102, 102));
        Answer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Answer.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 340, 40));

        jButton1.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\search.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 48, 41));

        jButton2.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-gmail-24.png")); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 48, 39));

        jButton4.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-security-configuration-26.png")); // NOI18N
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 47, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Password : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 20));

        Password.setBackground(new java.awt.Color(0, 102, 102));
        Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 340, 40));

        jButton5.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-privacy-24.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 47, 40));

        jButton6.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\icons8-query-24.png")); // NOI18N
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 50, 40));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 51, 51));
        jButton7.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\back.png")); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 200, 50));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 51, 51));
        jButton8.setIcon(new javax.swing.ImageIcon("G:\\Project\\picture\\HMS ICON\\search.png")); // NOI18N
        jButton8.setText("Find Password");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 390, 50));

        jTextField1.setBackground(new java.awt.Color(0, 102, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 340, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("G:\\Project\\logo\\7898565 (1).jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void User_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_NameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        register x =  new register();
        x.setVisible(true);
        x.setBounds(450,150,650,500);
        x.setResizable(false);
        //x.setTitle("Forget Password");
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        find_password();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forget_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JTextField G_mail;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField User_Name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
