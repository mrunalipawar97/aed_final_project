/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodWarehouseAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodWarehouseOrganization.InventoryManager;
import catering.system.Role.InventoryManagerRole;
import catering.system.Users.Employee;
import catering.system.Users.UserAccount;
import catering.system.validations.Validate;
import catering.system.validations.ValidateStrings;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class InventoryManagerManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryManagerManagementJPanel
     */
    
    JPanel userProcessContainer;
    private ApplicationSystem system;
    //private ArrayList<InventoryManager> managersList;
    InventoryManager selectedInventoryManager;
    DefaultTableModel inventoryManagerTableModel;
    Validate validate;

    public InventoryManagerManagementJPanel() {
        initComponents();
    }

    public InventoryManagerManagementJPanel(JPanel userProcessContainer, ApplicationSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.inventoryManagerTableModel= (DefaultTableModel) managerListTable.getModel();
        this.selectedInventoryManager= new InventoryManager();
        this.validate=new Validate();
        populateManagerDetails();
        //showUpdateList();
    }

    
    
    public void showUpdateList() {
        ArrayList<InventoryManager> managerList = this.system.getEnterpriseDirectory().getInventoryManagerDirectory().getInventoryManagerList();
        System.out.println("managerList"+managerList);
        for (int i = 0; i < managerList.size(); i++) {
            //managerListCombo.addItem(managerList.get(i).getName());
        }
    }

    
    public void reset() {
        updateNameTextField.setText("");
        updateUsernameTextField.setText("");
        updatePasswordTextField.setText("");
        updatePhoneTextField.setText("");
        updateAddressTextField.setText("");
    }
    
    public void populateManagerDetails(){
       
        inventoryManagerTableModel.setRowCount(0);
        ArrayList<InventoryManager> managerList = this.system.getEnterpriseDirectory().getInventoryManagerDirectory().getInventoryManagerList();
        System.out.println("managerList"+managerList);
        if(managerList == null){
            
            JOptionPane.showMessageDialog(null,"Add minimum one Inventory Manager");
        
        }else {
            if(managerList.size() > 0){
                for (InventoryManager inventoryManager : managerList){

                    Object row[]= new Object[4];
                    row[0]=inventoryManager;
                    row[1]=inventoryManager.getAccountDetails().getUsername();
                    row[2]=inventoryManager.getAddress();
                    row[3]= inventoryManager.getPhone();
                    inventoryManagerTableModel.addRow(row);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"No Inventory Manager Found");
            }
        }    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddInventoryManagerLabel = new javax.swing.JLabel();
        managerNameJLabel = new javax.swing.JLabel();
        storeManagerTextField = new javax.swing.JTextField();
        usernameJLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordJLable = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        addManagerButton = new javax.swing.JButton();
        phoneJLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        addressJLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        viewInventoryManagerJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        managerListTable = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        deleteManagerButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        viewAdminButton = new javax.swing.JButton();
        restPwdLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        restPwdLabel2 = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        addressLabel1 = new javax.swing.JLabel();
        updateAddressTextField = new javax.swing.JTextField();
        updateUsernameTextField = new javax.swing.JTextField();
        updatePasswordTextField = new javax.swing.JPasswordField();
        updateCateringManagerButton = new javax.swing.JButton();
        updatePhoneTextField = new javax.swing.JTextField();
        updateNameTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddInventoryManagerLabel.setBackground(new java.awt.Color(255, 255, 255));
        AddInventoryManagerLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        AddInventoryManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddInventoryManagerLabel.setText("Add Inventory Manager");
        add(AddInventoryManagerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 200, 30));

        managerNameJLabel.setBackground(new java.awt.Color(255, 255, 255));
        managerNameJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        managerNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        managerNameJLabel.setText("Name");
        add(managerNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 167, 64, 30));

        storeManagerTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(storeManagerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 170, 30));

        usernameJLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        usernameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        usernameJLabel.setText("Username");
        add(usernameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 217, 90, 30));

        usernameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 170, 30));

        passwordJLable.setBackground(new java.awt.Color(255, 255, 255));
        passwordJLable.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        passwordJLable.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        passwordJLable.setText("Password");
        add(passwordJLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 277, 80, 20));

        passwordTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 170, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Update / Delete a Inventory Manager");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 340, 20));

        addManagerButton.setBackground(new java.awt.Color(255, 203, 162));
        addManagerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addManagerButton.setText("Add");
        addManagerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManagerButtonActionPerformed(evt);
            }
        });
        add(addManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 120, 40));

        phoneJLabel.setBackground(new java.awt.Color(255, 255, 255));
        phoneJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        phoneJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneJLabel.setText("Phone");
        add(phoneJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 60, 30));

        phoneTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 170, 30));

        addressJLabel.setBackground(new java.awt.Color(255, 255, 255));
        addressJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addressJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressJLabel.setText("Address");
        add(addressJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 64, 30));

        addressTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 170, 30));

        viewInventoryManagerJLabel.setBackground(new java.awt.Color(255, 255, 255));
        viewInventoryManagerJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        viewInventoryManagerJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewInventoryManagerJLabel.setText("View Inventory Managers");
        add(viewInventoryManagerJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 270, -1));

        managerListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Address", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(managerListTable);
        if (managerListTable.getColumnModel().getColumnCount() > 0) {
            managerListTable.getColumnModel().getColumn(0).setResizable(false);
            managerListTable.getColumnModel().getColumn(2).setResizable(false);
            managerListTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 600, 118));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Manage Grocery Store Manager");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 700, 60));

        deleteManagerButton.setBackground(new java.awt.Color(255, 203, 162));
        deleteManagerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteManagerButton.setText("Delete");
        deleteManagerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteManagerButtonActionPerformed(evt);
            }
        });
        add(deleteManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, 111, 40));

        backButton.setBackground(new java.awt.Color(255, 203, 162));
        backButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 111, 45));

        viewAdminButton.setBackground(new java.awt.Color(255, 203, 162));
        viewAdminButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewAdminButton.setText("View Details");
        viewAdminButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdminButtonActionPerformed(evt);
            }
        });
        add(viewAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 110, 40));

        restPwdLabel1.setBackground(new java.awt.Color(255, 255, 255));
        restPwdLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        restPwdLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel1.setText("Name");
        add(restPwdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        restPwdLabel2.setBackground(new java.awt.Color(255, 255, 255));
        restPwdLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        restPwdLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel2.setText("Username");
        add(restPwdLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 228, -1, 20));

        phoneLabel.setBackground(new java.awt.Color(255, 255, 255));
        phoneLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");
        add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 328, 70, 20));

        addressLabel1.setBackground(new java.awt.Color(255, 255, 255));
        addressLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addressLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel1.setText("Address");
        add(addressLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, 30));

        updateAddressTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        updateAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAddressTextFieldActionPerformed(evt);
            }
        });
        add(updateAddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 240, 30));

        updateUsernameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        add(updateUsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 240, 30));

        updatePasswordTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        add(updatePasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 240, 30));

        updateCateringManagerButton.setBackground(new java.awt.Color(255, 203, 162));
        updateCateringManagerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateCateringManagerButton.setText("Update");
        updateCateringManagerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateCateringManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCateringManagerButtonActionPerformed(evt);
            }
        });
        add(updateCateringManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 110, 40));

        updatePhoneTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        updatePhoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePhoneTextFieldActionPerformed(evt);
            }
        });
        add(updatePhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 240, 30));

        updateNameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        updateNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNameTextFieldActionPerformed(evt);
            }
        });
        add(updateNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 240, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManagerButtonActionPerformed
        // TODO add your handling code here:
        
        
        Boolean isValid = ValidateStrings.validateStringFields(usernameTextField.getText(), addressTextField.getText(), phoneTextField.getText(), storeManagerTextField.getText(), passwordTextField.getPassword());
        System.out.println(isValid+"isValid");
        if (!isValid) {
            return;
        }
        Boolean isNameValid = validate.checkName(storeManagerTextField.getText());
        Boolean isUsernameValid= validate.checkUserName(usernameTextField.getText());
        if(!isUsernameValid){
            return;
        }
        if(!isNameValid){
            return;
        }
        for (int i = 0; i < system.getUserAccountDirectory().getUserAccountList().size(); i++) {
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getUsername().equals(usernameTextField.getText())){
                JOptionPane.showMessageDialog(null,"Username Already Present", "Error message" ,JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        char[] ch = passwordTextField.getPassword();
        String pwd = new String(ch);
        //String locationName = (String) locationCombobox.getSelectedItem();
        Employee employee = system.getEmployeeDirectory().createEmployee(storeManagerTextField.getText());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameTextField.getText(), pwd, employee, new InventoryManagerRole(), "InventoryManager");
        InventoryManager inventoryManager = system.getEnterpriseDirectory().getInventoryManagerDirectory().createInventoryManager(storeManagerTextField.getText(), ua, phoneTextField.getText(), addressTextField.getText());
        JOptionPane.showMessageDialog(null, "Inventory Manager added successfully");
        //managerListCombo.addItem(storeManagerTextField.getText());
        populateManagerDetails();
        storeManagerTextField.setText("");
        usernameTextField.setText("");
        passwordTextField.setText("");
        phoneTextField.setText("");
        addressTextField.setText("");
    }//GEN-LAST:event_addManagerButtonActionPerformed

    private void deleteManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteManagerButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = managerListTable.getSelectedRow();
        if (selectedRow >= 0) {
            this.selectedInventoryManager = (InventoryManager) managerListTable.getValueAt(selectedRow, 0);
            this.system.getEnterpriseDirectory().getInventoryManagerDirectory().deleteInventoryManager(selectedInventoryManager.getName());
            JOptionPane.showMessageDialog(null, "Catering Manager Deleted!");
            populateManagerDetails();
        } else {
            JOptionPane.showMessageDialog(null, "Any row selection is not done!");
        }
    }//GEN-LAST:event_deleteManagerButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        FoodWareHouseAdminMainJPanel dm= new FoodWareHouseAdminMainJPanel(userProcessContainer, system);
        userProcessContainer.add("FoodWareHouseAdminMainJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdminButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = managerListTable.getSelectedRow();

        if (selectedRow >= 0) {

            selectedInventoryManager = (InventoryManager) managerListTable.getValueAt(selectedRow, 0);
            updateNameTextField.setText(selectedInventoryManager.getName());
            updateUsernameTextField.setText(selectedInventoryManager.getAccountDetails().getUsername());
            updatePasswordTextField.setText(selectedInventoryManager.getAccountDetails().getPassword());
            updateAddressTextField.setText(selectedInventoryManager.getAddress());
            updatePhoneTextField.setText(selectedInventoryManager.getPhone());

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_viewAdminButtonActionPerformed

    private void updateAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateAddressTextFieldActionPerformed

    private void updateCateringManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCateringManagerButtonActionPerformed
        // TODO add your handling code here:
        
        Boolean isValid = ValidateStrings.validateStringFields(updateUsernameTextField.getText(), updateAddressTextField.getText(), updatePhoneTextField.getText(), updateAddressTextField.getText(), updatePasswordTextField.getPassword());
        Boolean isNameValid = validate.checkName(updateNameTextField.getText());
        Boolean isUsernameValid= validate.checkUserName(updateUsernameTextField.getText());
        if (!isValid) {
            return;
        }

        if(!isUsernameValid){
            return;
        }
        if(!isNameValid){
            return;
        }
        int selectedRow = managerListTable.getSelectedRow();
        if (selectedRow >= 0) {
            this.selectedInventoryManager = (InventoryManager) managerListTable.getValueAt(selectedRow, 0);
            selectedInventoryManager.setName(updateNameTextField.getText());
            selectedInventoryManager.setAddress(updateAddressTextField.getText());
            selectedInventoryManager.setPhone(updatePhoneTextField.getText());
            selectedInventoryManager.getAccountDetails().setUsername(updateUsernameTextField.getText());
            selectedInventoryManager.getAccountDetails().setPassword(updatePasswordTextField.getText());
            JOptionPane.showMessageDialog(null, "Updated Catering Manager!");
            populateManagerDetails();
            updateNameTextField.setText("");
            updateAddressTextField.setText("");
            updateUsernameTextField.setText("");
            updatePasswordTextField.setText("");
            updatePhoneTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Any row selection is not done!");
        }
    }//GEN-LAST:event_updateCateringManagerButtonActionPerformed

    private void updatePhoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePhoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePhoneTextFieldActionPerformed

    private void updateNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddInventoryManagerLabel;
    private javax.swing.JButton addManagerButton;
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JLabel addressLabel1;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteManagerButton;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managerListTable;
    private javax.swing.JLabel managerNameJLabel;
    private javax.swing.JLabel passwordJLable;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel phoneJLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel restPwdLabel1;
    private javax.swing.JLabel restPwdLabel2;
    private javax.swing.JTextField storeManagerTextField;
    private javax.swing.JLabel title;
    private javax.swing.JTextField updateAddressTextField;
    private javax.swing.JButton updateCateringManagerButton;
    private javax.swing.JTextField updateNameTextField;
    private javax.swing.JPasswordField updatePasswordTextField;
    private javax.swing.JTextField updatePhoneTextField;
    private javax.swing.JTextField updateUsernameTextField;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JButton viewAdminButton;
    private javax.swing.JLabel viewInventoryManagerJLabel;
    // End of variables declaration//GEN-END:variables
}
