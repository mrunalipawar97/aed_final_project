/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodWarehouseAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodWarehouseOrganization.Inventory;
import catering.system.Users.UserAccount;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class AddInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddInventoryJPanel
     */
    
    JPanel userProcessContainer;
    ApplicationSystem system;
    DefaultTableModel viewInventoryTableModel;
    UserAccount userAccount;
    Inventory inventory;
            
    public AddInventoryJPanel() {
        initComponents();
    }
  
    public AddInventoryJPanel(JPanel userProcessContainer, ApplicationSystem system) {
        initComponents();
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        this.userAccount = new UserAccount();
        inventory = new Inventory();
        //this.viewInventoryTableModel= (DefaultTableModel) inventoryTable.getModel();
        this.viewInventoryTableModel = new DefaultTableModel();
        inventoryTable.setModel(viewInventoryTableModel);
        viewInventoryTableModel.addColumn("Item Name");
        viewInventoryTableModel.addColumn("Price");
        System.out.println(inventory.getMenu());
        showDeleteList();
        viewMenuList();
    }
    
    public void viewMenuList() {
        HashMap<String, String> menu = inventory.getMenu();
        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                viewInventoryTableModel.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });
            }
        }
    }

    public void showDeleteList() {
        HashMap<String, String> menu = inventory.getMenu();
        if (inventory.getMenu().size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                itemsCombo.addItem(e.getKey());
            }
        }
    }
    
    public Boolean validateFields(String item, String price) {
        String pattern = "^(\\d*\\.)?\\d+$";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        Matcher m = r.matcher(price);
        if(item.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return false;
        } else if(!m.find()) {
            JOptionPane.showMessageDialog(null, "Please enter Valid price");
            return false;
        }
        return true;
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
        AddItemPanel = new javax.swing.JPanel();
        AddItemLabel = new javax.swing.JLabel();
        itemText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        AddItemNameLabel = new javax.swing.JLabel();
        AddItemPriceLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        UpdateItemPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemsCombo = new javax.swing.JComboBox<>();
        ItemPanel = new javax.swing.JLabel();
        updateItemText = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        updatePriceText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addCourseHeaderLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();

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
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 27, 130, 40));

        AddItemPanel.setBackground(new java.awt.Color(255, 204, 204));
        AddItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddItemLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddItemLabel.setText("Add Item");
        AddItemPanel.add(AddItemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 311, -1));

        itemText.setForeground(new java.awt.Color(72, 72, 72));
        itemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTextActionPerformed(evt);
            }
        });
        AddItemPanel.add(itemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 55, 177, -1));

        priceText.setForeground(new java.awt.Color(72, 72, 72));
        AddItemPanel.add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 96, 177, -1));

        AddItemNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddItemNameLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemNameLabel.setText("Item");
        AddItemPanel.add(AddItemNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 58, 109, -1));

        AddItemPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddItemPriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemPriceLabel.setText("Price");
        AddItemPanel.add(AddItemPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 99, 109, -1));

        addButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        AddItemPanel.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 114, 27));

        add(AddItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 400, 250));

        UpdateItemPanel.setBackground(new java.awt.Color(255, 204, 204));
        UpdateItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Update / Delete an Item");
        UpdateItemPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 322, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 72, 72));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Select Item");
        UpdateItemPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 128, -1));

        itemsCombo.setForeground(new java.awt.Color(72, 72, 72));
        itemsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--None" }));
        itemsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsComboActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(itemsCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 51, 197, -1));

        ItemPanel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ItemPanel.setForeground(new java.awt.Color(72, 72, 72));
        ItemPanel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ItemPanel.setText("Item");
        UpdateItemPanel.add(ItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 103, 79, -1));

        updateItemText.setForeground(new java.awt.Color(72, 72, 72));
        updateItemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemTextActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(updateItemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 197, -1));

        PriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PriceLabel.setText("Price");
        UpdateItemPanel.add(PriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 154, 67, -1));

        updatePriceText.setForeground(new java.awt.Color(72, 72, 72));
        UpdateItemPanel.add(updatePriceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 154, 197, -1));

        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 205, 118, 27));

        deleteButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 205, 119, 27));

        add(UpdateItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 430, 250));

        addCourseHeaderLabel.setFont(new java.awt.Font("Kannada MN", 1, 24)); // NOI18N
        addCourseHeaderLabel.setText("FOOD WAREHOUSE INVENTORY");
        add(addCourseHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 430, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("View Orders");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 130, -1));

        inventoryTable.setBackground(new java.awt.Color(255, 204, 204));
        inventoryTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inventoryTable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        inventoryTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(inventoryTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 380, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        InventoryManagerWorkAreaJPanel dm= new InventoryManagerWorkAreaJPanel(userProcessContainer,system);
        userProcessContainer.add("manageHospitalsJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void itemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = validateFields(itemText.getText(), priceText.getText());
        if (!isValid) {
            return;
        }
        HashMap<String, String> menu = inventory.getMenu();
        menu.put(itemText.getText(), priceText.getText());
        inventory.setMenu(menu);
        JOptionPane.showMessageDialog(this, "Item added successfully");
        itemsCombo.addItem(itemText.getText());
        System.out.println(itemText.getText() + " test " + priceText.getText());
        viewInventoryTableModel.addRow(new Object[]{
            itemText.getText(),
            priceText.getText()
        });
        itemText.setText("");
        priceText.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void itemsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsComboActionPerformed
        // TODO add your handling code here:
        HashMap<String, String> menu = inventory.getMenu();
        if (itemsCombo.getSelectedItem() != null) {
            String selectedItem = (String) itemsCombo.getSelectedItem();
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    updateItemText.setText(e.getKey());
                    updatePriceText.setText(String.valueOf(e.getValue()));
                }
            }
        }
    }//GEN-LAST:event_itemsComboActionPerformed

    private void updateItemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateItemTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if(itemsCombo.getSelectedItem() == null || itemsCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Select a value from dropdown");
            return;
        } else if (!validateFields(updateItemText.getText(), updatePriceText.getText())) {
            return;
        }
        HashMap<String, String> menu = inventory.getMenu();
        if (itemsCombo.getSelectedItem() != null) {
            String selectedItem = (String) itemsCombo.getSelectedItem();
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    menu.remove(e);
                    menu.put(updateItemText.getText(), updatePriceText.getText());
                    JOptionPane.showMessageDialog(this, "Menu Item updated successfully");
                }
            }
        }
        inventory.setMenu(menu);
        String selectedItem = (String) itemsCombo.getSelectedItem();
        itemsCombo.getSelectedIndex();
        for (int i = 0; i < inventoryTable.getRowCount(); i++) {
            if (((String) inventoryTable.getValueAt(i, 0)).equals(selectedItem)) {
                itemsCombo.addItem(updateItemText.getText());
                viewInventoryTableModel.addRow(new Object[]{
                    updateItemText.getText(),
                    updatePriceText.getText()
                });
                viewInventoryTableModel.removeRow(i);
                itemsCombo.removeItemAt(i + 1);

            }//end of if block
        }
        reset();

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if(itemsCombo.getSelectedItem() == null || itemsCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Select a value from dropdown");
            return;
        }
        HashMap<String, String> menu = inventory.getMenu();
        String selectedItem = (String) itemsCombo.getSelectedItem();
        itemsCombo.getSelectedIndex();
        if (itemsCombo.getSelectedItem() != null) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    System.out.println("inside delete..");
                    menu.remove(e.getKey());
                    JOptionPane.showMessageDialog(this, "Menu Item deleted successfully");
                }
            }
        }
        for (int i = 0; i < inventoryTable.getRowCount(); i++) {
            if (((String) inventoryTable.getValueAt(i, 0)).equals(selectedItem)) {
                viewInventoryTableModel.removeRow(i);
                itemsCombo.removeItemAt(i + 1);
                updateItemText.setText("");
                updatePriceText.setText("");
            }//end of if block
        }

        inventory.setMenu(menu);
        System.out.println(menu.size() + "jsdje " + inventory.getMenu().size());
        reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    public void reset() {
        itemsCombo.setSelectedIndex(0);
        updateItemText.setText("");
        updatePriceText.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddItemLabel;
    private javax.swing.JLabel AddItemNameLabel;
    private javax.swing.JPanel AddItemPanel;
    private javax.swing.JLabel AddItemPriceLabel;
    private javax.swing.JLabel ItemPanel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JPanel UpdateItemPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addCourseHeaderLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JTextField itemText;
    private javax.swing.JComboBox<String> itemsCombo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceText;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField updateItemText;
    private javax.swing.JTextField updatePriceText;
    // End of variables declaration//GEN-END:variables
}
