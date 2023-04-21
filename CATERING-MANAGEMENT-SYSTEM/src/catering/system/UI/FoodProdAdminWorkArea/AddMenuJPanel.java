/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodProdAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodProdOrganization.Menu;
import catering.system.validations.ValidateNumbers;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class AddMenuJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    ApplicationSystem system;
    DefaultTableModel viewTableModel;

    /**
     * Creates new form AddMenuJPanel
     */
    public AddMenuJPanel() {
        initComponents();
    }

    AddMenuJPanel(JPanel userProcessContainer, ApplicationSystem system) {
        initComponents();
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        this.viewTableModel= (DefaultTableModel) menuTable.getModel();
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        breakfastField = new javax.swing.JTextField();
        lunchField = new javax.swing.JTextField();
        dinnerField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        batchField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addMenuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        priceField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

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

        jLabel1.setText("Add Menu");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, -1));
        add(breakfastField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 220, -1));
        add(lunchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 220, -1));
        add(dinnerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 220, -1));

        jLabel2.setText("Choose Date:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel3.setText("Price Per Batch:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        add(batchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 220, -1));

        jLabel4.setText("Breakfast:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel5.setText("Lunch:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel6.setText("Dinner:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        addMenuButton.setText("Add Menu");
        addMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuButtonActionPerformed(evt);
            }
        });
        add(addMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Breakfast", "Lunch", "Dinner", "Batch", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 500, 310));
        add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 210, 20));

        jLabel7.setText("Batch:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void populate()
    {
        viewTableModel.setRowCount(0);
        ArrayList<Menu> applications=this.system.getEnterpriseDirectory().getMenuList();
        System.out.println(applications);
        if(applications.size()>0){
            for (Menu app:applications){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(app.getDate());
                Object row[]= new Object[6];
                row[0]=date;
                row[1]=app;
                row[2]=app.getLunch();
                row[3]=app.getDinner();
                row[4]=app.getBatch();
                row[5]=app.getPrice();
                
                viewTableModel.addRow(row);
            }
        }
        else{
            System.out.println("Empty List");
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CateringManagerMainJPanel dm= new CateringManagerMainJPanel(userProcessContainer, system);
        userProcessContainer.add("manageHospitalsJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void addMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuButtonActionPerformed
        // TODO add your handling code here:
        Boolean isPriceValid = ValidateNumbers.verifyNumbers(priceField);
        Boolean isBatchValid = ValidateNumbers.verifyNumbers(batchField);
        if (!isPriceValid || !isBatchValid) {
            return;
        }
        Date menuDate= jDateChooser1.getDate();
      
        Menu employee = system.getEnterpriseDirectory().createMenu(menuDate, breakfastField.getText(), lunchField.getText(), dinnerField.getText(), Integer.valueOf(batchField.getText()), Float.valueOf(priceField.getText()));

        JOptionPane.showMessageDialog(null, "Menu added successfully");
        populate();
        breakfastField.setText("");
        lunchField.setText("");
        dinnerField.setText("");
        batchField.setText("");
        priceField.setText("");
        
    }//GEN-LAST:event_addMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMenuButton;
    private javax.swing.JTextField batchField;
    private javax.swing.JTextField breakfastField;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField dinnerField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lunchField;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
}