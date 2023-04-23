/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodQualityAdminWorkArea;

import business.ApplicationSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nishipancholi
 */
public class FoodQualityAdminMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodProdAdminMainJPanel
     */
    JPanel userProcessContainer;
    ApplicationSystem system;
    
    public FoodQualityAdminMainJPanel() {
        initComponents();
    }

    public FoodQualityAdminMainJPanel(JPanel userProcessContainer, ApplicationSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCourseHeaderLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        addNutritionAuditorButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        auditorReportPortalButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addCourseHeaderLabel.setFont(new java.awt.Font("Kannada MN", 1, 20)); // NOI18N
        addCourseHeaderLabel.setText("FOOD QUALITY ADMIN PORTAL");
        add(addCourseHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 350, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(0, 108, 103));

        addNutritionAuditorButton.setBackground(new java.awt.Color(255, 255, 204));
        addNutritionAuditorButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        addNutritionAuditorButton.setForeground(new java.awt.Color(51, 51, 51));
        addNutritionAuditorButton.setText("Add Nutrition Auditor");
        addNutritionAuditorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNutritionAuditorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(addNutritionAuditorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(addNutritionAuditorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 260, 200));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        auditorReportPortalButton.setBackground(new java.awt.Color(255, 255, 204));
        auditorReportPortalButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        auditorReportPortalButton.setForeground(new java.awt.Color(51, 51, 51));
        auditorReportPortalButton.setText("Auditor Report Portal");
        auditorReportPortalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auditorReportPortalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(auditorReportPortalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(auditorReportPortalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 260, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void addNutritionAuditorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNutritionAuditorButtonActionPerformed
        NutritionAuditorJPanel na= new NutritionAuditorJPanel(userProcessContainer, system);
        userProcessContainer.add("nutritionAuditorJPanel",na);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addNutritionAuditorButtonActionPerformed

    private void auditorReportPortalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auditorReportPortalButtonActionPerformed
        // TODO add your handling code here:
        AuditorFeedbackJPanel feedback= new AuditorFeedbackJPanel(userProcessContainer, system);
        userProcessContainer.add("auditorFeedbackJPanel",feedback);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_auditorReportPortalButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCourseHeaderLabel;
    private javax.swing.JButton addNutritionAuditorButton;
    private javax.swing.JButton auditorReportPortalButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
