/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodWarehouseAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodWarehouseOrganization.Inventory;
import catering.system.Users.UserAccount;
import catering.system.validations.Validate;
import java.awt.CardLayout;
import java.util.ArrayList;
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
    UserAccount ua;
    Inventory inventory;
    Validate validate;

    public AddInventoryJPanel() {
        initComponents();
    }

    public AddInventoryJPanel(JPanel userProcessContainer, ApplicationSystem system, UserAccount ua) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        this.inventory = new Inventory();
        this.validate=new Validate();
        //this.viewInventoryTableModel= (DefaultTableModel) inventoryTable.getModel();
        this.viewInventoryTableModel = new DefaultTableModel();
        inventoryTable.setModel(viewInventoryTableModel);
        viewInventoryTableModel.addColumn("Item Name");
        viewInventoryTableModel.addColumn("Price");
        //System.out.println(inventory.getMenu());
        populateInventoryItems();
        showItemsList();
    }

    public void populateInventoryItems() {
       viewInventoryTableModel.setRowCount(0);
       ArrayList<Inventory> itemlist = this.system.getEnterpriseDirectory().getInventoryDirectory().getItemsList();
       System.out.println(itemlist);
       if(itemlist.size() > 0){
            for (Inventory app:itemlist){
                Object row[]= new Object[2];
                row[0]=app;
                row[1]=app.getPrice();
                viewInventoryTableModel.addRow(row);
            }
       }else{
            System.out.println("Empty List");
        }
    }

   

    public void showItemsList() {
        itemsCombo.removeAllItems();
        ArrayList<Inventory> itemlist = this.system.getEnterpriseDirectory().getInventoryDirectory().getItemsList();
        System.out.println(itemlist);
        if(itemlist.size() > 0){
             for (Inventory app:itemlist){
                 itemsCombo.addItem(app);
             }
        }
        else{
            System.out.println("Empty List");
        }
    }

    public Boolean validateFields(String item, String price) {
        String pattern = "^(\\d*\\.)?\\d+$";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        Matcher m = r.matcher(price);
        if (item.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return false;
        } else if (!m.find()) {
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
        itemsCombo = new javax.swing.JComboBox();
        ItemPanel = new javax.swing.JLabel();
        updateItemText = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        updatePriceText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        viewItemButton = new javax.swing.JButton();
        addCourseHeaderLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(255, 203, 162));
        backButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 51));
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 27, 130, 40));

        AddItemPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddItemLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        AddItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddItemLabel.setText("Add Item");
        AddItemPanel.add(AddItemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 311, -1));

        itemText.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        itemText.setForeground(new java.awt.Color(72, 72, 72));
        itemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTextActionPerformed(evt);
            }
        });
        AddItemPanel.add(itemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 177, 30));

        priceText.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        priceText.setForeground(new java.awt.Color(72, 72, 72));
        AddItemPanel.add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 177, 30));

        AddItemNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        AddItemNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemNameLabel.setText("Item");
        AddItemPanel.add(AddItemNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 109, -1));

        AddItemPriceLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        AddItemPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemPriceLabel.setText("Price");
        AddItemPanel.add(AddItemPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 109, -1));

        addButton.setBackground(new java.awt.Color(255, 203, 162));
        addButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        AddItemPanel.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 114, 27));

        add(AddItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 460, 250));

        UpdateItemPanel.setBackground(new java.awt.Color(255, 255, 255));
        UpdateItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Update / Delete an Item");
        UpdateItemPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 322, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Select Item");
        UpdateItemPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 128, -1));

        itemsCombo.setForeground(new java.awt.Color(72, 72, 72));
        itemsCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--None" }));
        itemsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsComboActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(itemsCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 197, -1));

        ItemPanel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        ItemPanel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ItemPanel.setText("Item");
        UpdateItemPanel.add(ItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 79, -1));

        updateItemText.setForeground(new java.awt.Color(72, 72, 72));
        updateItemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemTextActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(updateItemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 197, -1));

        PriceLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PriceLabel.setText("Price");
        UpdateItemPanel.add(PriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 67, 20));

        updatePriceText.setForeground(new java.awt.Color(72, 72, 72));
        UpdateItemPanel.add(updatePriceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 197, -1));

        updateButton.setBackground(new java.awt.Color(255, 203, 162));
        updateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 118, 27));

        deleteButton.setBackground(new java.awt.Color(255, 203, 162));
        deleteButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 119, 27));

        viewItemButton.setBackground(new java.awt.Color(255, 203, 162));
        viewItemButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewItemButton.setText("View Item");
        viewItemButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemButtonActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(viewItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 110, 30));

        add(UpdateItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 460, 350));

        addCourseHeaderLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        addCourseHeaderLabel.setText("Food Warehouse Inventory");
        add(addCourseHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 500, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("View Orders");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 130, -1));

        inventoryTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inventoryTable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 380, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        InventoryManagerWorkAreaJPanel dm = new InventoryManagerWorkAreaJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("manageHospitalsJPanel", dm);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void itemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
        Boolean isItemValid= validate.checkName(itemText.getText());
        Boolean isPriceValid= validate.checkNoNegativeZero(priceText.getText());
        Boolean isValid = validateFields(itemText.getText(), priceText.getText());
        if (!isValid) {
            return;
        }
        if (!isPriceValid) {
            return;
        }
        if (!isItemValid) {
            return;
        }
        Inventory inventory = this.system.getEnterpriseDirectory().getInventoryDirectory().createInventory(itemText.getText(), Double.valueOf(priceText.getText()));
        JOptionPane.showMessageDialog(null, "Inventory item added successfully");
        populateInventoryItems();
        showItemsList();
        itemText.setText("");
        priceText.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void itemsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsComboActionPerformed
        // TODO add your handling code here:
        if (itemsCombo.getSelectedItem() != null) {
            Inventory  selectedItem = (Inventory) itemsCombo.getSelectedItem();
            updateItemText.setText(selectedItem.getName());
            updatePriceText.setText(String.valueOf(selectedItem.getPrice()));
        }
       
    }//GEN-LAST:event_itemsComboActionPerformed

    private void updateItemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateItemTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        Boolean isItemValid= validate.checkName(updateItemText.getText());
        Boolean isPriceValid= validate.checkNoNegativeZero(updatePriceText.getText());
        if(!isItemValid){
            return;
        }
        if(!isPriceValid){
            return;
        }
        if (!validateFields(updateItemText.getText(), updatePriceText.getText())) {
            return;
        }
        if (itemsCombo.getSelectedItem() != null) {
             String selectedItem = (String) itemsCombo.getSelectedItem();
        }
        
        int selectedRow = inventoryTable.getSelectedRow();
        
        if(selectedRow >= 0){
            inventory.setName(updateItemText.getText());
            inventory.setPrice(Double.valueOf(updatePriceText.getText()));
        }else{
            JOptionPane.showMessageDialog(null,"Any row selection is not done!");
        }
        
        /* int selectedRow = adminTable.getSelectedRow();
        if(selectedRow>=0){
            
            selectedEnterprise.getAdmin().setName(adminNameField.getText());
            selectedEnterprise.setEntAdminName(adminNameField.getText());
            selectedEnterprise.getAdmin().getAccountDetails().setUsername(adminUsernameField.getText());
            selectedEnterprise.getAdmin().getAccountDetails().setPassword(updtPwdField.getText());
            JOptionPane.showMessageDialog(null,"Updated Enterprise Name!"); 
            populate();
        }
        else{
            JOptionPane.showMessageDialog(null,"Any row selection is not done!");
        }
        */
        populateInventoryItems();
        reset();

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
        reset();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = inventoryTable.getSelectedRow();
        
        if(selectedRow>=0){
            
            inventory = (Inventory) inventoryTable.getValueAt(selectedRow, 0);
            updateItemText.setText(inventory.getName());
            updatePriceText.setText(String.valueOf(inventory.getPrice()));  
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select row");
        }
    }//GEN-LAST:event_viewItemButtonActionPerformed

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
    private javax.swing.JComboBox itemsCombo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceText;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField updateItemText;
    private javax.swing.JTextField updatePriceText;
    private javax.swing.JButton viewItemButton;
    // End of variables declaration//GEN-END:variables
}
