/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface.streamer;

import com.Business.Ecosys.EcoSystem;
import com.Business.advertisement.Advertisement;
import com.Business.database.DB4OUtil;
import com.Business.user.User;
import com.Interface.admin.AdminWorkArea;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author yangyuxuan
 */
public class StreamerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form StreamerWorkArea
     */
    JPanel rightPanel;
    DB4OUtil db4o;
    User user;
    EcoSystem ecosystem;
    Advertisement ad;
    
    public StreamerWorkArea(JPanel rightPanel, DB4OUtil db4o, User user,EcoSystem ecosystem) {
        initComponents();
        this.rightPanel = rightPanel;
        this.user = user;
        this.db4o = db4o;
        this.ecosystem = ecosystem;
        GenerateName();

    }
    
    public void GenerateName(){
        usernameJL.setText(user.getUserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usernameJL = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 24)); // NOI18N
        jLabel1.setText("Streamer Work Area");

        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jButton1.setText("View Avaliable Advertisements");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jButton2.setText("View my advertisements");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Welcome back, ");

        usernameJL.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        usernameJL.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameJL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jLabel1))))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameJL))
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addContainerGap(308, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewAvaAdvertisements jPanel = new ViewAvaAdvertisements(rightPanel, db4o, user, ad, ecosystem);
        rightPanel.add("AvaAd", jPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ViewStreamerAds jPanel = new ViewStreamerAds(rightPanel, db4o, user,ecosystem);
        rightPanel.add("myApplyads", jPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel usernameJL;
    // End of variables declaration//GEN-END:variables
}
