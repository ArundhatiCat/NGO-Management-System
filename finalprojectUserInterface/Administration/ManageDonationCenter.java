/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.DonationCentre.BankDonor;
import finalprojectBackend.Enterprise.DonationCentre.UserDonor;
import finalprojectUserInterface.MainJFrameForm;

/**
 *
 * @author sneha
 */
public class ManageDonationCenter extends javax.swing.JPanel {

    /**
     * Creates new form ManageDonationCenter
     */
    MainJFrameForm MainLoginPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;

    public ManageDonationCenter(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        populateDonorBankTable();
        populateDonorTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPanebBankdetails = new javax.swing.JScrollPane();
        tableDCDetails = new javax.swing.JTable();
        jScrollPaneDonarDetails = new javax.swing.JScrollPane();
        tableDonorDetails = new javax.swing.JTable();
        btnDelete1 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        lbl_DCdetails = new javax.swing.JLabel();
        lbl_Donardetails = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        tableDCDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Registered Number", "Enterprise Name"
            }
        ));
        jScrollPanebBankdetails.setViewportView(tableDCDetails);

        tableDonorDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Name", "Donation Center Name"
            }
        ));
        jScrollPaneDonarDetails.setViewportView(tableDonorDetails);

        btnDelete1.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnDelete2.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete2.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete2.setText("Delete");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        lbl_DCdetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbl_DCdetails.setText("Donation Center Details");

        lbl_Donardetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbl_Donardetails.setText("Donor Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Donardetails)
                    .addComponent(lbl_DCdetails)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPanebBankdetails, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                            .addComponent(jScrollPaneDonarDetails))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete1, btnDelete2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(76, Short.MAX_VALUE)
                        .addComponent(lbl_DCdetails)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPanebBankdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_Donardetails)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPaneDonarDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(399, 399, 399))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete1, btnDelete2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableDCDetails.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tableDCDetails.getModel();
        String doctorUName = model.getValueAt(selectedRow, 0).toString();
        System.out.println(" donorbank uname: " + doctorUName);
        operatingSystem.deleteBankDonor(doctorUName);
        dB4OUtility.storeSystem(operatingSystem);
        populateDonorBankTable();
        populateDonorTable();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableDonorDetails.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tableDonorDetails.getModel();
        String doctorUName = model.getValueAt(selectedRow, 0).toString();
        System.out.println(" donor uname: " + doctorUName);
        operatingSystem.donorDelete(doctorUName);
        dB4OUtility.storeSystem(operatingSystem);
        populateDonorBankTable();
        populateDonorTable();
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void populateDonorTable() {
        DefaultTableModel model = (DefaultTableModel) tableDonorDetails.getModel();
        model.setRowCount(0);

        for (UserDonor d : operatingSystem.getUserDonorDirectory()) {

            Object[] row = new Object[5];
            row[0] = d.getpName();
            row[1] = d.getNamePerson();
            row[2]= d.getBankDonorName();
            model.addRow(row);

        }

    }
    
    private void populateDonorBankTable() {
        DefaultTableModel model = (DefaultTableModel) tableDCDetails.getModel();
        model.setRowCount(0);

        for (BankDonor d : operatingSystem.getBankDonorDirectory()) {

            Object[] row = new Object[5];
            row[0] = d.getpName();
            row[1] = d.getRegisteredNumber();
            row[2] = d.getNameEnterprise();
            model.addRow(row);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneDonarDetails;
    private javax.swing.JScrollPane jScrollPanebBankdetails;
    private javax.swing.JLabel lbl_DCdetails;
    private javax.swing.JLabel lbl_Donardetails;
    private javax.swing.JTable tableDCDetails;
    private javax.swing.JTable tableDonorDetails;
    // End of variables declaration//GEN-END:variables
}
