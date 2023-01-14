/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalprojectUserInterface;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectUserInterface.Administration.AdminMainPageForm;
import finalprojectUserInterface.DonationCentreInterface.DonarBankLandingPage;
import finalprojectUserInterface.NGOInterface.NGOLandingPage;
import finalprojectUserInterface.AnalyticsInterface.AnalystCoverPage;
import finalprojectUserInterface.SupplyChainInterface.LogisticsFrontPage;



import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.swing.*;
import java.awt.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
/**
 *
 * @author sneha
 */
public class MainJFrameForm extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrameForm
     */
    
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility = DB4OUtility.getInstance();
    
    ImageIcon myImageIcon;

    public ImageIcon setIconImage(String img) {
        if (img != null) {
            myImageIcon = new ImageIcon(img);
        }
        Image image1 = myImageIcon.getImage();
        Image image2 = image1.getScaledInstance(442, 266, Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(image2);
        return i;

    }
    
    public MainJFrameForm() {
        initComponents();
        this.setSize(1200, 750);
        this.operatingSystem = dB4OUtility.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPageSplit = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        CategoryTitle = new javax.swing.JLabel();
        exitlbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        PanelLogistics = new javax.swing.JPanel();
        Logicon_lbl = new javax.swing.JLabel();
        lbl_Log = new javax.swing.JLabel();
        Paneldonor = new javax.swing.JPanel();
        Donobankicon_lbl = new javax.swing.JLabel();
        lbl_DonorBank = new javax.swing.JLabel();
        PanelAnalytics = new javax.swing.JPanel();
        labicon_lbl = new javax.swing.JLabel();
        lbl_Analystics = new javax.swing.JLabel();
        PanelAdmin = new javax.swing.JPanel();
        Adminicon_lbl = new javax.swing.JLabel();
        lbl_Admin = new javax.swing.JLabel();
        PanelNGO = new javax.swing.JPanel();
        Hosicon_lbl = new javax.swing.JLabel();
        lbl_NGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(1000, 800));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CategoryTitle.setFont(new java.awt.Font("STSong", 1, 36)); // NOI18N
        CategoryTitle.setForeground(new java.awt.Color(51, 51, 51));
        CategoryTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CategoryTitle.setText("NGO Donation Management System");
        jPanel3.add(CategoryTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 860, 50));

        exitlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/icons8-close-50.png"))); // NOI18N
        exitlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitlblMouseClicked(evt);
            }
        });
        jPanel3.add(exitlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 58, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/charityAnimation (4).gif"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 820, 420));

        MainPageSplit.setRightComponent(jPanel3);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogistics.setBackground(new java.awt.Color(255, 102, 102));
        PanelLogistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelLogisticsjPanel4MouseClicked(evt);
            }
        });

        Logicon_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logicon_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/supply chain icon (1).png"))); // NOI18N

        lbl_Log.setBackground(new java.awt.Color(51, 51, 51));
        lbl_Log.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_Log.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Log.setText("Supply Chain");

        javax.swing.GroupLayout PanelLogisticsLayout = new javax.swing.GroupLayout(PanelLogistics);
        PanelLogistics.setLayout(PanelLogisticsLayout);
        PanelLogisticsLayout.setHorizontalGroup(
            PanelLogisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogisticsLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(Logicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        PanelLogisticsLayout.setVerticalGroup(
            PanelLogisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Log)
                .addGap(14, 14, 14))
        );

        jPanel10.add(PanelLogistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 330, 140));

        Paneldonor.setBackground(new java.awt.Color(255, 102, 102));
        Paneldonor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneldonorMouseClicked(evt);
            }
        });

        Donobankicon_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Donobankicon_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/donation center icon (2).png"))); // NOI18N

        lbl_DonorBank.setBackground(new java.awt.Color(51, 51, 51));
        lbl_DonorBank.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_DonorBank.setForeground(new java.awt.Color(51, 51, 51));
        lbl_DonorBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DonorBank.setText("Donation Center");

        javax.swing.GroupLayout PaneldonorLayout = new javax.swing.GroupLayout(Paneldonor);
        Paneldonor.setLayout(PaneldonorLayout);
        PaneldonorLayout.setHorizontalGroup(
            PaneldonorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldonorLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Donobankicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
            .addComponent(lbl_DonorBank, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PaneldonorLayout.setVerticalGroup(
            PaneldonorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneldonorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Donobankicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lbl_DonorBank)
                .addGap(14, 14, 14))
        );

        jPanel10.add(Paneldonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 330, 150));

        PanelAnalytics.setBackground(new java.awt.Color(255, 102, 102));
        PanelAnalytics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelAnalyticsMouseClicked(evt);
            }
        });

        labicon_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labicon_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/AnalystIcon 100.jpeg"))); // NOI18N

        lbl_Analystics.setBackground(new java.awt.Color(51, 51, 51));
        lbl_Analystics.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_Analystics.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Analystics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Analystics.setText("Analysis");

        javax.swing.GroupLayout PanelAnalyticsLayout = new javax.swing.GroupLayout(PanelAnalytics);
        PanelAnalytics.setLayout(PanelAnalyticsLayout);
        PanelAnalyticsLayout.setHorizontalGroup(
            PanelAnalyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Analystics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAnalyticsLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(labicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        PanelAnalyticsLayout.setVerticalGroup(
            PanelAnalyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAnalyticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Analystics)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel10.add(PanelAnalytics, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 330, 150));

        PanelAdmin.setBackground(new java.awt.Color(255, 102, 102));
        PanelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelAdminMouseClicked(evt);
            }
        });

        Adminicon_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adminicon_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/admin (3) (1).png"))); // NOI18N

        lbl_Admin.setBackground(new java.awt.Color(255, 102, 102));
        lbl_Admin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_Admin.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Admin.setText("Admin");

        javax.swing.GroupLayout PanelAdminLayout = new javax.swing.GroupLayout(PanelAdmin);
        PanelAdmin.setLayout(PanelAdminLayout);
        PanelAdminLayout.setHorizontalGroup(
            PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdminLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Adminicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAdminLayout.setVerticalGroup(
            PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Adminicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Admin)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel10.add(PanelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 140));

        PanelNGO.setBackground(new java.awt.Color(255, 102, 102));
        PanelNGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNGOMouseClicked(evt);
            }
        });

        Hosicon_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hosicon_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/NGOIcon2 (2) (1).jpeg"))); // NOI18N
        Hosicon_lbl.setMaximumSize(new java.awt.Dimension(48, 48));
        Hosicon_lbl.setMinimumSize(new java.awt.Dimension(48, 48));
        Hosicon_lbl.setPreferredSize(new java.awt.Dimension(48, 48));

        lbl_NGO.setBackground(new java.awt.Color(51, 51, 51));
        lbl_NGO.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_NGO.setForeground(new java.awt.Color(51, 51, 51));
        lbl_NGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NGO.setText("NGO");

        javax.swing.GroupLayout PanelNGOLayout = new javax.swing.GroupLayout(PanelNGO);
        PanelNGO.setLayout(PanelNGOLayout);
        PanelNGOLayout.setHorizontalGroup(
            PanelNGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_NGO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelNGOLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Hosicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        PanelNGOLayout.setVerticalGroup(
            PanelNGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNGOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Hosicon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_NGO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel10.add(PanelNGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 330, 150));

        MainPageSplit.setLeftComponent(jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPageSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 1345, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPageSplit)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void sendEmail() {

        try {
            Properties propertiesEmail = new Properties();
//            propertiesEmail.put("mail.smtp.auth", "true");
//            propertiesEmail.put("mail.smtp.starttls.enable", "true");
//            propertiesEmail.put("mail.smtp.host", "smtp.gmail.com");
//            propertiesEmail.put("mail.smtp.port", "587");
            propertiesEmail.put("mail.smtp.user", "username");
            
            propertiesEmail.put("mail.smtp.host", "smtp.gmail.com");
            propertiesEmail.put("mail.smtp.port", "25");
            propertiesEmail.put("mail.debug", "true");
            propertiesEmail.put("mail.smtp.auth", "true");
            propertiesEmail.put("mail.smtp.starttls.enable", "true");
            propertiesEmail.put("mail.smtp.EnableSSL.enable", "true");

            propertiesEmail.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            propertiesEmail.setProperty("mail.smtp.socketFactory.fallback", "false");
            propertiesEmail.setProperty("mail.smtp.port", "465");
            propertiesEmail.setProperty("mail.smtp.socketFactory.port", "465");
            String myAccountEmail = "snehagiranje04@gmail.com";
            String password = "14Siam@!VSG0824";
            Session session;
            session = Session.getInstance(propertiesEmail, new javax.mail.Authenticator() {
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(myAccountEmail, password);
                }
            });
            Message mailmsg = prepareEmail(session, myAccountEmail, "snehagiranje05@gmail.com", "msg", "sub");
            Transport.send(mailmsg);
// System.out.println("Successful sent");
        } catch (MessagingException ex) {
            ex.printStackTrace();
//            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static Message prepareEmail(Session sessions, String myEmailAccount, String toEmailAddress, String msgemail, String subjectemail) {

        try {
            Message emailmsg = new MimeMessage(sessions);emailmsg.setFrom(new InternetAddress(myEmailAccount));emailmsg.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmailAddress));
            emailmsg.setSubject(subjectemail);emailmsg.setText(msgemail);
            return emailmsg;
        } catch (MessagingException ex) {
            ex.printStackTrace();
              //JOptionPane.showMessageDialog(this,"Error sending mail");
//            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    
    private void PanelLogisticsjPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogisticsjPanel4MouseClicked
        // TODO add your handling code here:
        //logistics
        LogisticsFrontPage LogisticsFrontPage = new LogisticsFrontPage(this, dB4OUtility, operatingSystem);
        MainPageSplit.setRightComponent(LogisticsFrontPage);
    }//GEN-LAST:event_PanelLogisticsjPanel4MouseClicked

    private void PaneldonorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneldonorMouseClicked
        // TODO add your handling code here:
        //Donor Bank
        DonarBankLandingPage DonorBankLandingPage = new DonarBankLandingPage(this, dB4OUtility, operatingSystem);
        MainPageSplit.setRightComponent(DonorBankLandingPage);
    }//GEN-LAST:event_PaneldonorMouseClicked

    private void PanelAnalyticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAnalyticsMouseClicked
        // TODO add your handling code here:
        //Laboratory
        AnalystCoverPage MainLabCoverPage = new AnalystCoverPage(this, dB4OUtility, operatingSystem);
        MainPageSplit.setRightComponent(MainLabCoverPage);
    }//GEN-LAST:event_PanelAnalyticsMouseClicked

    private void PanelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAdminMouseClicked
        // TODO add your handling code here:
        //Admin
        AdminMainPageForm AdminPage = new AdminMainPageForm(this, dB4OUtility, operatingSystem);
        MainPageSplit.setRightComponent(AdminPage);
    }//GEN-LAST:event_PanelAdminMouseClicked

    private void PanelNGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelNGOMouseClicked
        // TODO add your handling code here:
        //Hospital
        NGOLandingPage HospitalLandingPage = new NGOLandingPage(this, dB4OUtility, operatingSystem);
        MainPageSplit.setRightComponent(HospitalLandingPage);
    }//GEN-LAST:event_PanelNGOMouseClicked

    private void exitlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlblMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitlblMouseClicked

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
            java.util.logging.Logger.getLogger(MainJFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrameForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adminicon_lbl;
    private javax.swing.JLabel CategoryTitle;
    private javax.swing.JLabel Donobankicon_lbl;
    private javax.swing.JLabel Hosicon_lbl;
    private javax.swing.JLabel Logicon_lbl;
    private javax.swing.JSplitPane MainPageSplit;
    private javax.swing.JPanel PanelAdmin;
    private javax.swing.JPanel PanelAnalytics;
    private javax.swing.JPanel PanelLogistics;
    private javax.swing.JPanel PanelNGO;
    private javax.swing.JPanel Paneldonor;
    private javax.swing.JLabel exitlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labicon_lbl;
    private javax.swing.JLabel lbl_Admin;
    private javax.swing.JLabel lbl_Analystics;
    private javax.swing.JLabel lbl_DonorBank;
    private javax.swing.JLabel lbl_Log;
    private javax.swing.JLabel lbl_NGO;
    // End of variables declaration//GEN-END:variables
}
