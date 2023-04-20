/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.AdminWorkArea;

import business.ApplicationSystem;
import catering.system.Enterprise.Enterprise;
import catering.system.validations.ValidateStrings;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class AddEnterpriseJPanel extends javax.swing.JPanel {
    private ApplicationSystem system;
    JPanel container;
    DefaultTableModel entTableModel;
    public Enterprise selectedEnterprise;
    /**
     * Creates new form AddEnterpriseJPanel
     */
    public AddEnterpriseJPanel() {
        initComponents();
    }

    AddEnterpriseJPanel(ApplicationSystem system, JPanel container) {
        initComponents();
        this.system=system;
        this.container=container;
        this.entTableModel= (DefaultTableModel) entTable.getModel();
        populate();
    }
    
    public void populate(){
        entTableModel.setRowCount(0);
        ArrayList<Enterprise> enterpiseList=this.system.getEnterpriseDirectory().getEnterpriseList();
        if(enterpiseList.size()>0){
            for (Enterprise ent:enterpiseList){
                
                Object row[]= new Object[2];
                row[0]=ent;
                row[1]=ent.getEnterpriseName();
                
                entTableModel.addRow(row);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No Enterprise Found");
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
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        addEntButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        entTable = new javax.swing.JTable();
        updateEntButton = new javax.swing.JButton();
        viewEntButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        viewEnttypeField = new javax.swing.JTextField();
        viewEntNameField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enterprise name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 20));

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Service Enterprise", "Food Production Enterprise", "Food Quality Enterprise", "Food WareHouse Enterprise" }));
        add(typeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 250, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel2.setText("Add Enterprise");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel3.setText("Enterprise type:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 20));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 240, -1));

        addEntButton.setText("Add Enterprise");
        addEntButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEntButtonActionPerformed(evt);
            }
        });
        add(addEntButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        entTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Type", "Enterprise Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(entTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, 160));

        updateEntButton.setText("Update Enterprise");
        updateEntButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEntButtonActionPerformed(evt);
            }
        });
        add(updateEntButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 160, -1));

        viewEntButton.setText("View Enterprise");
        viewEntButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEntButtonActionPerformed(evt);
            }
        });
        add(viewEntButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 150, -1));

        jLabel4.setText("Enterprise type:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, 20));

        jLabel5.setText("Enterprise name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, 20));

        viewEnttypeField.setEnabled(false);
        add(viewEnttypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 170, -1));
        add(viewEntNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addEntButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEntButtonActionPerformed
        // TODO add your handling code here:
        String type=(String) typeComboBox.getSelectedItem();
        String name= nameField.getText();
        Boolean isNotEmptyNull= ValidateStrings.checkNullEmpty(name);
        Boolean isValid = ValidateStrings.verifyString(name);
        if(isValid && isNotEmptyNull){
            system.getEnterpriseDirectory().createEnterprise(name,type);
            JOptionPane.showMessageDialog(null, "Enterprise created.");
            populate();
        }
    }//GEN-LAST:event_addEntButtonActionPerformed

    private void viewEntButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEntButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = entTable.getSelectedRow();
        
        if(selectedRow>=0){
            
            selectedEnterprise = (Enterprise) entTable.getValueAt(selectedRow, 0);
            viewEnttypeField.setText(selectedEnterprise.getEntType());
            viewEntNameField.setText(selectedEnterprise.getEnterpriseName());
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select row");
        }
    }//GEN-LAST:event_viewEntButtonActionPerformed

    private void updateEntButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEntButtonActionPerformed
        // TODO add your handling code here:
        if(!viewEntNameField.getText().isEmpty() && viewEntNameField != null){
            selectedEnterprise.setEnterpriseName(viewEntNameField.getText());
            JOptionPane.showMessageDialog(null,"Updated IEnterprise Name!"); 
            populate();
        }
        else{
            JOptionPane.showMessageDialog(null,"Any row selection is not done!");
        }
    }//GEN-LAST:event_updateEntButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEntButton;
    private javax.swing.JTable entTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JButton updateEntButton;
    private javax.swing.JButton viewEntButton;
    private javax.swing.JTextField viewEntNameField;
    private javax.swing.JTextField viewEnttypeField;
    // End of variables declaration//GEN-END:variables
}
