/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.adminWorkArea;

import business.ApplicationSystem;
import catering.system.useraccount.UserAccount;

/**
 *
 * @author nishipancholi
 */
public class SupervisorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupervisorJPanel
     */
    private ApplicationSystem system;
    private UserAccount useraccount;
    
    public SupervisorJPanel() {
        initComponents();
    }
    
    public SupervisorJPanel(ApplicationSystem system, UserAccount useraccount){
        initComponents();
        this.setVisible(true);
        this.system = system;
        this.useraccount = useraccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setText("<< BACK");
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    // End of variables declaration//GEN-END:variables
}