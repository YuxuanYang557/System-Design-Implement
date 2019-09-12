/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface.adAdmin;

import com.Business.Ecosys.EcoSystem;
import com.Business.advertisement.Advertisement;
import com.Business.database.DB4OUtil;
import com.Business.enterprise.Enterprise;
import com.Business.streamer.Streamer;
import com.Business.streamer.StreamerList;
import com.Business.user.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yangyuxuan
 */
public class CheckStreamerFeedbackJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckStreamerFeedbackJPanel
     */
    private DB4OUtil db4o;
    private JPanel rightPanel;
    private User user;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    private int therow;
    private Advertisement ad;
    public CheckStreamerFeedbackJPanel(JPanel rightPanel, DB4OUtil db4o, User user, Enterprise enterprisel,EcoSystem ecosystem) {
        initComponents();
        this.rightPanel = rightPanel;
        this.enterprise = enterprise;
        this.user = user;
        this.db4o = db4o;
        this.ecosystem = ecosystem;
        populate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     public void populate(){
        int rowCount = jTable1.getRowCount();
        System.out.println(rowCount);
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        for(int i = rowCount -1; i>=0; i++){
            dtm.removeRow(i);
        }
        
        for(Advertisement ad : user.getAdvertisementList().getAdertisements()){
            if(ad.getStatus().equals("Final checking")){
                Object row[] = new Object[dtm.getColumnCount()];
    //        System.out.println(user.getAdvertisementList().getAdertisements().size());
                row[0] = ad;
                row[1] = ad.getStreamer().getUserName();
                row[2] = ad.getStreamer().getStreamer().getPopularity();
                row[3] = ad.getStreamer().getEnterprise();
                row[4] = ad.getStatus();
                dtm.addRow(row); 
            
        }
        }
        
    }
     
        public Advertisement getAd(){
       // int rowCount = jTable1.getRowCount();
   //     DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
       // long id = 0;
      //  System.out.println(rowCount+"?");
        Advertisement col[] = new Advertisement[20]; 
            int i = 0;
            for(Advertisement ad: user.getAdvertisementList().getAdertisements()){ 
             col[i] = ad;
             i++;
        } 
        return col[therow];
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        strdetailBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Streamer Profile Review");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AD ID", "Applicant Name", "Popularity", "Platform", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        backBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        backBtn.setText("<<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        strdetailBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        strdetailBtn.setText("View Details");
        strdetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strdetailBtnActionPerformed(evt);
            }
        });

        jButton1.setText("hit me!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(strdetailBtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strdetailBtn)
                    .addComponent(backBtn))
                .addContainerGap(274, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void strdetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strdetailBtnActionPerformed
        // TODO add your handling code here:
            // TODO add your handling code here:
            int selectedRow = jTable1.getSelectedRow();
            
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Please select a row before you check the detail");
            }
            Advertisement ad = (Advertisement)jTable1.getValueAt(selectedRow, 0);
        ViewStreamerDetails jPanel = new ViewStreamerDetails(rightPanel, db4o,user, enterprise,ad,ecosystem);
        rightPanel.add("ViewStreamerDetails", jPanel);
        CardLayout layout  = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
              
        
        
    }//GEN-LAST:event_strdetailBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton strdetailBtn;
    // End of variables declaration//GEN-END:variables
}
