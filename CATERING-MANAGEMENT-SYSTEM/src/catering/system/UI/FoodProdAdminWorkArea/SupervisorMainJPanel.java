/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodProdAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodProdOrganization.Coordinator;
import catering.system.FoodProdOrganization.Menu;
import catering.system.OrderManagement.ClientOrder;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class SupervisorMainJPanel extends javax.swing.JPanel {
    DefaultTableModel orderTableModel;
    ApplicationSystem system;
    Coordinator coord;
    Coordinator selectedCoord;
    ClientOrder selectedOrder;
    /**
     * Creates new form SupervisorMainJPanel
     */
    public SupervisorMainJPanel() {
        initComponents();
    }

    public SupervisorMainJPanel(JPanel userProcessContainer, ApplicationSystem business) {
        initComponents();
        nameLable.setText("Welcome Supervisor ");
        this.orderTableModel= (DefaultTableModel) orderTable.getModel();
        this.system=business;
        this.coord= new Coordinator();
        this.selectedCoord= new Coordinator();
        this.selectedOrder=new ClientOrder();
        populateOrder();
        populateDropdown();
    }
    
    public void populateOrder()
    {
        orderTableModel.setRowCount(0);
        ArrayList<ClientOrder> applications=this.system.getEnterpriseDirectory().getClientOrderDirectory().getClientorderList();
        System.out.println(applications);
        String del="Delivered";
        if(applications.size()>0){
            for (ClientOrder app:applications){
                String status=app.getStatus();
                if(app.getCoord()==null){
                    coord.setName("none");
                }
                else{
                    coord=app.getCoord();
                }
                if(!status.equals(del)){
                    Object row[]= new Object[4];
                    row[0]=app;
                    row[1]=app.getPrice();
                    row[2]=app.getStatus();
                    row[3]=coord;

                    orderTableModel.addRow(row);
                }
            }
        }
        else{
            System.out.println("Empty Menu");
        }
    }
    
    public void populateDropdown(){
        ArrayList<Coordinator> applications=this.system.getEnterpriseDirectory().getCoordinatorList();
        if(applications.size()>0){
            for (Coordinator app:applications){
                assignComboBox.addItem(app);
       
            }
        }
        else{
            System.out.println("Empty Pet List");
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

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(nameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 340, 30));
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        assignComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        assignButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        orderIdField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Supervisor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 190));

        viewButton.setText("View Details");
        viewButton.setActionCommand("Assign Coordinator");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        add(assignComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 290, -1));

        jLabel2.setText("Order Id:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, 20));

        assignButton.setText("Assign");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });
        add(assignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 190, -1));

        jLabel3.setText("Assign Coordinator:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, 20));

        orderIdField.setEditable(false);
        add(orderIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 290, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();

        if(selectedRow>=0){

            selectedOrder= (ClientOrder) orderTable.getValueAt(selectedRow, 0);
            orderIdField.setText(selectedOrder.getOrderId());

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select row");
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:
        Coordinator c=(Coordinator)assignComboBox.getSelectedItem();
        selectedOrder.setCoord(c);
        selectedOrder.setStatus("In Kitchen");
        JOptionPane.showMessageDialog(null,"Coordinator added");
        
        populateOrder();
    }//GEN-LAST:event_assignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameLable;
    private javax.swing.JButton assignButton;
    private javax.swing.JComboBox assignComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField orderIdField;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
