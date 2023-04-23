/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodQualityAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodQualityOrganization.NutritionAuditor;
import catering.system.Role.NutritionAuditorRole;
import catering.system.Users.Employee;
import catering.system.Users.UserAccount;
import catering.system.validations.ValidateStrings;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeelkanzaria
 */
public class NutritionAuditorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NutritionAuditorJPanel
     */
    JPanel userProcessContainer;
    ApplicationSystem system;
    //private ArrayList<NutritionAuditor> nutritionList;  
    NutritionAuditor selectedNutritionAuditor;
    DefaultTableModel nutritionAuditorTableModel;
    
    public NutritionAuditorJPanel() {
        initComponents();
    }

    NutritionAuditorJPanel(JPanel userProcessContainer, ApplicationSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.nutritionAuditorTableModel= (DefaultTableModel) nutritionAuditorTable.getModel();
        this.selectedNutritionAuditor = new NutritionAuditor();
        populateNutritionManagerDetails();
        
    }
    
    public void populateNutritionManagerDetails(){
       
        nutritionAuditorTableModel.setRowCount(0);
        ArrayList<NutritionAuditor> nutritionAuditorList = this.system.getEnterpriseDirectory().getNutritionAuditorDirectory().getNutritionAuditorList();
        System.out.println("nutritionAuditorList : "+nutritionAuditorList);
        if(nutritionAuditorList == null){
            
            JOptionPane.showMessageDialog(null,"Add minimum one Nutrition Auditor");
        }else {
            if(nutritionAuditorList.size() > 0){
                for (NutritionAuditor nutritionAuditorManager : nutritionAuditorList){

                    Object row[]= new Object[4];
                    row[0]=nutritionAuditorManager;
                    row[1]=nutritionAuditorManager.getAccountDetails().getUsername();
                    row[2]=nutritionAuditorManager.getAddress();
                    row[3]= nutritionAuditorManager.getPhone();
                    nutritionAuditorTableModel.addRow(row);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"No Nutrition Auditor Manager Found");
            }
        }    
    }
    
    public void reset() {
        updateNameTextField.setText("");
        updatePhoneTextField.setText("");
        updateUsernameTextField.setText("");
        updatePasswordTextField.setText("");
        updateAddressTextField.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        auditorNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        auditorUsernameTextField = new javax.swing.JTextField();
        auditorPasswordTextField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        auditorPhoneTextField = new javax.swing.JTextField();
        auditorAddressTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addAuditorButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        updateNameTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        updateUsernameTextField = new javax.swing.JTextField();
        updatePasswordTextField = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        updatePhoneTextField = new javax.swing.JTextField();
        updateAddressTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nutritionAuditorTable = new javax.swing.JTable();
        viewNutritionAuditorJLabel = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        viewAdminButton = new javax.swing.JButton();

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 131, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Auditor Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 100, 30));
        add(auditorNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 170, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Username ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 30));
        add(auditorUsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 170, 30));
        add(auditorPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 170, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Password ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 80, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Phone No");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 70, 30));
        add(auditorPhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 170, 30));
        add(auditorAddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 170, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 70, 30));

        addAuditorButton.setBackground(new java.awt.Color(255, 203, 162));
        addAuditorButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addAuditorButton.setText("Add Auditor");
        addAuditorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addAuditorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuditorButtonActionPerformed(evt);
            }
        });
        add(addAuditorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 110, 30));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Add Nutrition Auditor");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, 30));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setText("Auditor Name");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 100, 30));
        add(updateNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 170, 30));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setText("Username ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 80, 30));
        add(updateUsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 170, 30));
        add(updatePasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 170, 30));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setText("Password ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 80, 30));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel12.setText("Phone No");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 70, 30));
        add(updatePhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 170, 30));
        add(updateAddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 170, 30));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel13.setText("Address");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 70, 30));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel15.setText("Update / Delete Nutrition Auditor");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 230, 30));

        deleteButton.setBackground(new java.awt.Color(255, 203, 162));
        deleteButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 110, 40));

        updateButton.setBackground(new java.awt.Color(255, 203, 162));
        updateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 100, 40));

        nutritionAuditorTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(nutritionAuditorTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 600, 140));

        viewNutritionAuditorJLabel.setBackground(new java.awt.Color(255, 255, 255));
        viewNutritionAuditorJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        viewNutritionAuditorJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewNutritionAuditorJLabel.setText("View Nutrition Auditor ");
        add(viewNutritionAuditorJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 230, 30));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Manage Nutrition Auditor");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 530, 50));

        viewAdminButton.setBackground(new java.awt.Color(255, 203, 162));
        viewAdminButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewAdminButton.setText("View Details");
        viewAdminButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdminButtonActionPerformed(evt);
            }
        });
        add(viewAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FoodQualityAdminMainJPanel dm= new FoodQualityAdminMainJPanel(userProcessContainer, system);
        userProcessContainer.add("foodQualityAdminJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = ValidateStrings.validateStringFields(updateUsernameTextField.getText(), updateAddressTextField.getText(), updatePhoneTextField.getText(), updateAddressTextField.getText(), updatePasswordTextField.getPassword());
        if (!isValid) {
            return;
        }
        int selectedRow = nutritionAuditorTable.getSelectedRow();
        if (selectedRow >= 0) {
            this.selectedNutritionAuditor = (NutritionAuditor) nutritionAuditorTable.getValueAt(selectedRow, 0);
            selectedNutritionAuditor.setAuditorName(updateNameTextField.getText());
            selectedNutritionAuditor.setAddress(updateAddressTextField.getText());
            selectedNutritionAuditor.setPhone(updatePhoneTextField.getText());
            selectedNutritionAuditor.getAccountDetails().setUsername(updateUsernameTextField.getText());
            selectedNutritionAuditor.getAccountDetails().setPassword(updatePasswordTextField.getText());
            JOptionPane.showMessageDialog(null, "Updated Nutrition Auditor!");
            populateNutritionManagerDetails();
            updateNameTextField.setText("");
            updateAddressTextField.setText("");
            updateUsernameTextField.setText("");
            updatePasswordTextField.setText("");
            updatePhoneTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Any row selection is not done!");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = nutritionAuditorTable.getSelectedRow();
        if (selectedRow >= 0) {
            this.selectedNutritionAuditor = (NutritionAuditor) nutritionAuditorTable.getValueAt(selectedRow, 0);
            this.system.getEnterpriseDirectory().getNutritionAuditorDirectory().deleteNutritionAuditorManager(selectedNutritionAuditor.getAuditorName());
            JOptionPane.showMessageDialog(null, "Catering Manager Deleted!");
            populateNutritionManagerDetails();
        } else {
            JOptionPane.showMessageDialog(null, "Any row selection is not done!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addAuditorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuditorButtonActionPerformed
        // TODO add your handling code here:
        
        Boolean isValid = ValidateStrings.validateStringFields(auditorUsernameTextField.getText(), auditorAddressTextField.getText(), auditorPhoneTextField.getText(), auditorNameTextField.getText(), auditorPasswordTextField.getPassword());
        System.out.println(isValid+"isValid");
        if (!isValid) {
            return;
        }
        for (int i = 0; i < system.getUserAccountDirectory().getUserAccountList().size(); i++) {
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getUsername().equals(auditorUsernameTextField.getText())){
                JOptionPane.showMessageDialog(null,"Username Already Present", "Error message" ,JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        char[] ch = auditorPasswordTextField.getPassword();
        String pwd = new String(ch);
        //String locationName = (String) locationCombobox.getSelectedItem();
        Employee employee = system.getEmployeeDirectory().createEmployee(auditorNameTextField.getText());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(auditorUsernameTextField.getText(), pwd, employee, new NutritionAuditorRole(), "NutritionAuditor");
        NutritionAuditor nutritionAuditor = system.getEnterpriseDirectory().getNutritionAuditorDirectory().createNutritionAuditor(auditorNameTextField.getText(), ua, auditorPhoneTextField.getText(), auditorAddressTextField.getText());
        JOptionPane.showMessageDialog(null, "Inventory Manager added successfully");
        //managerListCombo.addItem(storeManagerTextField.getText());
        populateNutritionManagerDetails();
        
        auditorNameTextField.setText("");
        auditorUsernameTextField.setText("");
        auditorPasswordTextField.setText("");
        auditorPhoneTextField.setText("");
        auditorAddressTextField.setText("");
    }//GEN-LAST:event_addAuditorButtonActionPerformed

    private void viewAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdminButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = nutritionAuditorTable.getSelectedRow();

        if (selectedRow >= 0) {

            selectedNutritionAuditor = (NutritionAuditor) nutritionAuditorTable.getValueAt(selectedRow, 0);
            updateNameTextField.setText(selectedNutritionAuditor.getAuditorName());
            updateUsernameTextField.setText(selectedNutritionAuditor.getAccountDetails().getUsername());
            updatePasswordTextField.setText(selectedNutritionAuditor.getAccountDetails().getPassword());
            updateAddressTextField.setText(selectedNutritionAuditor.getAddress());
            updatePhoneTextField.setText(selectedNutritionAuditor.getPhone());

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_viewAdminButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAuditorButton;
    private javax.swing.JTextField auditorAddressTextField;
    private javax.swing.JTextField auditorNameTextField;
    private javax.swing.JPasswordField auditorPasswordTextField;
    private javax.swing.JTextField auditorPhoneTextField;
    private javax.swing.JTextField auditorUsernameTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable nutritionAuditorTable;
    private javax.swing.JLabel title;
    private javax.swing.JTextField updateAddressTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField updateNameTextField;
    private javax.swing.JPasswordField updatePasswordTextField;
    private javax.swing.JTextField updatePhoneTextField;
    private javax.swing.JTextField updateUsernameTextField;
    private javax.swing.JButton viewAdminButton;
    private javax.swing.JLabel viewNutritionAuditorJLabel;
    // End of variables declaration//GEN-END:variables
}
