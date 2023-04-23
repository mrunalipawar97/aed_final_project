/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.ServiceEntAdminWorkArea;

import business.ApplicationSystem;
import catering.system.OrderManagement.ClientOrder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author nishipancholi
 */
public class ViewOfficeOrderDetails extends javax.swing.JPanel {
    JPanel userProcessContainer;
    ApplicationSystem system;
    private static int kitchenCounter;
    private static int transitCounter;
    private static int placedCounter;
    private static int deliveredCounter;

    /**
     * Creates new form PlaceOrderJPanel
     */
    public ViewOfficeOrderDetails() {
        initComponents();
    }

    ViewOfficeOrderDetails(JPanel userProcessContainer, ApplicationSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.kitchenCounter=0;
        this.transitCounter=0;
        this.placedCounter=0;
        this.deliveredCounter=0;
        generateChart();
    }
    
    public void generateChart(){
        String office="Office";
        String inKitchen="In Kitchen";
        String inTransit="In Transit";
        String orderPlaced="Order placed";
        String delivered="Delivered";
        
        
        ArrayList<ClientOrder> coList=this.system.getEnterpriseDirectory().getClientOrderDirectory().getClientorderList();
        if(coList.size()>0){
        for(ClientOrder co:coList)
        {
            if(office.equals(co.getClient().getClientType())){
                System.out.println("This is a office"+co.getClient().getClientType());
                System.out.println(co.getStatus()+"co.getStatus()");
                
                if(inKitchen.equals(co.getStatus())){
                    this.kitchenCounter=this.kitchenCounter+1;
                    System.out.println(this.kitchenCounter+"kitchenCounter");
                }
                else if(inTransit.equals(co.getStatus())){
                    this.transitCounter=this.transitCounter+1;
                }
                else if(orderPlaced.equals(co.getStatus())){
                    this.placedCounter=this.placedCounter+1;
                }
                else if(delivered.equals(co.getStatus())){
                    this.deliveredCounter=this.deliveredCounter+1;
                }
                else{
                    System.out.println("Invalid count or no count present");
                }
            }
        }
        }
        else{
            System.out.println("No orders present");
        }
        System.out.println(this.kitchenCounter+"kitchenCounter");
        System.out.println(transitCounter+"transitCounter");
        System.out.println(placedCounter+"placedCounter");
        System.out.println(deliveredCounter+"deliveredCounter");
        DefaultCategoryDataset barChartData= new DefaultCategoryDataset();
        barChartData.setValue(kitchenCounter,"Order Status Count","In Kitchen");
        barChartData.setValue(transitCounter,"Order Status Count","In Transit");
        barChartData.setValue(placedCounter,"Order Status Count","Order Placed");
        barChartData.setValue(deliveredCounter,"Order Status Count","Delivered");
        
        JFreeChart barChart= ChartFactory.createBarChart("Total Orders Graph", "Order Status", "Order Status Count", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barChrt= barChart.getCategoryPlot();
        barChrt.setRangeGridlinePaint(Color.PINK);
        
        ChartPanel barPanel= new ChartPanel(barChart);
        barChartJPanel.removeAll();
        barChartJPanel.add(barPanel,BorderLayout.CENTER);
        barChartJPanel.validate();
        
        
        
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
        barChartJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setText("Office Order Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 350, -1));

        btnBack.setBackground(new java.awt.Color(255, 203, 162));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 131, 40));

        barChartJPanel.setLayout(new java.awt.BorderLayout());
        add(barChartJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 650, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManageOfficeJPanel dm= new ManageOfficeJPanel(userProcessContainer, system);
        userProcessContainer.add("manageOfficesJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barChartJPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
