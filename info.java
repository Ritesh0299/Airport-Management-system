/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author hp
 */
public class info extends javax.swing.JFrame {

    /**
     * Creates new form info
     */
    public info() {
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

        jButton2 = new javax.swing.JButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel2 = new javax.swing.JLabel();
        bpass1 = new javax.swing.JButton();
        bemp1 = new javax.swing.JButton();
        bf1 = new javax.swing.JButton();
        tik1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setMaximumSize(new java.awt.Dimension(899, 500));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        bpass1.setBackground(new java.awt.Color(255, 153, 255));
        bpass1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bpass1.setForeground(new java.awt.Color(51, 0, 51));
        bpass1.setText(" Passenger");
        bpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpass1ActionPerformed(evt);
            }
        });
        getContentPane().add(bpass1);
        bpass1.setBounds(1170, 700, 210, 80);

        bemp1.setBackground(new java.awt.Color(255, 153, 255));
        bemp1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bemp1.setForeground(new java.awt.Color(51, 0, 51));
        bemp1.setText(" Employee");
        bemp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bemp1ActionPerformed(evt);
            }
        });
        getContentPane().add(bemp1);
        bemp1.setBounds(1170, 430, 220, 80);

        bf1.setBackground(new java.awt.Color(255, 153, 255));
        bf1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bf1.setForeground(new java.awt.Color(51, 0, 51));
        bf1.setText(" Flight");
        bf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bf1ActionPerformed(evt);
            }
        });
        getContentPane().add(bf1);
        bf1.setBounds(640, 700, 220, 80);

        tik1.setBackground(new java.awt.Color(255, 153, 255));
        tik1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        tik1.setForeground(new java.awt.Color(51, 0, 51));
        tik1.setText(" Ticket");
        tik1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tik1ActionPerformed(evt);
            }
        });
        getContentPane().add(tik1);
        tik1.setBounds(640, 420, 220, 80);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 102));
        jLabel1.setText("MAIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(930, 180, 190, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\mini_project_dbms\\7.3.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-60, 0, 2660, 1150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tik1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tik1ActionPerformed
         try
       {
        Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms_min_v5","root","ritesh");
       //Statement stmt;
      // ResultSet rs;
            this.setVisible(false);
            new ticket().setVisible(true);
            
       }
           catch(Exception e){JOptionPane.showMessageDialog(null,"Error in connectivity");}
    }//GEN-LAST:event_tik1ActionPerformed

    private void bpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpass1ActionPerformed
        // TODO add your handling code here:
          try
       {
        Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","ritesh");
       //Statement stmt=con.createStatement();
            this.setVisible(false);
            new passenger().setVisible(true);
       }
           catch(Exception e){JOptionPane.showMessageDialog(null,"Error in connectivity");}
    }//GEN-LAST:event_bpass1ActionPerformed

    private void bf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bf1ActionPerformed
        // TODO add your handling code here:
        try
          {
        Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","ritesh");
       //Statement stmt=con.createStatement();
            this.setVisible(false);
            new flight().setVisible(true);
       }
           catch(Exception e){JOptionPane.showMessageDialog(null,"Error in connectivity");}
    }//GEN-LAST:event_bf1ActionPerformed

    private void bemp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bemp1ActionPerformed
        // TODO add your handling code here:
        try
          {
        Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","ritesh");
       //Statement stmt=con.createStatement();
            this.setVisible(false);
            new employee().setVisible(true);
       }
           catch(Exception e){JOptionPane.showMessageDialog(null,"Error in connectivity");}
    }//GEN-LAST:event_bemp1ActionPerformed

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
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bemp1;
    private javax.swing.JButton bf1;
    private javax.swing.JButton bpass1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton tik1;
    // End of variables declaration//GEN-END:variables
}
