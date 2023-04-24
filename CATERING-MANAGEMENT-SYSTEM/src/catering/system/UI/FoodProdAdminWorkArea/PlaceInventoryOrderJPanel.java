/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodProdAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodProdOrganization.CateringManager;
import catering.system.FoodWarehouseOrganization.Inventory;
import catering.system.OrderManagement.InventoryOrder;
import catering.system.OrderManagement.InventoryOrderDirectory;
import catering.system.Users.UserAccount;
import catering.system.validations.Validate;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class PlaceInventoryOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaceInventoryOrderJPanel
     */
    JPanel userProcessContainer;
    ApplicationSystem system;
    DefaultTableModel viewOrderTableModel;
    DefaultTableModel cartOrderTableModel;
    DefaultTableModel finalOrderTableModel;
    UserAccount ua;
    Inventory selectedInventory;
    private String selectedItem;
    private String selectedPrice;
    private int selectedQuantity;
    private String removeItem;
    private InventoryOrderDirectory orderDirectory;
    CateringManager im;
    JSplitPane screen;
    Double Total = 0.0;
    Validate validate;

    public PlaceInventoryOrderJPanel() {
        initComponents();
    }

    PlaceInventoryOrderJPanel(JPanel userProcessContainer,UserAccount ua, ApplicationSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        selectedInventory = new Inventory();
        this.screen = new JSplitPane();
        this.validate=new Validate();
        this.viewOrderTableModel = new DefaultTableModel();
        orderItemTable.setModel(viewOrderTableModel);
        viewOrderTableModel.addColumn("Item");
        viewOrderTableModel.addColumn("Price");
        this.finalOrderTableModel= (DefaultTableModel) finalOrderTable.getModel();
        this.cartOrderTableModel = (DefaultTableModel) orderCartTable.getModel();
        orderDirectory = this.system.getInventoryOrderDirectory();
        showInventoryItemTable();
        System.out.println(orderDirectory.getInventoryOrderList().size() + " size initial ");
        showInventoryCartTable();
        System.out.println(orderDirectory.getInventoryOrderList().size() + " size initial ");
        im = findCateringManager();
        populateOrder();
        
        //title.setText("Welcome to virtual "+ grocery.getName());

    }

    public void showInventoryItemTable() {
        viewOrderTableModel.setRowCount(0);
        ArrayList<Inventory> itemlist = this.system.getEnterpriseDirectory().getInventoryDirectory().getItemsList();
        System.out.println(itemlist);
        if (itemlist.size() > 0) {
            for (Inventory app : itemlist) {
                Object row[] = new Object[2];
                row[0] = app;
                row[1] = app.getPrice();
                viewOrderTableModel.addRow(row);
            }
        } else {
            System.out.println("Empty List");
        }
    }

    public void showInventoryCartTable() {
        if (orderDirectory.getInventoryOrderList().size() > 0) {
            for (int i = 0; i < orderDirectory.getInventoryOrderList().size(); i++) {
                cartOrderTableModel.addRow(new Object[]{
                    orderDirectory.getInventoryOrderList().get(i).getInventory().getName(),
                    orderDirectory.getInventoryOrderList().get(i).getOrderPrice(),
                    orderDirectory.getInventoryOrderList().get(i).getOrderQuantity()
                });
            }
        }
    }

    public CateringManager findCateringManager() {
        System.out.println("in find manager:" + system.getEnterpriseDirectory().getCateringManagerList().size());
        System.out.println( "username 1:" + ua.getEmployee().getEmpName());
        for (int i = 0; i < system.getEnterpriseDirectory().getCateringManagerList().size(); i++) {
            if (system.getEnterpriseDirectory().getCateringManagerList().get(i).getAccountDetails().getUsername().equals(this.ua.getUsername())) {
                 System.out.println( "username 2 :" + system.getEnterpriseDirectory().getCateringManagerList().get(i).getAccountDetails().getUsername());
                return system.getEnterpriseDirectory().getCateringManagerList().get(i);
            }
        }
        return null;
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderItemTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantityText = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        itemText = new javax.swing.JTextField();
        placeOrderButton = new javax.swing.JButton();
        yourCartLabel = new javax.swing.JLabel();
        removeItemButton = new javax.swing.JButton();
        clearItemButton = new javax.swing.JButton();
        selectItemJLabel = new javax.swing.JLabel();
        removeItemTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderCartTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        paymentButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        finalOrderTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 203, 162));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderItemTable.setFont(new java.awt.Font("Devanagari Sangam MN", 0, 12)); // NOI18N
        orderItemTable.setModel(new javax.swing.table.DefaultTableModel(
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
        orderItemTable.setGridColor(new java.awt.Color(0, 0, 0));
        orderItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderItemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderItemTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 480, 170));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Items from Menu");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 250, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Selected Item");
        jLabel3.setAutoscrolls(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Quantity");
        jLabel4.setAutoscrolls(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        quantityText.setForeground(new java.awt.Color(72, 72, 72));
        jPanel2.add(quantityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 145, 30));

        AddButton.setBackground(new java.awt.Color(255, 203, 162));
        AddButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        AddButton.setText("Add Item");
        AddButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 160, 40));

        itemText.setEditable(false);
        itemText.setBackground(new java.awt.Color(255, 255, 255));
        itemText.setForeground(new java.awt.Color(72, 72, 72));
        jPanel2.add(itemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 145, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 570, 400));

        placeOrderButton.setBackground(new java.awt.Color(255, 203, 162));
        placeOrderButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        placeOrderButton.setText("Place Order");
        placeOrderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });
        add(placeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 110, 40));

        yourCartLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        yourCartLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourCartLabel.setText("Your Cart ");
        add(yourCartLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 110, -1));

        removeItemButton.setBackground(new java.awt.Color(255, 203, 162));
        removeItemButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        removeItemButton.setText("Remove");
        removeItemButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });
        add(removeItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 110, 40));

        clearItemButton.setBackground(new java.awt.Color(255, 203, 162));
        clearItemButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        clearItemButton.setText("Clear ");
        clearItemButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearItemButtonActionPerformed(evt);
            }
        });
        add(clearItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, 110, 40));

        selectItemJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        selectItemJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        selectItemJLabel.setText("Selected Item");
        selectItemJLabel.setAutoscrolls(true);
        add(selectItemJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 740, -1, 30));

        removeItemTextField.setForeground(new java.awt.Color(72, 72, 72));
        add(removeItemTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 740, 180, 30));

        orderCartTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        orderCartTable.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        orderCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Item", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        orderCartTable.setGridColor(new java.awt.Color(0, 0, 0));
        orderCartTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        orderCartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderCartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(orderCartTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 450, 170));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 790, 40, 30));

        priceField.setEnabled(false);
        add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 790, 180, 30));

        paymentButton.setBackground(new java.awt.Color(255, 203, 162));
        paymentButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        paymentButton.setText("Pay");
        paymentButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });
        add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 120, 40));

        finalOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Paid Money", "Order Status", "Catering Manager"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(finalOrderTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, -1, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CateringManagerMainJPanel dm = new CateringManagerMainJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("manageHospitalsJPanel", dm);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void orderItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderItemTableMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        System.out.println(viewOrderTableModel.getValueAt(orderItemTable.getSelectedRow(), 0) + " selected added list ");
        selectedItem = String.valueOf(viewOrderTableModel.getValueAt(orderItemTable.getSelectedRow(), 0));
        selectedPrice = String.valueOf(viewOrderTableModel.getValueAt(orderItemTable.getSelectedRow(), 1));
        itemText.setText(selectedItem);
    }//GEN-LAST:event_orderItemTableMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        try{
        Boolean isQuantityValid=validate.checkNoNegativeZero(quantityText.getText());
        if(!isQuantityValid){
            return;
        }
        if (itemText.getText().isEmpty() || quantityText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kindly select items and add quantity");
            return;
        }
        orderDirectory.createOrder(selectedInventory, selectedPrice, selectedQuantity, im);
                //selectedItem, selectedPrice, Integer.parseInt(quantityText.getText()), im);
        cartOrderTableModel.addRow(new Object[]{
            selectedItem,
            selectedPrice,
            quantityText.getText()
        });
        itemText.setText("");
        quantityText.setText("");
        JOptionPane.showMessageDialog(this, "Item added to cart");
        System.out.println(orderDirectory.getInventoryOrderList().size() + " size ");
        }
        catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "It should be Integer"); 
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void orderCartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderCartTableMouseClicked
        // TODO add your handling code here:
        removeItem = String.valueOf(cartOrderTableModel.getValueAt(orderCartTable.getSelectedRow(), 0));
        removeItemTextField.setText(removeItem);
    }//GEN-LAST:event_orderCartTableMouseClicked

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        // TODO add your handling code here:
        if (removeItemTextField.getText().isEmpty() || removeItem == null) {
            JOptionPane.showMessageDialog(this, "Kindly select item to remove");
            return;
        }
        orderDirectory.deleteOrder(removeItem);
        for (int i = 0; i < orderCartTable.getRowCount(); i++) {
            if (((String) orderCartTable.getValueAt(i, 0)).equals(removeItem)) {
                cartOrderTableModel.removeRow(i);
            }
        }
        removeItemTextField.setText("");
        JOptionPane.showMessageDialog(this, "Item removed successfully");
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void clearItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearItemButtonActionPerformed
        // TODO add your handling code here:
        orderDirectory.deleteOrderAll();
        for (int i = cartOrderTableModel.getRowCount() - 1; i >= 0; i--) {
            cartOrderTableModel.removeRow(i);
        }
        JOptionPane.showMessageDialog(this, "Items removed successfully");
    }//GEN-LAST:event_clearItemButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderCartTable.getSelectedRow();
        if(selectedRow >= 0){
//            String inte = (String)orderCartTable.getValueAt(selectedRow, 0);
//            //selectedInventory = (Inventory)inte;
//            String p = (String)orderCartTable.getValueAt(selectedRow, 1);
//            double price = Double.valueOf(p);
//            String i=(String)orderCartTable.getValueAt(selectedRow, 2);
//            selectedQuantity = Integer.valueOf(i);

            String p = (String)orderCartTable.getValueAt(selectedRow, 1);
            double price = Double.valueOf(p);
            this.selectedPrice = String.valueOf(price*selectedQuantity);
            JOptionPane.showMessageDialog(null,"Please Proceed to Payment to Place Order");  
        }
        else{
            JOptionPane.showConfirmDialog(null, "please select row");
        }
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        // TODO add your handling code here:
        
        populateOrder();
        /*ArrayList<CateringManager> cateringManagerlists = this.system.getEnterpriseDirectory().getCateringManagerList();
        CateringManager selectedCm = new CateringManager();
        for(CateringManager c : cateringManagerlists){
            if(ua == c.getAccountDetails()){
                selectedCm = c;
            }
        }
        InventoryOrder corder = this.system.getEnterpriseDirectory().getInventoryOrderDirectory().createOrder(selectedInventory, selectedPrice, selectedQuantity, im);
        System.out.print(corder + "-- corder");
        JOptionPane.showMessageDialog(null,"Payment Done");
        populateOrder();*/
    }//GEN-LAST:event_paymentButtonActionPerformed
   
    public void populateOrder()
    {
        finalOrderTableModel.setRowCount(0);
        ArrayList<InventoryOrder> applications = orderDirectory.getInventoryOrderList();
        //ArrayList<InventoryOrder> applications = this.system.getEnterpriseDirectory().getInventoryOrderDirectory().getInventoryOrderList();
        System.out.println(applications);
        
         if(applications.size() > 0){
            for (InventoryOrder app : applications){
                if(ua==app.getCm().getAccountDetails()){
                    Object row[]= new Object[4];
                    row[0]=app;
                    row[1] = app.getOrderPrice();
                    row[2]=app.getStatus();
                    row[3]=app.getCm().getName();

                    finalOrderTableModel.addRow(row);
                }
            }
        } else{
            System.out.println("Empty Menu");
        }
    }
    
    public void setOrderList(CateringManager cm) {
        System.out.println("set order list :"+cm.getName());
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton clearItemButton;
    private javax.swing.JTable finalOrderTable;
    private javax.swing.JTextField itemText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable orderCartTable;
    private javax.swing.JTable orderItemTable;
    private javax.swing.JButton paymentButton;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField quantityText;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JTextField removeItemTextField;
    private javax.swing.JLabel selectItemJLabel;
    private javax.swing.JLabel yourCartLabel;
    // End of variables declaration//GEN-END:variables
}
