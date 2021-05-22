
import java.awt.event.*;
import java.awt.Toolkit;

import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;


public class home extends javax.swing.JFrame {
        
    
    ArrayList<String> list = new ArrayList<String>();
    
   
    void showDate(){
       Date d = new Date();
       
       SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
       txtDate.setText(s.format(d));
        
    }
    public home() {
        initComponents();
        showDate();
        list.add("I don't believe you have to be better than everybody else. I believe you have to be better than you ever thought you could be - Ken Venturi");
        list.add("Life is 10% what happens to you and 90% how you react to it - Charles R. Swindoll");
        list.add("Aim for the moon. If you miss, you may hit a star -  W. Clement Stone");
        list.add("Only I can change my life. No one can do it for me - Carol Burnett");
        list.add("Start where you are. Use what you have. Do what you can - Arthur Ashe");
        
        int ind = (int)(Math.random()*(list.size()));
        
        txtQuote.setText('"' + list.get(ind) + '"');
        
         txtQuote.setLineWrap(true);
         txtQuote.setWrapStyleWord(true);
        
  
    }

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        pnlFront = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuote = new javax.swing.JTextArea();
        btnStart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        btnCorner = new javax.swing.JButton();

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(33, 45, 100));

        jPanel1.setBackground(new java.awt.Color(245, 249, 255));

        pnlFront.setBackground(new java.awt.Color(219, 234, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("How are you feeling today?");

        txtQuote.setColumns(20);
        txtQuote.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtQuote.setRows(5);
        jScrollPane1.setViewportView(txtQuote);

        btnStart.setBackground(new java.awt.Color(117, 243, 137));
        btnStart.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        btnStart.setText("Get started");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Hello, Steven!");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jRadioButton2.setText("Bad");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jRadioButton3.setText("Normal");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jRadioButton4.setText("Happy");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jRadioButton5.setText("Couldn't be happier!");

        javax.swing.GroupLayout pnlFrontLayout = new javax.swing.GroupLayout(pnlFront);
        pnlFront.setLayout(pnlFrontLayout);
        pnlFrontLayout.setHorizontalGroup(
            pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFrontLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFrontLayout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(8, 8, 8)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5))
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addGroup(pnlFrontLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnStart)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnlFrontLayout.setVerticalGroup(
            pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrontLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(pnlFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnStart)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(219, 234, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("Home");

        txtDate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtDate.setText("jLabel4");

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtDate)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCorner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(btnCorner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFront, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnlFront, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        
        
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {                                         
           close();
           dashboard d = new dashboard();
           d.setVisible(true);
    }                                        

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCorner;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlFront;
    private javax.swing.JLabel txtDate;
    private javax.swing.JTextArea txtQuote;
    // End of variables declaration                   
}
