/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodProdAdminWorkArea;

import business.ApplicationSystem;
import catering.system.UI.ServiceEntAdminWorkArea.ManageHospitalsJPanel;
import catering.system.Users.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nishipancholi
 */
public class FoodProdAdminMainJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    ApplicationSystem system;

    /**
     * Creates new form FoodProdAdminMainJPanel
     */
    public FoodProdAdminMainJPanel() {
        initComponents();
    }

    public FoodProdAdminMainJPanel(JPanel userProcessContainer, ApplicationSystem business) {
        initComponents();
        initComponents();
        this.system=business;
        this.userProcessContainer=userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addSupervisorButton = new javax.swing.JButton();
        addCoordinatorButton = new javax.swing.JButton();
        addCateringManagerButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addSupervisorButton.setText("Add Supervisor");
        addSupervisorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupervisorButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addSupervisorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 40));

        addCoordinatorButton.setText("Add Coordinator");
        addCoordinatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoordinatorButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addCoordinatorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, 40));

        addCateringManagerButton.setText("Add Catering Manager");
        addCateringManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCateringManagerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addCateringManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, 40));

        jSplitPane1.setLeftComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addSupervisorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupervisorButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new AddSupervisorJPanel(system,userProcessContainer));
    }//GEN-LAST:event_addSupervisorButtonActionPerformed

    private void addCoordinatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoordinatorButtonActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new AddCoordinatorJPanel(system,userProcessContainer));
    }//GEN-LAST:event_addCoordinatorButtonActionPerformed

    private void addCateringManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCateringManagerButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new AddCateringManagerJPanel(system,userProcessContainer));
    }//GEN-LAST:event_addCateringManagerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCateringManagerButton;
    private javax.swing.JButton addCoordinatorButton;
    private javax.swing.JButton addSupervisorButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
