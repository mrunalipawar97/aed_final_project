/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package catering.system.UI.FoodProdAdminWorkArea;

import business.ApplicationSystem;
import catering.system.OrderManagement.InventoryOrderDirectory;
import catering.system.Organization.ServiceEnterpriseOrganization.Client;
import catering.system.Users.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class FoodInventoryOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    ApplicationSystem system;
    DefaultTableModel model1;
    private UserAccount userAccount;
    private InventoryOrderDirectory orderDirectory;
    DefaultTableModel model;
    Client client;
    JSplitPane screen;

    /** Creates new form FoodInventoryOrderJPanel */
    public FoodInventoryOrderJPanel() {
        initComponents();
    }
    
    public FoodInventoryOrderJPanel(JPanel userProcessContainer, UserAccount account,ApplicationSystem system, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.screen = screen;
        this.system = system;
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        restListTable.setModel(model);
        orderDirectory = new InventoryOrderDirectory();
        cartTable.setModel(model1);
        client = findClient();
        model.addColumn("Inventory Store Name");
        model.addColumn("Location");
        model.addColumn("Phone");
        model1.addColumn("Id");
        model1.addColumn("Status");
        model1.addColumn("Inventory store Name");
        
        populateRequestTable();
        populateCustomerOrders();

    }

    public Client findClient() {
        for (int i = 0; i < this.system.getClientDirectory().getClientList().size(); i++) {
            if (this.system.getClientDirectory().getClientList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return this.system.getClientDirectory().getClientList().get(i);
            }
        }
        return null;
    }
 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        restListTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        showMenuButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        addCourseHeaderLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        restListTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        restListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        restListTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(restListTable);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("Inventory Store List");
        enterpriseLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        showMenuButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        showMenuButton.setText("Show Menu");
        showMenuButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        showMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(showMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(showMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(254, 254, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Orders");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cartTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cartTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.setGridColor(new java.awt.Color(0, 0, 0));
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, 305));

        addCourseHeaderLabel.setFont(new java.awt.Font("Kannada MN", 1, 20)); // NOI18N
        addCourseHeaderLabel.setText("FOOD PRODUCTION PORTAL");
        add(addCourseHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 400, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void showMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMenuButtonActionPerformed
        System.out.println(restListTable.getSelectedRow() + " row ");
        if (restListTable.getSelectedRow() >= 0) {
         //   CustomerSelectGrocery mm = new CustomerSelectGrocery(userProcessContainer, this.userAccount, ecosystem, ecosystem.getGroceryDirectory().getGroceryList().get(restListTable.getSelectedRow()), screen);
            //            userProcessContainer.add("manageNetworkJPanel", mm);
            //            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //            layout.next(userProcessContainer);
          //  screen.setRightComponent(mm);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Store");
        }

    }//GEN-LAST:event_showMenuButtonActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cartTableMouseClicked

    public void populateCustomerOrders() {
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        /*for (int i = 0; i < client.get.size(); i++) {
//                    System.out.println(cust.getOrderDirectoryList().get(i).getD);
            model1.addRow(new Object[]{
                i+1,
                cust.getOrderDirectoryList().get(i).getStatus(),
                cust.getOrderDirectoryList().get(i).getGrocery().getName()
            });
        }*/

    }

    public void populateRequestTable() {
        for (int i = 0; i < system.getInventoryDirectory().getStoreList().size(); i++) {
            model.addRow(new Object[]{
                system.getInventoryDirectory().getStoreList().get(i).getName(),
                system.getInventoryDirectory().getStoreList().get(i).getLocation(),
                system.getInventoryDirectory().getStoreList().get(i).getPhone(),});
        }
    }
    
    public void populateCustomerCart() {
        Client cust = findClient();
        //System.out.println(cust.getName() + " name " + cust.g.size() + " size ");
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        /*if (cust.getOrderList().size() > 0) {
            for (int i = 0; i < cust.getOrderList().size(); i++) {
                model1.addRow(new Object[]{
                    cust.getOrderList().get(i).getItem(),
                    cust.getOrderList().get(i).getPrice(),
                    cust.getOrderList().get(i).getQuantity(),});
            }
        }*/
    }
  public void setCustomerStatus(String status) {
        Client cust = findClient();
           /* for (int i = 0; i < cust.getOrderDirectoryList().size(); i++) {
                if (cust.getOrderDirectoryList().get(i).getId() == (orderDirectory.getId())) {
                    cust.getOrderDirectoryList().get(i).setFeedbackComment(status);
                }
            }*/
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCourseHeaderLabel;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable restListTable;
    private javax.swing.JButton showMenuButton;
    // End of variables declaration//GEN-END:variables

}