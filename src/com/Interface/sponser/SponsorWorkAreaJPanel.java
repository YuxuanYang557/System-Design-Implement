/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface.sponser;

import com.Business.Ecosys.EcoSystem;
import com.Business.Network.Network;
import com.Business.advertisement.Advertisement;
import com.Business.advertisement.AdvertisementList;
import com.Business.database.DB4OUtil;
import com.Business.enterprise.Enterprise;
import com.Business.sponsor.Sponsor;
import com.Business.user.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yangyuxuan
 */
public class SponsorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SponsorWorkArea
     */
    private JPanel rightPanel;
    private Sponsor sponsor;
    DB4OUtil db4o;
    User user;
    EcoSystem ecosystem;
    Enterprise enterprise;
    public SponsorWorkAreaJPanel(JPanel rightPanel, DB4OUtil db4o, User user, EcoSystem ecosystem, Enterprise enterprise) {
        initComponents();
        this.rightPanel = rightPanel;
        this.sponsor = sponsor;
        this.db4o = db4o;
        this.user = user;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        GenerateName();
        //populate1();
    }

    public void GenerateName(){
        usernameJL.setText(user.getUserName());
    }
//    public void populate1(){
//        int rowCount = networkTbl.getRowCount();
//   
//        DefaultTableModel dtm = (DefaultTableModel)networkTbl.getModel();
//        for(int i = rowCount - 1; i >=0; i--) {
//            dtm.removeRow(i);
//        }
//        
//        for(Network n : ecosystem.getNetworkList().getNetworkList()){
//            Object row[] = new Object[1];
//            row[0] = n;
//            dtm.addRow(row);
//        
//        }
//    }
//    
//    public void populate3(){
//         int row1 = networkTbl.getSelectedRow();
//         Network network  = (Network)networkTbl.getValueAt(row1, 0);
//         int row2 = enterpriseTypeTbl.getSelectedRow();
//         String typeName = enterpriseTypeTbl.getValueAt(row2, 0).toString();
//         
//         int rowCount = enterpriseTbl.getRowCount();
//         DefaultTableModel dtm = (DefaultTableModel)enterpriseTbl.getModel();
//         for(int i = rowCount - 1; i >=0; i--) {
//            dtm.removeRow(i);
//        }
//           for(Enterprise e : network.getEnterpriseList().getEnterpriseList()){
//                 if(e.getEnterpriseType().equals(typeName)){
//                    Object row[] = new Object[2];          
//                    row[0] = e;
//                    dtm.addRow(row);   
//                 }
//        }
//    }
//    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usernameJL = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("Sponsor Work Area");

        manageBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        manageBtn.setText("Manage Advertisements");
        manageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBtnActionPerformed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        createBtn.setText("Create Advertisement");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Welcome back,");

        usernameJL.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        usernameJL.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameJL)
                .addContainerGap(726, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addComponent(manageBtn)
                    .addComponent(createBtn))
                .addGap(369, 369, 369))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameJL))
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(manageBtn)
                .addGap(18, 18, 18)
                .addComponent(createBtn)
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBtnActionPerformed
        // TODO add your handling code here:
        ManageAdvertisementJPanel jPanel = new ManageAdvertisementJPanel(rightPanel, db4o, user, ecosystem, enterprise);
        rightPanel.add("ManageAdvertisementJPanel", jPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        
    }//GEN-LAST:event_manageBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
//        int row = enterpriseTbl.getSelectedRow();
//        if(row<0) {
//            JOptionPane.showMessageDialog(null, "Please select any row!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        Advertisement ad = new Advertisement(user, user.getEnterprise());
        CreateAdvertisementJPanel jPanel = new CreateAdvertisementJPanel(rightPanel, db4o, user, ecosystem, ad);
        rightPanel.add("CreateAdvertisementJPanel", jPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageBtn;
    private javax.swing.JLabel usernameJL;
    // End of variables declaration//GEN-END:variables
}
