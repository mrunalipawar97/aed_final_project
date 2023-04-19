/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.AdminWorkArea;

import business.ApplicationSystem;
import catering.system.Enterprise.Enterprise;
import catering.system.Users.UserAccount;
import catering.system.Users.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class FoodWarehouseAdminJPanel extends javax.swing.JPanel {
    private UserAccount useraccount;
    private ApplicationSystem system;
    private Enterprise currentEnt;
    DefaultTableModel tableModel;

    /**
     * Creates new form FoodWarehouseAdminJPanel
     */
    public FoodWarehouseAdminJPanel() {
        initComponents();
        this.system=system;
        this.useraccount=useraccount;
    }

    FoodWarehouseAdminJPanel(ApplicationSystem system, UserAccount useraccount) {
        initComponents();
        this.system=system;
        this.useraccount=useraccount;
        nameField.setText("Food Warehouse Enterpise");
        this.currentEnt=this.system.getEnterpriseDirectory().createEnterprise(nameField.getText());
        this.tableModel = (DefaultTableModel) adminTable.getModel();
        populate();
    }

    public void populate() {
        tableModel.setRowCount(0);
        ArrayList<UserAccount> uaDir=this.system.getUserAccountDirectory().getUserAccountlist();
        for(UserAccount u:uaDir){
            if(u.getRole()=="FoodWarehouseAdmin"){
                Object[] row = new Object[2];
                row[0] = this.currentEnt.getEntAdminName();
                row[1] = u.getUsername();
                tableModel.addRow(row);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        addAdminButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        adminNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        deleteAdminButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Admin Password:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel2.setText("Enterprise Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel3.setText("Admin Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        nameField.setEnabled(false);
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 270, 30));
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 270, 30));

        addAdminButton.setText("Add Admin");
        addAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminButtonActionPerformed(evt);
            }
        });
        add(addAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 120, -1));

        jLabel4.setText("Admin Username:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));
        add(adminNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 270, 30));

        jLabel5.setText("Current Admin Details");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admin Name", "Admin Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(adminTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, 100));

        deleteAdminButton.setText("Delete");
        deleteAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAdminButtonActionPerformed(evt);
            }
        });
        add(deleteAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 203, 270, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminButtonActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory ua = this.system.getUserAccountDirectory();

        if(ua.accountExists(usernameField.getText(), passwordField.getText())) {
            JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
                adminNameField.setText("");
                usernameField.setText("");
                passwordField.setText("");
        }
        else {
            if(ua.roleExists("FoodWarehouseAdmin")){
                JOptionPane.showMessageDialog(null, "Admin For This Enterprise Already Exists.");
                adminNameField.setText("");
                usernameField.setText("");
                passwordField.setText("");
            }
            else{
                UserAccount user = this.system.getUserAccountDirectory().createUserAccount(usernameField.getText(), passwordField.getText(), "FoodWarehouseAdmin");
                this.currentEnt.setEntAdminName(adminNameField.getText());
                JOptionPane.showMessageDialog(null, "Admin Created.");
                populate(); 
                adminNameField.setText("");
                usernameField.setText("");
                passwordField.setText("");
                
            }
        }
    }//GEN-LAST:event_addAdminButtonActionPerformed

    private void deleteAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAdminButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= adminTable.getSelectedRow();
        if(selectedRow>=0){
            String adminName=(String) adminTable.getValueAt(selectedRow, 0);
            String username=(String) adminTable.getValueAt(selectedRow, 1);
            UserAccountDirectory uaDir= this.system.getUserAccountDirectory();
            ArrayList<Enterprise> entList=this.system.getEnterpriseDirectory().getEnterpriseList();
            for(Enterprise ent: entList){
                if(ent.getEntAdminName().equals(adminName)){
                    ent.setEntAdminName("none");
                }
            }
            UserAccount user=uaDir.findByUsername(username);
            uaDir.removeUser(user);
            JOptionPane.showMessageDialog(null,"Admin Deleted");
            populate();
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select the admin First");
        }
    }//GEN-LAST:event_deleteAdminButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdminButton;
    private javax.swing.JTextField adminNameField;
    private javax.swing.JTable adminTable;
    private javax.swing.JButton deleteAdminButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
