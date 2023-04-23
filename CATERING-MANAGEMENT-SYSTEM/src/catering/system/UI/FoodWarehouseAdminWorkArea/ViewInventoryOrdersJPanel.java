/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodWarehouseAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodWarehouseOrganization.Inventory;
import catering.system.OrderManagement.InventoryOrder;
import catering.system.OrderManagement.InventoryOrderDirectory;
import catering.system.Users.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class ViewInventoryOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewInventoryOrdersJPanel
     */
    JPanel userProcessContainer;
    ApplicationSystem system;
    DefaultTableModel viewOrdersTableModel;
    UserAccount ua;
    Inventory inventory;
    private InventoryOrderDirectory selectedDir;

    public ViewInventoryOrdersJPanel() {
        initComponents();
    }

    public ViewInventoryOrdersJPanel(JPanel userProcessContainer, ApplicationSystem system, UserAccount ua) {
        initComponents();
        this.system = system;
        this.ua = ua;
        this.userProcessContainer = userProcessContainer;
        inventory = new Inventory();
        //this.viewOrdersTableModel = (DefaultTableModel) orderListTable.getModel();
        this.viewOrdersTableModel = new DefaultTableModel();
        this.orderListTable.setModel(viewOrdersTableModel);

        viewOrdersTableModel.addColumn("Id");
        viewOrdersTableModel.addColumn("Status");
        viewOrdersTableModel.addColumn("Name");
        viewOrdersTableModel.addColumn("Comment");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        viewOrdersJLable = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderListTable = new javax.swing.JTable();
        rejectButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();
        addCourseHeaderLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(255, 204, 204));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 51));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 38, 131, 40));

        viewOrdersJLable.setFont(new java.awt.Font("Kannada Sangam MN", 1, 18)); // NOI18N
        viewOrdersJLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewOrdersJLable.setText("View Orders");
        add(viewOrdersJLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 189, -1));

        orderListTable.setBackground(new java.awt.Color(254, 254, 226));
        orderListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        orderListTable.setGridColor(new java.awt.Color(0, 0, 0));
        orderListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderListTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(orderListTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 550, 180));

        rejectButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rejectButton.setText("Reject");
        rejectButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });
        add(rejectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 113, 35));

        acceptButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        acceptButton.setText("Accept");
        acceptButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });
        add(acceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 131, 35));

        addCourseHeaderLabel.setFont(new java.awt.Font("Kannada MN", 1, 24)); // NOI18N
        addCourseHeaderLabel.setText("FOOD WAREHOUSE ORDERS");
        add(addCourseHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 430, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        InventoryManagerWorkAreaJPanel dm = new InventoryManagerWorkAreaJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("manageHospitalsJPanel", dm);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void orderListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderListTableMouseClicked
        // TODO add your handling code here:
       /* if (orderListTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        String b = String.valueOf(viewOrdersTableModel.getValueAt(orderListTable.getSelectedRow(), 1));
        System.out.print(b + " b " + !b.equalsIgnoreCase("Placed"));

        String a = String.valueOf(viewOrdersTableModel.getValueAt(orderListTable.getSelectedRow(), 1));
        for (int i = viewOrdersTableModel.getRowCount() - 1; i >= 0; i--) {
            viewOrdersTableModel.removeRow(i);
        }
        selectedDir = inventory.getOrderDirectoryList().get(orderListTable.getSelectedRow());
        ArrayList<InventoryOrder> orderlist = inventory.getOrderDirectoryList().get(orderListTable.getSelectedRow()).getInventoryOrderList();
        for (int i = 0; i < orderlist.size(); i++) {
            viewOrdersTableModel.addRow(new Object[]{
                orderlist.get(i).getOrderItem(),
                orderlist.get(i).getOrderPrice(),
                orderlist.get(i).getOrderQuantity(),
                selectedDir.getClientDetails().getUsername(),
                selectedDir.getInventory().getName()
            });
        }*/
    }//GEN-LAST:event_orderListTableMouseClicked

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed

    }//GEN-LAST:event_rejectButtonActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        // TODO add your handling code here:

         if (selectedDir != null) {
            selectedDir.setIsAccept(true);
            selectedDir.setStatus("Accepted");
            JOptionPane.showMessageDialog(null, "Request Accepted");
            viewOrderDirList();
            
        } else {
            JOptionPane.showMessageDialog(this, "Select a order first");
        }
    }//GEN-LAST:event_acceptButtonActionPerformed



    public void viewOrderDirList() {
     /*   String name = "";
        for (int i = viewOrdersTableModel.getRowCount() - 1; i >= 0; i--) {
            viewOrdersTableModel.removeRow(i);
        }
        for (int i = 0; i < inventory.getInventoryOrderDirectoryList().size(); i++) {
            for (int j = 0; j < inventory.getInventoryOrderDirectoryList().get(i).getInventoryOrderList().size(); j++) {
                name = inventory.getInventoryOrderDirectoryList().get(i).getClientDetails().getUsername();
            }
            viewOrdersTableModel.addRow(new Object[]{
                i+1,
                inventory.getInventoryOrderDirectoryList().get(i).getStatus(),
                name,
                inventory.getInventoryOrderDirectoryList().get(i).getComment(),
                inventory.getInventoryOrderDirectoryList().get(i).getFeedbackComment()
            });
        }*/
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JLabel addCourseHeaderLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable orderListTable;
    private javax.swing.JButton rejectButton;
    private javax.swing.JLabel viewOrdersJLable;
    // End of variables declaration//GEN-END:variables
}
