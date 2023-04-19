/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.adminWorkArea;

import business.ApplicationSystem;
import catering.system.Users.UserAccount;

/**
 *
 * @author jeelkanzaria
 */
public class CateringManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CateringManagerJPanel
     */
    private ApplicationSystem system;
    private UserAccount useraccount;
    
    public CateringManagerJPanel() {
        initComponents();
    }

    CateringManagerJPanel(ApplicationSystem system, UserAccount useraccount) {
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

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
