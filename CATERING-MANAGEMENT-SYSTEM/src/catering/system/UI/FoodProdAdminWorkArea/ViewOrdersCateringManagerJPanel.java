/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodProdAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodProdOrganization.Coordinator;
import catering.system.OrderManagement.ClientOrder;
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
public class ViewOrdersCateringManagerJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    ApplicationSystem system;
    DefaultTableModel orderTableModel;
    Coordinator coord;
    UserAccount ua;

    /**
     * Creates new form ViewOrdersCateringManagerJPanel
     */
    public ViewOrdersCateringManagerJPanel() {
        initComponents();
    }

    ViewOrdersCateringManagerJPanel(JPanel userProcessContainer, UserAccount ua,ApplicationSystem system) {
        initComponents();
        this.orderTableModel= (DefaultTableModel) orderTable.getModel();
        this.system=system;
        this.ua = ua;
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
        String del="Delivered";

        if(applications.size()>0){
            for (ClientOrder app:applications){
                if(app.getCoord()==null){
                    coord.setName("none");
                }
                else{
                    coord=app.getCoord();
                }
                String status=app.getStatus();
                System.out.println(status);
                
                if(!status.equals(op)){
                    if(!status.equals(del)){
                        System.out.println(status+"in if");
                        Object row[]= new Object[4];
                        row[0]=app;
                        row[1]=app.getPrice();
                        row[2]=app.getStatus();
                        row[3]=coord;

                        orderTableModel.addRow(row);
                    }
                }
                else{
                    System.out.println(status+"else");
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        assignButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 131, -1));

        jLabel1.setText("View Orders");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

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

        assignButton.setText("Move to In Transit");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });
        add(assignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CateringManagerMainJPanel dm= new CateringManagerMainJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("manageHospitalsJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();

        if(selectedRow>=0){

            ClientOrder co= (ClientOrder) orderTable.getValueAt(selectedRow, 0);
            co.setStatus("In Transit");
            populateOrder();

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select row");
        }
        
    }//GEN-LAST:event_assignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
