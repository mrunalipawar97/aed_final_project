/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.AdminWorkArea;

import business.ApplicationSystem;
import business.BranchLocation;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class BranchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BranchJPanel
     */
    private ApplicationSystem system;
    JPanel container;
    DefaultTableModel branchTableModel;

    public BranchJPanel(JPanel userProcessContainer, ApplicationSystem system) {
        initComponents();
        this.system = system;
        this.container = userProcessContainer;
        this.branchTableModel = new DefaultTableModel();

        branchJTable.setModel(branchTableModel);
        branchTableModel.addColumn("BRANCH NAME");
        //this.branchTableModel = (DefaultTableModel) branchJTable.getModel();
        populateBranchDetails();

    }

    public void populateBranchDetails() {
        branchTableModel.setRowCount(0);
        ArrayList<String> branchlists = this.system.getBranchLocation().getBranchLocation();
        String defaultValue = "New York";
        Object[] rowData = {defaultValue};
         branchTableModel.addRow(rowData);
        if (!branchlists.isEmpty()) {
            for (int i = 0; i < system.getBranchLocation().getBranchLocation().size(); i++) {
                branchTableModel.addRow(new Object[]{
                    system.getBranchLocation().getBranchLocation().get(i)
                });
            }
        } else {
           JOptionPane.showMessageDialog(null, "No data found");
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
        branchNameJLabel = new javax.swing.JLabel();
        branchNameTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        branchJTable = new javax.swing.JTable();
        AddBranchButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Katari", 1, 24)); // NOI18N
        jLabel1.setText("ADD BRANCH ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 250, 50));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("List of Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 120, -1));

        branchNameJLabel.setBackground(new java.awt.Color(0, 0, 0));
        branchNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        branchNameJLabel.setText("Branch Name");
        add(branchNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 80, 30));
        add(branchNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 150, 30));

        branchJTable.setBackground(new java.awt.Color(254, 254, 226));
        branchJTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        branchJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        branchJTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(branchJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 470, 180));

        AddBranchButton.setBackground(new java.awt.Color(127, 195, 126));
        AddBranchButton.setText("Add Branch");
        AddBranchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBranchButtonActionPerformed(evt);
            }
        });
        add(AddBranchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void AddBranchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBranchButtonActionPerformed
        boolean valid = true;
        if (branchNameTextField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field cannot be empty. Add a network.", "Error message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (int i = 0; i < system.getBranchLocation().getBranchLocation().size(); i++) {
            if (system.getBranchLocation().getBranchLocation().get(i).toLowerCase().equals(branchNameTextField.getText().trim().toLowerCase())) {
                JOptionPane.showMessageDialog(null, "Branch Already Present", "Error message", JOptionPane.ERROR_MESSAGE);
                valid = false;
            }
        }
        if (valid) {
            system.getBranchLocation().createBranchLocation(branchNameTextField.getText().trim());
            System.out.println("Added Branch");
            populateBranchDetails();
        }
    }//GEN-LAST:event_AddBranchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBranchButton;
    private javax.swing.JTable branchJTable;
    private javax.swing.JLabel branchNameJLabel;
    private javax.swing.JTextField branchNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
