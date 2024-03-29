/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface.admin;

import com.Business.Ecosys.EcoSystem;
import com.Business.Network.Network;
import com.Business.Network.NetworkDirectory;
import com.Business.database.DB4OUtil;
import com.Business.enterprise.Enterprise;
import com.Business.sponsor.SponsorDirectory;
import com.project.Interface.MainJFrame;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yangyuxuan
 */
public class AdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkArea
     */

    MainJFrame mjf;
    JPanel userContainer;
    EcoSystem ecosystem;
    JPanel rightPanel;
    DB4OUtil db4o;
    public AdminWorkArea(DB4OUtil db4o,JPanel rightPanel,EcoSystem ecosystem) {
        initComponents();
        this.mjf = mjf;
        this.db4o = db4o;
        this.rightPanel = rightPanel;
        this.ecosystem = ecosystem;
       
        populate1();
     //   populate3();
    }


    
    public void populate1(){ 
        int rowCount = networkTbl.getRowCount();
   
        DefaultTableModel dtm = (DefaultTableModel)networkTbl.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            dtm.removeRow(i);
        }
        
        for(Network n : ecosystem.getNetworkList().getNetworkList()){
            Object row[] = new Object[1];
            row[0] = n;
            dtm.addRow(row);
        }
        
        //usernameJL.setText();
    }
    
    public void populate3(){
         int row1 = networkTbl.getSelectedRow();
         Network network  = (Network)networkTbl.getValueAt(row1, 0);
         int row2 = enterpriseTypeTbl.getSelectedRow();
         String typeName = enterpriseTypeTbl.getValueAt(row2, 0).toString();
         
         int rowCount = enterpriseTbl.getRowCount();
         DefaultTableModel dtm = (DefaultTableModel)enterpriseTbl.getModel();
         for(int i = rowCount - 1; i >=0; i--) {
            dtm.removeRow(i);
        }
//         for(Network n: ecosystem.getNetworkList().getNetworkList()){
//             for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
           for(Enterprise e : network.getEnterpriseList().getEnterpriseList()){
                 if(e.getEnterpriseType().equals(typeName)){
                    Object row[] = new Object[2];          
                    row[0] = e;
                    dtm.addRow(row);   
                 }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTypeTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        enterpriseTbl = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        networkTbl = new javax.swing.JTable();
        addNetworkBtn = new javax.swing.JButton();
        deleteNetworkBtn = new javax.swing.JButton();
        deleteNetworkBtn1 = new javax.swing.JButton();
        addEnterpriseBtn = new javax.swing.JButton();
        selectTypeBtn = new javax.swing.JButton();
        magUserBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usernameJL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        enterpriseTypeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Advertisement Company"},
                {"Live Platform"}
            },
            new String [] {
                "enterprise type"
            }
        ));
        jScrollPane1.setViewportView(enterpriseTypeTbl);

        enterpriseTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "select an enterprise"
            }
        ));
        jScrollPane2.setViewportView(enterpriseTbl);

        networkTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "select a network"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(networkTbl);

        addNetworkBtn.setText("+");
        addNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkBtnActionPerformed(evt);
            }
        });

        deleteNetworkBtn.setText("-");
        deleteNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNetworkBtnActionPerformed(evt);
            }
        });

        deleteNetworkBtn1.setText("-");
        deleteNetworkBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNetworkBtn1ActionPerformed(evt);
            }
        });

        addEnterpriseBtn.setText("+");
        addEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnterpriseBtnActionPerformed(evt);
            }
        });

        selectTypeBtn.setText("Select Type");
        selectTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTypeBtnActionPerformed(evt);
            }
        });

        magUserBtn.setText("Manager UserAccount");
        magUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magUserBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Welcome back, System Administrator");

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 24)); // NOI18N
        jLabel1.setText("System Admin work area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(usernameJL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(deleteNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(selectTypeBtn)
                        .addGap(82, 82, 82)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteNetworkBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(353, 353, 353))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(magUserBtn)
                        .addGap(368, 368, 368))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(usernameJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectTypeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteNetworkBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60)
                .addComponent(magUserBtn)
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkBtnActionPerformed
        // TODO add your handling code here:
        CreateNetworkJPanel jPanel = new CreateNetworkJPanel(db4o,rightPanel,ecosystem);
        rightPanel.add("CreateNetworkJPanel", jPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_addNetworkBtnActionPerformed

    private void deleteNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNetworkBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = networkTbl.getSelectedRow();
        if(selectedRow >=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                ecosystem.getNetworkList().getNetworkList().remove(selectedRow);
                db4o.storeSystem(ecosystem);
                populate1();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row before delete", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteNetworkBtnActionPerformed
  
    private void selectTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTypeBtnActionPerformed
        // TODO add your handling code here:
         int row = enterpriseTypeTbl.getSelectedRow();
         int row2 = networkTbl.getSelectedRow();
         
         if(row2<0){
            JOptionPane.showMessageDialog(null, "Please select a network first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
         if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a enterprise type", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
            
        }
 
        populate3();
    }//GEN-LAST:event_selectTypeBtnActionPerformed

    private void addEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnterpriseBtnActionPerformed
        // TODO add your handling code here:
         int row1 = networkTbl.getSelectedRow();
         Network network  = (Network)networkTbl.getValueAt(row1, 0);
         int row = networkTbl.getSelectedRow();
         if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        CreateEnterpriseJPanel jPanel = new CreateEnterpriseJPanel(db4o,rightPanel,ecosystem,network);
        rightPanel.add("CreateNetworkJPanel", jPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_addEnterpriseBtnActionPerformed

    private void deleteNetworkBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNetworkBtn1ActionPerformed
         
         int selectedRow = networkTbl.getSelectedRow();
         Network network  = (Network)networkTbl.getValueAt(selectedRow, 0);
         
        if(selectedRow >=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                network.getEnterpriseList().getEnterpriseList().remove(selectedRow);
                db4o.storeSystem(ecosystem);
                populate3();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row before delete", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteNetworkBtn1ActionPerformed

    private void magUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magUserBtnActionPerformed
        // TODO add your handling code here:
        ManageUserJPanel jPanel = new ManageUserJPanel(db4o,rightPanel,ecosystem);
        rightPanel.add("CreateNetworkJPanel", jPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_magUserBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEnterpriseBtn;
    private javax.swing.JButton addNetworkBtn;
    private javax.swing.JButton deleteNetworkBtn;
    private javax.swing.JButton deleteNetworkBtn1;
    private javax.swing.JTable enterpriseTbl;
    private javax.swing.JTable enterpriseTypeTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton magUserBtn;
    private javax.swing.JTable networkTbl;
    private javax.swing.JButton selectTypeBtn;
    private javax.swing.JLabel usernameJL;
    // End of variables declaration//GEN-END:variables
}
