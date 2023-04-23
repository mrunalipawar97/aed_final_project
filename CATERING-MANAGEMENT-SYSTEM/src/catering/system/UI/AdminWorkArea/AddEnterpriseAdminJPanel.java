/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.AdminWorkArea;

import business.ApplicationSystem;
import catering.system.Enterprise.Enterprise;
import catering.system.Enterprise.EnterpriseAdmin;
import catering.system.Role.FoodProdEntAdminRole;
import catering.system.Role.FoodQualityEntAdminRole;
import catering.system.Role.FoodWarehouseEntAdminRole;
import catering.system.Role.SeviceEntAdminRole;
import catering.system.Users.Employee;
import catering.system.Users.UserAccount;
import catering.system.validations.Validate;
import catering.system.validations.ValidateStrings;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class AddEnterpriseAdminJPanel extends javax.swing.JPanel {
    private ApplicationSystem system;
    JPanel container;
    DefaultTableModel entTableModel;
    private EnterpriseAdmin selectedEnterprise;
    Validate valid;

    /**
     * Creates new form AddEnterpriseAdminJPanel
     */
    public AddEnterpriseAdminJPanel() {
        initComponents();
    }

    AddEnterpriseAdminJPanel(ApplicationSystem system, JPanel container) {
        initComponents();
        this.system=system;
        this.container=container;
        this.valid=new Validate();
        this.entTableModel= (DefaultTableModel) adminTable.getModel();
        this.selectedEnterprise= new EnterpriseAdmin();
        populate();
        populateDropdown();
    }
    
    public void populate(){
        entTableModel.setRowCount(0);
        ArrayList<Enterprise> enterpiseList=this.system.getEnterpriseDirectory().getEnterpriseList();
        ArrayList<EnterpriseAdmin> entAdminList=this.system.getEnterpriseDirectory().getEnterpriseAdminList();
        if(entAdminList.size()>0){
            for (EnterpriseAdmin entAdmin:entAdminList){
                System.out.println(entAdmin+"ent");
                    Object row[]= new Object[4];
                    row[0]=entAdmin;
                    row[1]=entAdmin.getName();
                    row[2]=entAdmin.getAccountDetails().getUsername();
                    row[3]=entAdmin.getAccountDetails().getPassword();

                    entTableModel.addRow(row);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No Enterprise Admin Found");
        }
    }
    public void populateDropdown(){
        ArrayList<Enterprise> enterpiseList=this.system.getEnterpriseDirectory().getEnterpriseList();
        
        for(Enterprise ent:enterpiseList){
            entComboBox.addItem(ent);
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

        entComboBox = new javax.swing.JComboBox();
        updateRestManagerLabel = new javax.swing.JLabel();
        restManagerText = new javax.swing.JTextField();
        restPwdLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        restPwdText = new javax.swing.JPasswordField();
        updateRestManagerLabel1 = new javax.swing.JLabel();
        addAdminButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewAdminButton = new javax.swing.JButton();
        updateRestManagerLabel2 = new javax.swing.JLabel();
        updateRestManagerLabel3 = new javax.swing.JLabel();
        restPwdLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adminNameField = new javax.swing.JTextField();
        adminUsernameField = new javax.swing.JTextField();
        updtPwdField = new javax.swing.JPasswordField();
        entTypeField = new javax.swing.JTextField();
        updateEntAdminButton = new javax.swing.JButton();
        deleteEnterpriseAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(entComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 240, 30));

        updateRestManagerLabel.setBackground(new java.awt.Color(254, 254, 226));
        updateRestManagerLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateRestManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel.setText("Enterprise Type");
        add(updateRestManagerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 30));

        restManagerText.setForeground(new java.awt.Color(72, 72, 72));
        restManagerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restManagerTextActionPerformed(evt);
            }
        });
        add(restManagerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 240, 30));

        restPwdLabel1.setBackground(new java.awt.Color(254, 254, 226));
        restPwdLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel1.setText("Username");
        add(restPwdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, 50));

        usernameText.setForeground(new java.awt.Color(72, 72, 72));
        add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 240, 30));

        jLabel6.setBackground(new java.awt.Color(254, 254, 226));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 40));

        restPwdText.setForeground(new java.awt.Color(72, 72, 72));
        add(restPwdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 240, 30));

        updateRestManagerLabel1.setBackground(new java.awt.Color(254, 254, 226));
        updateRestManagerLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateRestManagerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel1.setText("Name");
        add(updateRestManagerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, 30));

        addAdminButton.setBackground(new java.awt.Color(255, 203, 162));
        addAdminButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addAdminButton.setText("Add Admin");
        addAdminButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminButtonActionPerformed(evt);
            }
        });
        add(addAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 120, 40));

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Type", "Admin Name", "User Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(adminTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 510, 200));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel2.setText("Add Enterprise Admins");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 420, -1));

        viewAdminButton.setBackground(new java.awt.Color(255, 203, 162));
        viewAdminButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewAdminButton.setText("View Details");
        viewAdminButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdminButtonActionPerformed(evt);
            }
        });
        add(viewAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 120, 40));

        updateRestManagerLabel2.setBackground(new java.awt.Color(254, 254, 226));
        updateRestManagerLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateRestManagerLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel2.setText("Enterprise Type");
        add(updateRestManagerLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, 30));

        updateRestManagerLabel3.setBackground(new java.awt.Color(254, 254, 226));
        updateRestManagerLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateRestManagerLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel3.setText("Name");
        add(updateRestManagerLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, 30));

        restPwdLabel2.setBackground(new java.awt.Color(254, 254, 226));
        restPwdLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel2.setText("Username");
        add(restPwdLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, 50));

        jLabel7.setBackground(new java.awt.Color(254, 254, 226));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Password");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, -1, 40));

        adminNameField.setForeground(new java.awt.Color(72, 72, 72));
        adminNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNameFieldActionPerformed(evt);
            }
        });
        add(adminNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 240, 30));

        adminUsernameField.setForeground(new java.awt.Color(72, 72, 72));
        add(adminUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 240, 30));

        updtPwdField.setForeground(new java.awt.Color(72, 72, 72));
        add(updtPwdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 240, 30));

        entTypeField.setEnabled(false);
        add(entTypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 240, 30));

        updateEntAdminButton.setBackground(new java.awt.Color(255, 203, 162));
        updateEntAdminButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateEntAdminButton.setText("Update Enterprise Admin");
        updateEntAdminButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateEntAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEntAdminButtonActionPerformed(evt);
            }
        });
        add(updateEntAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 240, 40));

        deleteEnterpriseAdmin.setBackground(new java.awt.Color(255, 203, 162));
        deleteEnterpriseAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteEnterpriseAdmin.setText("Delete  Enterprise Admin");
        deleteEnterpriseAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEnterpriseAdminActionPerformed(evt);
            }
        });
        add(deleteEnterpriseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 190, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void restManagerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restManagerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restManagerTextActionPerformed

    private void addAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = ValidateStrings.validateFields(usernameText.getText(), restManagerText.getText(), restPwdText.getPassword());
        Boolean isNameValid=valid.checkName(restManagerText.getText());
        Boolean isUsernameValid= valid.checkUserName(usernameText.getText());
        Enterprise ent= (Enterprise) entComboBox.getSelectedItem();
        if (!isValid) {
            return;
        }
        if (!isNameValid) {
            return;
        }
        if (!isUsernameValid) {
            return;
        }
        for (int i = 0; i < system.getUserAccountDirectory().getUserAccountList().size(); i++) {
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getUsername().equals(usernameText.getText())){
                JOptionPane.showMessageDialog(null,"Username Already Present", "Error message" ,JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        if(system.getEnterpriseDirectory().getEnterpriseAdminList().size()>0){
            for (int i = 0; i < system.getEnterpriseDirectory().getEnterpriseAdminList().size(); i++) {
                if(system.getEnterpriseDirectory().getEnterpriseAdminList().get(i).getEnt().getEntType().equals(ent.getEntType())){
                    JOptionPane.showMessageDialog(null,"Enterprise Admin Already Present", "Error message" ,JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        char[] ch = restPwdText.getPassword();
        String pwd = new String(ch);
        
        Employee employee = system.getEmployeeDirectory().createEmployee(restManagerText.getText());
        String entType=ent.getEntType();
        System.out.println(ent+"ent");
        System.out.println(entType+"entType");
        String service="Service Enterprise";
        String foodProd="Food Production Enterprise";
        String foodQuality="Food Quality Enterprise";
        String foodWarehouse="Food WareHouse Enterprise";
        
        if(entType.equals(service)){
            System.out.print("hello");
            UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new SeviceEntAdminRole(), "ServiceEntAdmin");
            EnterpriseAdmin admin=system.getEnterpriseDirectory().createEnterpriseAdmin(restManagerText.getText(), ua,ent); 
            ent.setAdmin(admin);
            System.out.println(admin+"admin");
            System.out.println(ua+"ua");
            JOptionPane.showMessageDialog(this, "Enterprise Admin added successfully");
        }
        else if(entType.equals(foodProd)){
            UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new FoodProdEntAdminRole(), "FoodProdAdmin");
            EnterpriseAdmin admin=system.getEnterpriseDirectory().createEnterpriseAdmin(restManagerText.getText(), ua,ent);
            ent.setAdmin(admin);
            JOptionPane.showMessageDialog(this, "Enterprise Admin added successfully");
        }
        else if(entType.equals(foodQuality)){
            UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new FoodQualityEntAdminRole(), "FoodQualityAdmin");
            EnterpriseAdmin admin=system.getEnterpriseDirectory().createEnterpriseAdmin(restManagerText.getText(), ua,ent);
            ent.setAdmin(admin);
            JOptionPane.showMessageDialog(this, "Enterprise Admin added successfully");
        }
        else if(entType.equals(foodWarehouse)){
            UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new FoodWarehouseEntAdminRole(), "FoodWarehouseAdmin");
            EnterpriseAdmin admin=system.getEnterpriseDirectory().createEnterpriseAdmin(restManagerText.getText(), ua,ent);
            ent.setAdmin(admin);
            JOptionPane.showMessageDialog(this, "Enterprise Admin added successfully");
        }
    
        populate();
        restManagerText.setText("");
        usernameText.setText("");
        restPwdText.setText("");
    }//GEN-LAST:event_addAdminButtonActionPerformed

    private void adminNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminNameFieldActionPerformed

    private void viewAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdminButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = adminTable.getSelectedRow();
        
        if(selectedRow>=0){
            
            selectedEnterprise = (EnterpriseAdmin) adminTable.getValueAt(selectedRow, 0);
            entTypeField.setText(selectedEnterprise.getEnt().getEntType());
            adminNameField.setText(selectedEnterprise.getName());
            adminUsernameField.setText(selectedEnterprise.getAccountDetails().getUsername());
            updtPwdField.setText(selectedEnterprise.getAccountDetails().getPassword());
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select row");
        }
    }//GEN-LAST:event_viewAdminButtonActionPerformed

    private void updateEntAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEntAdminButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = ValidateStrings.validateFields(adminUsernameField.getText(), adminNameField.getText(), updtPwdField.getPassword());
        if (!isValid) {
            return;
        }
        int selectedRow = adminTable.getSelectedRow();
        if(selectedRow>=0){
            
            selectedEnterprise.setName(adminNameField.getText());
            selectedEnterprise.getEnt().setEntAdminName(adminNameField.getText());
            selectedEnterprise.getAccountDetails().setUsername(adminUsernameField.getText());
            selectedEnterprise.getAccountDetails().setPassword(updtPwdField.getText());
            JOptionPane.showMessageDialog(null,"Updated Enterprise Name!"); 
            populate();
            entTypeField.setText("");
            adminNameField.setText("");
            adminUsernameField.setText("");
            updtPwdField.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"Any row selection is not done!");
        }
    }//GEN-LAST:event_updateEntAdminButtonActionPerformed

    private void deleteEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEnterpriseAdminActionPerformed
        // TODO add your handling code here:
        int selectedRow = adminTable.getSelectedRow();
        if(selectedRow>=0){
            selectedEnterprise= (EnterpriseAdmin) adminTable.getValueAt(selectedRow,0);
            this.system.getEnterpriseDirectory().deleteEnterpriseAdmin(selectedEnterprise.getName());
            this.system.getUserAccountDirectory().deleteUser(selectedEnterprise.getName());
            JOptionPane.showMessageDialog(null,"Enterprise Deleted!");
            populate();
        }
        else{
            JOptionPane.showMessageDialog(null,"Any row selection is not done!");
        }
    }//GEN-LAST:event_deleteEnterpriseAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdminButton;
    private javax.swing.JTextField adminNameField;
    private javax.swing.JTable adminTable;
    private javax.swing.JTextField adminUsernameField;
    private javax.swing.JButton deleteEnterpriseAdmin;
    private javax.swing.JComboBox entComboBox;
    private javax.swing.JTextField entTypeField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField restManagerText;
    private javax.swing.JLabel restPwdLabel1;
    private javax.swing.JLabel restPwdLabel2;
    private javax.swing.JPasswordField restPwdText;
    private javax.swing.JButton updateEntAdminButton;
    private javax.swing.JLabel updateRestManagerLabel;
    private javax.swing.JLabel updateRestManagerLabel1;
    private javax.swing.JLabel updateRestManagerLabel2;
    private javax.swing.JLabel updateRestManagerLabel3;
    private javax.swing.JPasswordField updtPwdField;
    private javax.swing.JTextField usernameText;
    private javax.swing.JButton viewAdminButton;
    // End of variables declaration//GEN-END:variables
}
