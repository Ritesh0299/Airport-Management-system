/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class login1 extends javax.swing.JFrame {

    /**
     * Creates new form login1
     */
    public login1() {
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
        jLabel3 = new javax.swing.JLabel();
        jt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jp1 = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jlb1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" AIRPORT MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 50, 970, 100);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Admin Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 500, 210, 42);

        jt1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jt1);
        jt1.setBounds(520, 490, 250, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 600, 200, 42);

        jp1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jp1);
        jp1.setBounds(520, 590, 250, 50);

        loginbutton.setBackground(new java.awt.Color(255, 255, 153));
        loginbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loginbutton.setText("LOGIN");
        loginbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton);
        loginbutton.setBounds(280, 710, 130, 60);

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText(" CLEAR");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 710, 130, 60);

        jlb1.setText(" ");
        getContentPane().add(jlb1);
        jlb1.setBounds(515, 402, 4, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.2.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(899, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(899, 500));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
       try
       {
        Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms_min_v5","root","ritesh");
       Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from login where Username='"+jt1.getText()+"'");
        
                    if (rs.next())
				{
                                    
					if(rs.getString(2).equals(jp1.getText()))
						{
							//dispose();
                                                   // JOptionPane.showMessageDialog(null,"Login succesful");
                                                    //nfo o1=new info();
							//o1.show();
                                                     this.setVisible(false);
                                                     new info().setVisible(true);
                                                       
						}
					else
						//jlb1.setText("Invalid Password or Admin name");
                                            JOptionPane.showMessageDialog(null,"Invalid username or password");
				}
       }
       catch(Exception e){JOptionPane.showMessageDialog(null,"Error in connectivity");}
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
        
        try
       {
        Class.forName("com.mysql.jdbc.Driver");
       //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms_min_v5","root","ritesh");
            jt1.setText("");
            jp1.setText("");
       }catch(Exception e){JOptionPane.showMessageDialog(null,"Error in connectivity");}
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlb1;
    private javax.swing.JPasswordField jp1;
    private javax.swing.JTextField jt1;
    private javax.swing.JButton loginbutton;
    // End of variables declaration//GEN-END:variables
}