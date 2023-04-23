/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.ServiceEntAdminWorkArea;

import business.ApplicationSystem;
import catering.system.Organization.ServiceEnterpriseOrganization.Client;
import catering.system.Users.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class OfficeClientsJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    ApplicationSystem system;
    DefaultTableModel viewTableModel;

    /**
     * Creates new form ManageOfficeClientsJPanel
     */
    public OfficeClientsJPanel() {
        initComponents();
    }

    OfficeClientsJPanel(JPanel userProcessContainer, ApplicationSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.viewTableModel= (DefaultTableModel) clientTable.getModel();
        populate();
    }
    
    public void populate()
    {
        viewTableModel.setRowCount(0);
        ArrayList<Client> applications=this.system.getClientDirectory().getClientList();
        System.out.println(applications);
        String type="Office";
        if(applications.size()>0){
            for (Client c:applications){
                String clientType=c.getClientType();
                if(clientType.equals(type)){
                    Object row[]= new Object[4];
                    row[0]=c;
                    row[1]=c.getLocation();
                    row[2]=c.getAccountDetails();
                    row[3]=c.getClientType();


                    viewTableModel.addRow(row);
                
                }
            }
        }
        else{
            System.out.println("Empty Menu");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        deleteClientButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setText("Manage Office Clients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 203, 162));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 131, 40));

        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Client Name", "Address", "Username", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clientTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, 270));

        deleteClientButton.setBackground(new java.awt.Color(255, 203, 162));
        deleteClientButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteClientButton.setText("Delete Office Client");
        deleteClientButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientButtonActionPerformed(evt);
            }
        });
        add(deleteClientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManageOfficeJPanel dm= new ManageOfficeJPanel(userProcessContainer, system);
        userProcessContainer.add("manageOfficesJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void deleteClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = clientTable.getSelectedRow();
        if(selectedRow>=0){
            Client c= (Client) clientTable.getValueAt(selectedRow,0);
            ArrayList<UserAccount> uaList=this.system.getUserAccountDirectory().getUserAccountList();
            for(UserAccount ua:uaList){
                if(ua==c.getAccountDetails()){
                    this.system.getUserAccountDirectory().deleteUser(c.getName());
                }
            }
            this.system.getClientDirectory().deleteClient(c.getName());
            JOptionPane.showMessageDialog(null,"Client Deleted!");
            populate();
        }
        else{
            JOptionPane.showMessageDialog(null,"Any row selection is not done!");
        }
    }//GEN-LAST:event_deleteClientButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTable clientTable;
    private javax.swing.JButton deleteClientButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
