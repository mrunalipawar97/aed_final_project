/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.FoodQualityAdminWorkArea;

import business.ApplicationSystem;
import catering.system.FoodProdOrganization.Menu;
import catering.system.Users.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class AuditingReportingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuditingReportingJPanel
     */
    
    DefaultTableModel viewTableModel;
    DefaultTableModel healthScoreTableModel;
    ApplicationSystem system;
    UserAccount ua;
    Menu selectedMenu;
    JPanel userProcessContainer;
    int healthScore = 0;

    public AuditingReportingJPanel() {
        initComponents();
    }

    AuditingReportingJPanel(JPanel contauserProcessContaineriner,ApplicationSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.viewTableModel= (DefaultTableModel) menuTable.getModel();
        this.healthScoreTableModel = (DefaultTableModel)healthScorejTable.getModel();
        this.ua= new UserAccount();
        this.selectedMenu=new Menu();
        populate();
        giveHealthScore();
    }
    
    public void giveHealthScore() {
        healthScoreTableModel.setRowCount(0);
        ArrayList<Menu> applications = this.system.getEnterpriseDirectory().getMenuList();
        System.out.println(applications);
        if(applications.size()>0){
            for (Menu app:applications){
                Object row[]= new Object[5];
                row[0]=app;
                row[1]=app.getLunch();
                row[2]=app.getDinner();
                row[3]=app.getStatus();
                row[4]=app.getHealthScore();  
                healthScoreTableModel.addRow(row);
            }
        }
        else{
            System.out.println("Empty Menu");
        }
    }

    
    public void populate() {
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

        title = new javax.swing.JLabel();
        healthScoreLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        healthScorejTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        FeedbackComboBox = new javax.swing.JComboBox();
        LunchTextField = new javax.swing.JTextField();
        dinnerTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showMenujButton = new javax.swing.JButton();
        breakfastTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Food Menu Rating");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 340, 60));

        healthScoreLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        healthScoreLabel.setText("Rate the Healthiness of Food Items");
        add(healthScoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 320, 30));

        healthScorejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Breakfast", "Lunch", "Dinner", "Health Status", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(healthScorejTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 600, 190));

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
        jScrollPane3.setViewportView(menuTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 510, 190));

        FeedbackComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        add(FeedbackComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, 220, 30));

        LunchTextField.setEnabled(false);
        add(LunchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 220, 30));

        dinnerTextField.setEnabled(false);
        add(dinnerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, 220, 30));

        jButton1.setBackground(new java.awt.Color(255, 203, 162));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setText("Health Score");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 320, 130, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Lunch");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, 50, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Dinner");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 50, 20));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Breakfast");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, 30));

        showMenujButton.setBackground(new java.awt.Color(255, 203, 162));
        showMenujButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        showMenujButton.setText("Show");
        showMenujButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showMenujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMenujButtonActionPerformed(evt);
            }
        });
        add(showMenujButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 100, 30));

        breakfastTextField.setEnabled(false);
        add(breakfastTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, 220, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Rating");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, 50, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void showMenujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMenujButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = menuTable.getSelectedRow();
        //ArrayList<Menu> applications=this.system.getEnterpriseDirectory().getMenuList();
        if(selectedRow >= 0){
            Menu menu = (Menu) menuTable.getValueAt(selectedRow, 1);
            this.selectedMenu = menu;
            breakfastTextField.setText(menu.getBreakfast());
            LunchTextField.setText(menu.getLunch());
            dinnerTextField.setText(menu.getDinner());
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select Row");
        }
    }//GEN-LAST:event_showMenujButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String q = (String) FeedbackComboBox.getSelectedItem();
        int quality=Integer.valueOf(q);
        if(quality <=10 && quality >=7){
            selectedMenu.setHealthScore(quality);
            selectedMenu.setStatus("Healthy");
        }else if(quality < 5 && quality >= 1){
            selectedMenu.setHealthScore(quality);
            selectedMenu.setStatus("Unhealthy");
        }else {
            selectedMenu.setHealthScore(quality);
            selectedMenu.setStatus("Moderately Healthy");
        }
        JOptionPane.showMessageDialog(null,"Health Score added");
        giveHealthScore();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox FeedbackComboBox;
    private javax.swing.JTextField LunchTextField;
    private javax.swing.JTextField breakfastTextField;
    private javax.swing.JTextField dinnerTextField;
    private javax.swing.JLabel healthScoreLabel;
    private javax.swing.JTable healthScorejTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton showMenujButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
