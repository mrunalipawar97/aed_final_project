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
 * @author jeelkanzaria
 */
public class AuditingReportingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuditingReportingJPanel
     */
    JPanel userProcessContainer;
    ApplicationSystem system;
    
    public AuditingReportingJPanel() {
        initComponents();
    }

    AuditingReportingJPanel(JPanel container, ApplicationSystem system) {
        initComponents();
        this.userProcessContainer = container;
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 131, -1));

        jLabel1.setText("Auditing Reporting");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FoodQualityAdminMainJPanel dm= new FoodQualityAdminMainJPanel(userProcessContainer, system);
        userProcessContainer.add("foodQualityAdminJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
