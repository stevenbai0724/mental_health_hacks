
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
 



public class network extends javax.swing.JFrame {

    /**
     * Creates new form network
     */
    public network() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlFront = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSleep = new javax.swing.JButton();
        btnWork = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnCorner = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 249, 255));
        jPanel1.setToolTipText("");

        pnlFront.setBackground(new java.awt.Color(201, 250, 227));

        jLabel4.setBackground(new java.awt.Color(201, 250, 227));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setText("Trending");
        jLabel4.setOpaque(true);

        btnSleep.setBackground(new java.awt.Color(252, 203, 146));
        btnSleep.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSleep.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep1.png"))); // NOI18N
        btnSleep.setText("Why you feel tired ");
        btnSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSleepActionPerformed(evt);
            }
        });

        btnWork.setBackground(new java.awt.Color(219, 180, 243));
        btnWork.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnWork.setIcon(new javax.swing.ImageIcon(getClass().getResource("work1.png"))); // NOI18N
        btnWork.setText("Get more work done");
        btnWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFrontLayout = new javax.swing.GroupLayout(pnlFront);
        pnlFront.setLayout(pnlFrontLayout);
        pnlFrontLayout.setHorizontalGroup(
            pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(btnSleep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWork, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFrontLayout.setVerticalGroup(
            pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnWork, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(201, 250, 227));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("Network");

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

        jLabel1.setBackground(new java.awt.Color(201, 250, 227));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        jLabel1.setText("You're not alone!");
        jLabel1.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(201, 250, 227));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("Learn with others, ");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnCorner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCorner)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFront, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFront, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        close();
        dashboard h = new dashboard();
        h.setVisible(true);
    }                                       

    private void btnCornerActionPerformed(java.awt.event.ActionEvent evt) {                                          
        profile p = new profile();
        close();
        p.setVisible(true);
    }                                         

    private void btnSleepActionPerformed(java.awt.event.ActionEvent evt) {                                         
         try {
         
                Desktop.getDesktop().browse(new URI("https://www.activehealth.sg/read/sleep/why-do-i-still-feel-tired-after-8-hours-of-sleep#:~:text=One%20of%20the%20simplest%20explanations,than%20the%20quantity%20of%20it."));
         
            } catch (IOException | URISyntaxException e1) {
                e1.printStackTrace();
            }
    }                                        

    private void btnWorkActionPerformed(java.awt.event.ActionEvent evt) {                                        
                 try {
         
                Desktop.getDesktop().browse(new URI("https://www.inc.com/neil-patel/16-tips-for-getting-90-of-your-work-done-in-the-morning.html"));
         
            } catch (IOException | URISyntaxException e1) {
                e1.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(network.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(network.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(network.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(network.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new network().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCorner;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSleep;
    private javax.swing.JButton btnWork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlFront;
    // End of variables declaration                   
}
