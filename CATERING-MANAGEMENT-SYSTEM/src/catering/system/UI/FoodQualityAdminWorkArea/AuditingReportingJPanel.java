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
        ArrayList<Menu> applications=this.system.getEnterpriseDirectory().getMenuList();
        System.out.println(applications);
        if(applications.size()>0){
            for (Menu app:applications){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(app.getDate());
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

        btnBack = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        healthScoreLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        healthScorejTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        FeedbackComboBox = new javax.swing.JComboBox<>();
        LunchTextField = new javax.swing.JTextField();
        dinnerTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showMenujButton = new javax.swing.JButton();
        breakfastTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 180, 153));
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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 131, 40));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Food Menu Rating");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 340, 60));

        healthScoreLabel.setText("Rate the Healthiness of Food Items");
        add(healthScoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 230, 30));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 600, 190));

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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 500, 190));

        FeedbackComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Healthy", "Unhealthy", "ModeratelyHealthy" }));
        add(FeedbackComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 220, 30));

        LunchTextField.setEnabled(false);
        add(LunchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 220, 30));

        dinnerTextField.setEnabled(false);
        add(dinnerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 220, 30));

        jButton1.setText("Health Score");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 130, 40));

        jLabel1.setText("Lunch");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, 20));

        jLabel2.setText("Dinner");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        jLabel3.setText("Breakfast");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, 20));

        showMenujButton.setText("Show");
        showMenujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMenujButtonActionPerformed(evt);
            }
        });
        add(showMenujButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 100, 30));

        breakfastTextField.setEnabled(false);
        add(breakfastTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FoodQualityAdminMainJPanel dm = new FoodQualityAdminMainJPanel(userProcessContainer, system);
        userProcessContainer.add("foodQualityAdminJPanel", dm);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

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
        String quality = (String) FeedbackComboBox.getSelectedItem();
        if(quality.equalsIgnoreCase("Healthy")){
            selectedMenu.setHealthScore(10);
            selectedMenu.setStatus("Healthy");
        }else if(quality.equalsIgnoreCase("Unhealthy")){
            selectedMenu.setHealthScore(3);
            selectedMenu.setStatus("Unhealthy");
        }else {
            selectedMenu.setHealthScore(5);
            selectedMenu.setStatus("Moderately Healthy");
        }
        JOptionPane.showMessageDialog(null,"Health Score added");
        giveHealthScore();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FeedbackComboBox;
    private javax.swing.JTextField LunchTextField;
    private javax.swing.JTextField breakfastTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField dinnerTextField;
    private javax.swing.JLabel healthScoreLabel;
    private javax.swing.JTable healthScorejTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton showMenujButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
