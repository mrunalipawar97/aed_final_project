/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package catering.system.UI.AdminWorkArea;

import business.ApplicationSystem;
import catering.system.UI.MainJFrame;
import catering.system.Useraccount.UserAccount;
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
        addServiceAdminButton = new javax.swing.JButton();
        addFoodQualityAdmin = new javax.swing.JButton();
        addFoodProdAdmin = new javax.swing.JButton();
        addFoodWarehouseAdmin = new javax.swing.JButton();
        viewUsers = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setText("System Admin work area");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 300, -1));

        logoutButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 90, 30));

        addServiceAdminButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addServiceAdminButton.setText("Add Service Ent. Admin");
        addServiceAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceAdminButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addServiceAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 30));

        addFoodQualityAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addFoodQualityAdmin.setText("Add Food Quality Ent. Admin");
        addFoodQualityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodQualityAdminActionPerformed(evt);
            }
        });
        jPanel2.add(addFoodQualityAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 240, 30));

        addFoodProdAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addFoodProdAdmin.setText("Add Food Prod. Ent. Admin");
        addFoodProdAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodProdAdminActionPerformed(evt);
            }
        });
        jPanel2.add(addFoodProdAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 230, 30));

        addFoodWarehouseAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addFoodWarehouseAdmin.setText("Add Food Warehouse Admin");
        addFoodWarehouseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodWarehouseAdminActionPerformed(evt);
            }
        });
        jPanel2.add(addFoodWarehouseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 220, 30));

        viewUsers.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewUsers.setText("View Users");
        viewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUsersActionPerformed(evt);
            }
        });
        jPanel2.add(viewUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 220, 30));

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


    private void addServiceAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceAdminButtonActionPerformed

        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ServiceEntAdminJPanel(system, useraccount));
    }//GEN-LAST:event_addServiceAdminButtonActionPerformed


    private void addFoodProdAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodProdAdminActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new FoodProdAdminJPanel(system, useraccount));
    }//GEN-LAST:event_addFoodProdAdminActionPerformed

    private void addFoodWarehouseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodWarehouseAdminActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new FoodWarehouseAdminJPanel(system, useraccount));
    }//GEN-LAST:event_addFoodWarehouseAdminActionPerformed

    private void addFoodQualityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodQualityAdminActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new FoodQualityAdminJPanel(system, useraccount));
    }//GEN-LAST:event_addFoodQualityAdminActionPerformed

    private void viewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUsersActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ViewUsersJPanel(system, useraccount));
    }//GEN-LAST:event_viewUsersActionPerformed

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
    private javax.swing.JButton addFoodProdAdmin;
    private javax.swing.JButton addFoodQualityAdmin;
    private javax.swing.JButton addFoodWarehouseAdmin;
    private javax.swing.JButton addServiceAdminButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton viewUsers;
    // End of variables declaration//GEN-END:variables
}
