/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodProdAdminWorkArea;

import business.ApplicationSystem;
import catering.system.Users.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nishipancholi
 */
public class CateringManagerMainJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    ApplicationSystem system;
    UserAccount ua;
    /**
     * Creates new form CateringManagerMainJPanel
     */
    public CateringManagerMainJPanel() {
        initComponents();
    }

    public CateringManagerMainJPanel(JPanel userProcessContainer, UserAccount ua,ApplicationSystem business) {
        initComponents();
        this.system = business;
        this.ua = ua;
        this.userProcessContainer = userProcessContainer;
        nameLable.setText("Welcome Catering Manager ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AddMenuButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        placeInventoryOrderButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ViewOrdersButton1 = new javax.swing.JButton();
        nameLable = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        AddMenuButton.setBackground(new java.awt.Color(255, 203, 162));
        AddMenuButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AddMenuButton.setForeground(new java.awt.Color(51, 51, 51));
        AddMenuButton.setText("Add Menu");
        AddMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(AddMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 360, 320));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        placeInventoryOrderButton.setBackground(new java.awt.Color(255, 203, 162));
        placeInventoryOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        placeInventoryOrderButton.setForeground(new java.awt.Color(51, 51, 51));
        placeInventoryOrderButton.setText("Inventory Orders");
        placeInventoryOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeInventoryOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeInventoryOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(placeInventoryOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 180, 360, 320));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        ViewOrdersButton1.setBackground(new java.awt.Color(255, 203, 162));
        ViewOrdersButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ViewOrdersButton1.setForeground(new java.awt.Color(51, 51, 51));
        ViewOrdersButton1.setText("View Orders");
        ViewOrdersButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrdersButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewOrdersButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(79, 79, 79)
                .addComponent(ViewOrdersButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 360, 320));

        nameLable.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        add(nameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 600, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void AddMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMenuButtonActionPerformed
        // TODO add your handling code here:
        AddMenuJPanel addMenu = new AddMenuJPanel(userProcessContainer, ua,system);
        userProcessContainer.add("manageServiceEntJPanel", addMenu);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_AddMenuButtonActionPerformed

    private void placeInventoryOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeInventoryOrderButtonActionPerformed
        PlaceInventoryOrderJPanel placeInventoryOrderJPanel = new PlaceInventoryOrderJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("manageServiceEntJPanel", placeInventoryOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_placeInventoryOrderButtonActionPerformed

    private void ViewOrdersButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrdersButton1ActionPerformed
        // TODO add your handling code here:
        ViewOrdersCateringManagerJPanel dm = new ViewOrdersCateringManagerJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("manageServiceEntJPanel", dm);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewOrdersButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMenuButton;
    private javax.swing.JButton ViewOrdersButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nameLable;
    private javax.swing.JButton placeInventoryOrderButton;
    // End of variables declaration//GEN-END:variables
}
