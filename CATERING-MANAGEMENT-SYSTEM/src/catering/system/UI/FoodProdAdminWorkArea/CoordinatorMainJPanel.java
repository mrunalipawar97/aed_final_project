/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodProdAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodProdOrganization.Coordinator;
import catering.system.OrderManagement.ClientOrder;
import catering.system.Users.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class CoordinatorMainJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    ApplicationSystem system;
    UserAccount account;
    DefaultTableModel orderTableModel;
    Coordinator coord;

    /**
     * Creates new form CoordinatorMainJPanel
     */
    public CoordinatorMainJPanel() {
        initComponents();
    }

    public CoordinatorMainJPanel(JPanel userProcessContainer, UserAccount account, ApplicationSystem business) {
        initComponents();
        nameLable.setText("Welcome Coordinator Manager ");
        this.orderTableModel= (DefaultTableModel) orderTable.getModel();
        this.system=business;
        this.account=account;
        this.coord=new Coordinator();
        this.userProcessContainer=userProcessContainer;
        populateOrder();
    }
    
    public void populateOrder()
    {
        orderTableModel.setRowCount(0);
        ArrayList<ClientOrder> applications=this.system.getEnterpriseDirectory().getClientOrderDirectory().getClientorderList();
        System.out.println(applications);
        String op="Order placed";
        String ik="In Kitchen";

        if(applications.size()>0){
            for (ClientOrder app:applications){
                if(app.getCoord()==null){
                    coord.setName("none");
                }
                else{
                    coord=app.getCoord();
                }
                String status=app.getStatus();
                if(account==app.getCoord().getAccountDetails()){
                    if(!status.equals(op)){
                        if(!status.equals(ik)){
                            Object row[]= new Object[4];
                            row[0]=app;
                            row[1]=app.getPrice();
                            row[2]=app.getStatus();
                            row[3]=coord;

                            orderTableModel.addRow(row);
                        
                        }
                    }
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

        nameLable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        assignButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLable.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        add(nameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 490, 30));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Paid Money", "Order Status", "Coordinator"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 460, 200));

        assignButton.setBackground(new java.awt.Color(255, 203, 162));
        assignButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        assignButton.setText("Move to Delivered");
        assignButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });
        add(assignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 230, 50));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setText("View Delivery and Transit Orders");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 710, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();

        if(selectedRow>=0){

            ClientOrder co= (ClientOrder) orderTable.getValueAt(selectedRow, 0);
            co.setStatus("Delivered");
            populateOrder();

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select row");
        }

    }//GEN-LAST:event_assignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLable;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
