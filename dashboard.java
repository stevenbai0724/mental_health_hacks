
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
 
/*
public void close(){
    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
}


*/


public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlFront = new javax.swing.JPanel();
        btnJournal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
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

        pnlFront.setBackground(new java.awt.Color(219, 234, 255));

        btnJournal.setBackground(new java.awt.Color(252, 211, 163));
        btnJournal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnJournal.setIcon(new javax.swing.ImageIcon(getClass().getResource("journal1.png"))); // NOI18N
        btnJournal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJournalActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(195, 197, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dailyGoals1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(182, 233, 233));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("network1.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnChat.setBackground(new java.awt.Color(245, 236, 180));
        btnChat.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("chat1.png"))); // NOI18N
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });

        btnStats.setBackground(new java.awt.Color(156, 191, 245));
        btnStats.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("statistics1.png"))); // NOI18N
        btnStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Journal");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Daily Goals");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Chat");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Network");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Statistics");

        javax.swing.GroupLayout pnlFrontLayout = new javax.swing.GroupLayout(pnlFront);
        pnlFront.setLayout(pnlFrontLayout);
        pnlFrontLayout.setHorizontalGroup(
            pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFrontLayout.createSequentialGroup()
                        .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFrontLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(50, 50, 50))
                            .addGroup(pnlFrontLayout.createSequentialGroup()
                                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnChat, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)))
                        .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFrontLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6))
                            .addComponent(btnStats, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(btnJournal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(88, 88, 88))
        );
        pnlFrontLayout.setVerticalGroup(
            pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnJournal)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFrontLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStats, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFrontLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(219, 234, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("Dashboard");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnCorner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCorner)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFront, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFront, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
     
        public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        }
        
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        close();
        home h = new home();
        h.setVisible(true);
    }                                       

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dailyGoals dg = new dailyGoals();
        close();
        
        dg.setVisible(true);
        
        
    }                                        

    private void btnJournalActionPerformed(java.awt.event.ActionEvent evt) {                                           
        close();
        journal j = new journal();
        j.setVisible(true);
    }                                          

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        network n = new network();
        close();
        n.setVisible(true);
    }                                        

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {                                        
        chat c = new chat();
        close();
        c.setVisible(true);
    }                                       

    private void btnStatsActionPerformed(java.awt.event.ActionEvent evt) {                                         
        statistics st = new statistics();
        close();
        st.setVisible(true);
    }                                        

    private void btnCornerActionPerformed(java.awt.event.ActionEvent evt) {                                          
        profile p = new profile();
        close();
        p.setVisible(true);
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnCorner;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnJournal;
    private javax.swing.JButton btnStats;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
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
