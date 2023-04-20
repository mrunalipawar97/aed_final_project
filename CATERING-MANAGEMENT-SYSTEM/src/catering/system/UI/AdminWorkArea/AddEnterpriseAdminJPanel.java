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
        this.entTableModel= (DefaultTableModel) adminTable.getModel();
        populate();
        populateDropdown();
    }
    
    public void populate(){
        entTableModel.setRowCount(0);
        ArrayList<Enterprise> enterpiseList=this.system.getEnterpriseDirectory().getEnterpriseList();
        if(enterpiseList.size()>0){
            for (Enterprise ent:enterpiseList){
                System.out.println(ent+"ent");
                if(ent.getEntAdminName()!=null){
                    Object row[]= new Object[2];
                    row[0]=ent;
                    row[1]=ent.getEntAdminName();

                    entTableModel.addRow(row);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No Enterprise Found");
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
        jLabel5 = new javax.swing.JLabel();
        updateRestManagerLabel = new javax.swing.JLabel();
        restManagerText = new javax.swing.JTextField();
        restPwdLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        restPwdText = new javax.swing.JPasswordField();
        phoneLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        AddressText = new javax.swing.JTextField();
        updateRestManagerLabel1 = new javax.swing.JLabel();
        addAdminButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(entComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 83, 270, 30));

        jLabel5.setBackground(new java.awt.Color(254, 254, 226));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 226));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Enterprise Admins");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        updateRestManagerLabel.setBackground(new java.awt.Color(254, 254, 226));
        updateRestManagerLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateRestManagerLabel.setForeground(new java.awt.Color(254, 254, 226));
        updateRestManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel.setText("Enterprise Type");
        add(updateRestManagerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        restManagerText.setForeground(new java.awt.Color(72, 72, 72));
        restManagerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restManagerTextActionPerformed(evt);
            }
        });
        add(restManagerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 123, 280, 30));

        restPwdLabel1.setBackground(new java.awt.Color(254, 254, 226));
        restPwdLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel1.setForeground(new java.awt.Color(254, 254, 226));
        restPwdLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel1.setText("Username");
        add(restPwdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 60));

        usernameText.setForeground(new java.awt.Color(72, 72, 72));
        add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 280, 30));

        jLabel6.setBackground(new java.awt.Color(254, 254, 226));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 226));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        restPwdText.setForeground(new java.awt.Color(72, 72, 72));
        add(restPwdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 270, 30));

        phoneLabel.setBackground(new java.awt.Color(254, 254, 226));
        phoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(254, 254, 226));
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");
        add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        phoneText.setForeground(new java.awt.Color(72, 72, 72));
        add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 260, -1));

        addressLabel.setBackground(new java.awt.Color(254, 254, 226));
        addressLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(254, 254, 226));
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel.setText("Address");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        AddressText.setForeground(new java.awt.Color(72, 72, 72));
        add(AddressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 260, -1));

        updateRestManagerLabel1.setBackground(new java.awt.Color(254, 254, 226));
        updateRestManagerLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateRestManagerLabel1.setForeground(new java.awt.Color(254, 254, 226));
        updateRestManagerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel1.setText("Name");
        add(updateRestManagerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        addAdminButton.setText("Add Admin");
        addAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminButtonActionPerformed(evt);
            }
        });
        add(addAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Type", "Admin Name"
            }
        ));
        jScrollPane1.setViewportView(adminTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 397, -1, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void restManagerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restManagerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restManagerTextActionPerformed

    private void addAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = ValidateStrings.validateFields(usernameText.getText(), AddressText.getText(), phoneText.getText(), restManagerText.getText(), restPwdText.getPassword());
        if (!isValid) {
            return;
        }
        for (int i = 0; i < system.getUserAccountDirectory().getUserAccountList().size(); i++) {
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getUsername().equals(usernameText.getText())){
                JOptionPane.showMessageDialog(null,"Username Already Present", "Error message" ,JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        char[] ch = restPwdText.getPassword();
        String pwd = new String(ch);
        Enterprise ent= (Enterprise) entComboBox.getSelectedItem();
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
            EnterpriseAdmin admin=system.getEnterpriseDirectory().createEnterpriseAdmin(restManagerText.getText(), ua, phoneText.getText(),AddressText.getText(),ent); 
            System.out.println(admin+"admin");
            System.out.println(ua+"ua");
            JOptionPane.showMessageDialog(this, "Enterprise Admin added successfully");
        }
        else if(entType.equals(foodProd)){
            UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new FoodProdEntAdminRole(), "FoodProdAdmin");
            EnterpriseAdmin admin=system.getEnterpriseDirectory().createEnterpriseAdmin(restManagerText.getText(), ua, phoneText.getText(),AddressText.getText(),ent);
            JOptionPane.showMessageDialog(this, "Enterprise Admin added successfully");
        }
        else if(entType.equals(foodQuality)){
            UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new FoodQualityEntAdminRole(), "FoodQualityAdmin");
            EnterpriseAdmin admin=system.getEnterpriseDirectory().createEnterpriseAdmin(restManagerText.getText(), ua, phoneText.getText(),AddressText.getText(),ent);
            JOptionPane.showMessageDialog(this, "Enterprise Admin added successfully");
        }
        else if(entType.equals(foodWarehouse)){
            UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new FoodWarehouseEntAdminRole(), "FoodWarehouseAdmin");
            EnterpriseAdmin admin=system.getEnterpriseDirectory().createEnterpriseAdmin(restManagerText.getText(), ua, phoneText.getText(),AddressText.getText(),ent);
            JOptionPane.showMessageDialog(this, "Enterprise Admin added successfully");
        }
    
        populate();
        restManagerText.setText("");
        usernameText.setText("");
        restPwdText.setText("");
        phoneText.setText("");
        AddressText.setText("");
    }//GEN-LAST:event_addAdminButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressText;
    private javax.swing.JButton addAdminButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTable adminTable;
    private javax.swing.JComboBox entComboBox;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField restManagerText;
    private javax.swing.JLabel restPwdLabel1;
    private javax.swing.JPasswordField restPwdText;
    private javax.swing.JLabel updateRestManagerLabel;
    private javax.swing.JLabel updateRestManagerLabel1;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
