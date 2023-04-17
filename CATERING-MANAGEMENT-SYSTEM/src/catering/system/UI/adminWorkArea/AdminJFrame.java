/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package catering.system.UI.adminWorkArea;

import business.ApplicationSystem;
import catering.system.UI.MainJFrame;
import catering.system.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nishipancholi
 */
public class AdminJFrame extends javax.swing.JFrame {
    private ApplicationSystem system;
    private UserAccount useraccount;
    private JPanel userProcessContainer;

    /**
     * Creates new form AdminJFrame
     */
    public AdminJFrame() {
        initComponents();
    }

    public AdminJFrame(ApplicationSystem system, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.system=system;
        this.useraccount=useraccount;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        addOrganizationButton = new javax.swing.JButton();
        coordinatorButton = new javax.swing.JButton();
        nutritionAuditorButton = new javax.swing.JButton();
        cateringManagerButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        supervisorButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 300, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setText("System Admin work area");

        logoutButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 90, 30));

        coordinatorButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        coordinatorButton.setText("Register Coordinator");
        coordinatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordinatorButtonActionPerformed(evt);
            }
        });
        jPanel2.add(coordinatorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 200, 30));

        organizationButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        organizationButton.setText("Register Organization");
        organizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrganizationButtonActionPerformed(evt);
            }
        });
        jPanel2.add(organizationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 200, 30));


        nutritionAuditorButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        nutritionAuditorButton.setText("Register Nutrition Auditor");
        nutritionAuditorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutritionAuditorButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nutritionAuditorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 200, 30));

        cateringManagerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cateringManagerButton.setText("Register Catering Manager");
        cateringManagerButton.setActionCommand("Register Catering Manager");
        cateringManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringManagerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cateringManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 200, 30));

        staffButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        staffButton.setText("Register Service Staff Manager");
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });
        jPanel2.add(staffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 200, 30));

        inventoryButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        inventoryButton.setText("Register Inventory Manager");
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });
        jPanel2.add(inventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 200, 30));

        supervisorButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        supervisorButton.setText("Register Supervisor");
        jPanel2.add(supervisorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 200, 30));

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jSplitPane1.setRightComponent(jPanel4);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainJFrame mj = new MainJFrame(this.system, this.useraccount);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void coordinatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordinatorButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CoordinatorJPanel(system, useraccount));
    }//GEN-LAST:event_coordinatorButtonActionPerformed


    private void addOrganizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrganizationButtonActionPerformed

        // TODO add your handling code here:
        OrganizationJPanel organizationJPanel = new OrganizationJPanel(system, useraccount);
        AdminJFrame ad = new AdminJFrame();
        jSplitPane2.setRightComponent(ad.add(organizationJPanel));
        organizationJPanel.setVisible(true);
    }//GEN-LAST:event_addOrganizationButtonActionPerformed


    private void nutritionAuditorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutritionAuditorButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new NutritionAuditorJPanel(system, useraccount));
    }//GEN-LAST:event_nutritionAuditorButtonActionPerformed

    private void cateringManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateringManagerButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CateringManagerJPanel(system, useraccount));
    }//GEN-LAST:event_cateringManagerButtonActionPerformed

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ServiceStaffManagerJPanel(system, useraccount));
    }//GEN-LAST:event_staffButtonActionPerformed

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new InventoryManagerJPanel(system, useraccount));
    }//GEN-LAST:event_inventoryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton addOrganizationButton;
    private javax.swing.JButton cateringManagerButton;
    private javax.swing.JButton coordinatorButton;
    private javax.swing.JButton inventoryButton;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton nutritionAuditorButton;
    private javax.swing.JButton staffButton;
    private javax.swing.JButton supervisorButton;
    // End of variables declaration//GEN-END:variables
}
