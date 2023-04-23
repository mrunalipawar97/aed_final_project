/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodProdAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodProdOrganization.Coordinator;
import catering.system.FoodProdOrganization.Supervisor;
import catering.system.Role.CoordinatorRole;
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
 * @author nishipancholi
 */
public class AddCoordinatorJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    ApplicationSystem system;
    DefaultTableModel coordinatorTableModel;
    Coordinator selectedCoordinator;
    Validate validate;

    /**
     * Creates new form AddCoordinatorJPanel
     */
    public AddCoordinatorJPanel() {
        initComponents();
    }

    AddCoordinatorJPanel(ApplicationSystem system, JPanel userProcessContainer) {
        initComponents();
        this.system=system;
        this.validate=new Validate();
        this.userProcessContainer=userProcessContainer;
        this.coordinatorTableModel= (DefaultTableModel) coordinatorTable.getModel();
        this.selectedCoordinator= new Coordinator();
        populate();
    }
    
    public void populate(){
        coordinatorTableModel.setRowCount(0);
        ArrayList<Coordinator> enterpiseList=this.system.getEnterpriseDirectory().getCoordinatorList();
        System.out.println(enterpiseList+"entList");
        if(enterpiseList==null){
            JOptionPane.showMessageDialog(null,"Add minimum one coordinator");
        }
        else{
        if(enterpiseList.size()>0){
            for (Coordinator ent:enterpiseList){
                    Object row[]= new Object[3];
                    row[0]=ent;
                    row[1]=ent.getAccountDetails().getUsername();
                    row[2]=ent.getAccountDetails().getPassword();

                    coordinatorTableModel.addRow(row);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No Coordinator Found");
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        restManagerText = new javax.swing.JTextField();
        restPwdLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        restPwdText = new javax.swing.JPasswordField();
        restPwdLabel2 = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        AddressText = new javax.swing.JTextField();
        addressLabel1 = new javax.swing.JLabel();
        addManagerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        coordinatorTable = new javax.swing.JTable();
        viewAdminButton = new javax.swing.JButton();
        nameUpdateField = new javax.swing.JTextField();
        usernameUpdateField = new javax.swing.JTextField();
        passwordUpdateField = new javax.swing.JPasswordField();
        restPwdLabel3 = new javax.swing.JLabel();
        restPwdLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phoneLabel1 = new javax.swing.JLabel();
        addressLabel2 = new javax.swing.JLabel();
        updateSupervisor = new javax.swing.JButton();
        deleteSupervisorButton = new javax.swing.JButton();
        addressUpdateField = new javax.swing.JTextField();
        phoneUpdateField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setText("Add Coordinators");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 0, 360, -1));

        btnBack.setBackground(new java.awt.Color(255, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 40));

        restManagerText.setForeground(new java.awt.Color(72, 72, 72));
        restManagerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restManagerTextActionPerformed(evt);
            }
        });
        add(restManagerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 280, -1));

        restPwdLabel1.setBackground(new java.awt.Color(254, 254, 226));
        restPwdLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel1.setForeground(new java.awt.Color(254, 254, 226));
        restPwdLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel1.setText("Name");
        add(restPwdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        usernameText.setForeground(new java.awt.Color(72, 72, 72));
        add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 280, -1));

        jLabel6.setBackground(new java.awt.Color(254, 254, 226));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 226));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        restPwdText.setForeground(new java.awt.Color(72, 72, 72));
        add(restPwdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 280, -1));

        restPwdLabel2.setBackground(new java.awt.Color(254, 254, 226));
        restPwdLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel2.setForeground(new java.awt.Color(254, 254, 226));
        restPwdLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel2.setText("Username");
        add(restPwdLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        phoneLabel.setBackground(new java.awt.Color(254, 254, 226));
        phoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(254, 254, 226));
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");
        add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        phoneText.setForeground(new java.awt.Color(72, 72, 72));
        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });
        add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 280, -1));

        AddressText.setForeground(new java.awt.Color(72, 72, 72));
        add(AddressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 280, -1));

        addressLabel1.setBackground(new java.awt.Color(254, 254, 226));
        addressLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addressLabel1.setForeground(new java.awt.Color(254, 254, 226));
        addressLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel1.setText("Address");
        add(addressLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        addManagerButton.setBackground(new java.awt.Color(255, 102, 102));
        addManagerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addManagerButton.setForeground(new java.awt.Color(255, 255, 255));
        addManagerButton.setText("Add");
        addManagerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManagerButtonActionPerformed(evt);
            }
        });
        add(addManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 90, 40));

        coordinatorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coordinator Name", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(coordinatorTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 170));

        viewAdminButton.setBackground(new java.awt.Color(255, 102, 102));
        viewAdminButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewAdminButton.setForeground(new java.awt.Color(255, 255, 255));
        viewAdminButton.setText("View Details");
        viewAdminButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdminButtonActionPerformed(evt);
            }
        });
        add(viewAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 120, 40));

        nameUpdateField.setForeground(new java.awt.Color(72, 72, 72));
        nameUpdateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameUpdateFieldActionPerformed(evt);
            }
        });
        add(nameUpdateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 240, 30));

        usernameUpdateField.setForeground(new java.awt.Color(72, 72, 72));
        add(usernameUpdateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 240, 30));

        passwordUpdateField.setForeground(new java.awt.Color(72, 72, 72));
        add(passwordUpdateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 240, 30));

        restPwdLabel3.setBackground(new java.awt.Color(254, 254, 226));
        restPwdLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel3.setForeground(new java.awt.Color(254, 254, 226));
        restPwdLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel3.setText("Name");
        add(restPwdLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        restPwdLabel4.setBackground(new java.awt.Color(254, 254, 226));
        restPwdLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel4.setForeground(new java.awt.Color(254, 254, 226));
        restPwdLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel4.setText("Username");
        add(restPwdLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setBackground(new java.awt.Color(254, 254, 226));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 226));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Password");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        phoneLabel1.setBackground(new java.awt.Color(254, 254, 226));
        phoneLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneLabel1.setForeground(new java.awt.Color(254, 254, 226));
        phoneLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel1.setText("Phone");
        add(phoneLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        addressLabel2.setBackground(new java.awt.Color(254, 254, 226));
        addressLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addressLabel2.setForeground(new java.awt.Color(254, 254, 226));
        addressLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel2.setText("Address");
        add(addressLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        updateSupervisor.setBackground(new java.awt.Color(255, 102, 102));
        updateSupervisor.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateSupervisor.setForeground(new java.awt.Color(255, 255, 255));
        updateSupervisor.setText("Update Coordinator");
        updateSupervisor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSupervisorActionPerformed(evt);
            }
        });
        add(updateSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 200, 60));

        deleteSupervisorButton.setBackground(new java.awt.Color(255, 102, 102));
        deleteSupervisorButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        deleteSupervisorButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteSupervisorButton.setText("Delete Coordinator");
        deleteSupervisorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteSupervisorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSupervisorButtonActionPerformed(evt);
            }
        });
        add(deleteSupervisorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 130, 40));
        add(addressUpdateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 240, 30));
        add(phoneUpdateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 240, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FoodProdAdminMainJPanel dm= new FoodProdAdminMainJPanel(userProcessContainer, system);
        userProcessContainer.add("manageSupervisorJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void restManagerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restManagerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restManagerTextActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextActionPerformed

    private void addManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManagerButtonActionPerformed
        // TODO add your handling code here:
        Boolean isUsernameValid= validate.checkUserName(usernameText.getText());
        Boolean isValid = ValidateStrings.validateStringFields(usernameText.getText(), AddressText.getText(), phoneText.getText(), restManagerText.getText(), restPwdText.getPassword());
        if (!isValid) {
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
        char[] ch = restPwdText.getPassword();
        String pwd = new String(ch);
        //        String netwrokname = (String) netwrokCombo.getSelectedItem();
        Employee employee = system.getEmployeeDirectory().createEmployee(restManagerText.getText());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new CoordinatorRole(), "Coordinator");
        Coordinator rest = system.getEnterpriseDirectory().createCoordinator(restManagerText.getText(), ua, phoneText.getText(),AddressText.getText());
        JOptionPane.showMessageDialog(null, "Coordinator added successfully");
        populate();
        restManagerText.setText("");
        usernameText.setText("");
        restPwdText.setText("");
        phoneText.setText("");
        AddressText.setText("");
    }//GEN-LAST:event_addManagerButtonActionPerformed

    private void viewAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdminButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = coordinatorTable.getSelectedRow();

        if(selectedRow>=0){

            selectedCoordinator = (Coordinator) coordinatorTable.getValueAt(selectedRow, 0);
            nameUpdateField.setText(selectedCoordinator.getName());
            usernameUpdateField.setText(selectedCoordinator.getAccountDetails().getUsername());
            passwordUpdateField.setText(selectedCoordinator.getAccountDetails().getPassword());
            addressUpdateField.setText(selectedCoordinator.getAddress());
            phoneUpdateField.setText(selectedCoordinator.getPhone());

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select row");
        }
    }//GEN-LAST:event_viewAdminButtonActionPerformed

    private void nameUpdateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameUpdateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameUpdateFieldActionPerformed

    private void updateSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSupervisorActionPerformed
        // TODO add your handling code here:
        Boolean isUsernameValid= validate.checkUserName(usernameUpdateField.getText());
        Boolean isValid = ValidateStrings.validateStringFields(usernameUpdateField.getText(), addressUpdateField.getText(), phoneUpdateField.getText(), nameUpdateField.getText(), passwordUpdateField.getPassword());
        if(!isValid){
            return;
        }
        if (!isUsernameValid) {
            return;
        }
        int selectedRow = coordinatorTable.getSelectedRow();
        if(selectedRow>=0){
            this.selectedCoordinator= (Coordinator) coordinatorTable.getValueAt(selectedRow,0);
            selectedCoordinator.setName(nameUpdateField.getText());
            selectedCoordinator.setAddress(addressUpdateField.getText());
            selectedCoordinator.setPhone(phoneUpdateField.getText());
            selectedCoordinator.getAccountDetails().setUsername(usernameUpdateField.getText());
            selectedCoordinator.getAccountDetails().setPassword(passwordUpdateField.getText());
            JOptionPane.showMessageDialog(null,"Updated Coordinator!");
            populate();
            nameUpdateField.setText("");
            addressUpdateField.setText("");
            usernameUpdateField.setText("");
            passwordUpdateField.setText("");
            phoneUpdateField.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"Any row selection is not done!");
        }
    }//GEN-LAST:event_updateSupervisorActionPerformed

    private void deleteSupervisorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSupervisorButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = coordinatorTable.getSelectedRow();
        if(selectedRow>=0){
            this.selectedCoordinator= (Coordinator) coordinatorTable.getValueAt(selectedRow,0);
            this.system.getEnterpriseDirectory().deleteSupervisor(selectedCoordinator.getName());
            JOptionPane.showMessageDialog(null,"Coordinator Deleted!");
            populate();
        }
        else{
            JOptionPane.showMessageDialog(null,"Any row selection is not done!");
        }
    }//GEN-LAST:event_deleteSupervisorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressText;
    private javax.swing.JButton addManagerButton;
    private javax.swing.JLabel addressLabel1;
    private javax.swing.JLabel addressLabel2;
    private javax.swing.JTextField addressUpdateField;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable coordinatorTable;
    private javax.swing.JButton deleteSupervisorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameUpdateField;
    private javax.swing.JPasswordField passwordUpdateField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField phoneUpdateField;
    private javax.swing.JTextField restManagerText;
    private javax.swing.JLabel restPwdLabel1;
    private javax.swing.JLabel restPwdLabel2;
    private javax.swing.JLabel restPwdLabel3;
    private javax.swing.JLabel restPwdLabel4;
    private javax.swing.JPasswordField restPwdText;
    private javax.swing.JButton updateSupervisor;
    private javax.swing.JTextField usernameText;
    private javax.swing.JTextField usernameUpdateField;
    private javax.swing.JButton viewAdminButton;
    // End of variables declaration//GEN-END:variables
}
