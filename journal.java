

import java.awt.event.*;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.Desktop;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
 


public class journal extends javax.swing.JFrame {


    public journal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlFront = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnNew1 = new javax.swing.JButton();
        btnNew2 = new javax.swing.JButton();
        btnNew3 = new javax.swing.JButton();
        btnNew4 = new javax.swing.JButton();
        btnNew5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnCorner = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 249, 255));
        jPanel1.setToolTipText("");

        pnlFront.setBackground(new java.awt.Color(220, 203, 255));

        btnNew.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("plus1.png"))); // NOI18N
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnNew1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew1ActionPerformed(evt);
            }
        });

        btnNew2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew2ActionPerformed(evt);
            }
        });

        btnNew3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnNew3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew3ActionPerformed(evt);
            }
        });

        btnNew4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnNew4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew4ActionPerformed(evt);
            }
        });

        btnNew5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnNew5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("New");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("2021-05-22");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("2021-05-21");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("2021-05-20");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("2021-05-19");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("2021-05-18");

        javax.swing.GroupLayout pnlFrontLayout = new javax.swing.GroupLayout(pnlFront);
        pnlFront.setLayout(pnlFrontLayout);
        pnlFrontLayout.setHorizontalGroup(
            pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrontLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNew4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnNew5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrontLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFrontLayout.createSequentialGroup()
                        .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFrontLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFrontLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrontLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19)))))
                .addGap(65, 65, 65))
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(82, 82, 82))
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(85, 85, 85))
        );
        pnlFrontLayout.setVerticalGroup(
            pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(220, 203, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("Journal");

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("return1.png"))); // NOI18N
        btnHome.setOpaque(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnCorner.setIcon(new javax.swing.ImageIcon(getClass().getResource("corner1.png"))); // NOI18N
        btnCorner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCornerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCorner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCorner)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFront, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(pnlFront, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        close();
        dashboard d = new dashboard();
        d.setVisible(true);
    }                                       

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnNew1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btnNew2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btnNew3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btnNew4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btnNew5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btnCornerActionPerformed(java.awt.event.ActionEvent evt) {                                          
        profile p = new profile();
        close();
        p.setVisible(true);
    }                                         

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
            java.util.logging.Logger.getLogger(journal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(journal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(journal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(journal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new journal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCorner;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNew1;
    private javax.swing.JButton btnNew2;
    private javax.swing.JButton btnNew3;
    private javax.swing.JButton btnNew4;
    private javax.swing.JButton btnNew5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlFront;
    // End of variables declaration                   
}
