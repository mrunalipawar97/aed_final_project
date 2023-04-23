/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodQualityAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodQualityOrganization.NutritionAuditor;
import catering.system.Users.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author mrunalipawar
 */
public class NutritionAuditorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NutritionAuditorWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    ApplicationSystem system;
    UserAccount userAccount;
    NutritionAuditor nu;
    
    public NutritionAuditorWorkAreaJPanel() {
        initComponents();
    }
     
    public NutritionAuditorWorkAreaJPanel(JPanel userProcessContainer, ApplicationSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        nameLable.setText("Welcome Nutrition Auditor ");
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLable = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        auditingButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        feedbackPortalButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLable.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        add(nameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 470, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        auditingButton.setBackground(new java.awt.Color(255, 203, 162));
        auditingButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        auditingButton.setForeground(new java.awt.Color(51, 51, 51));
        auditingButton.setText("Auditing/Reporting");
        auditingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auditingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(auditingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(auditingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 430, 330));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        feedbackPortalButton.setBackground(new java.awt.Color(255, 203, 162));
        feedbackPortalButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        feedbackPortalButton.setForeground(new java.awt.Color(51, 51, 51));
        feedbackPortalButton.setText("Feedback Portal");
        feedbackPortalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackPortalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(feedbackPortalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(feedbackPortalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 410, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void auditingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auditingButtonActionPerformed
        AuditingReportingJPanel ar= new AuditingReportingJPanel(userProcessContainer,system);
        userProcessContainer.add("auditingReportingJPanel",ar);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_auditingButtonActionPerformed

    private void feedbackPortalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackPortalButtonActionPerformed
        // TODO add your handling code here:
        AuditorFeedbackJPanel feedback = new AuditorFeedbackJPanel(userProcessContainer, system);
        userProcessContainer.add("auditorFeedbackJPanel",feedback);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_feedbackPortalButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton auditingButton;
    private javax.swing.JButton feedbackPortalButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nameLable;
    // End of variables declaration//GEN-END:variables
}
