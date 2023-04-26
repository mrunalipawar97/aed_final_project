/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.Login;

import business.ApplicationSystem;
import catering.system.Organization.ServiceEnterpriseOrganization.Client;
import catering.system.Organization.ServiceEnterpriseOrganization.EmailReceipt;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author jeelkanzaria
 */
public class ForgotPasswordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ForgotPasswordJPanel
     */
    
    JPanel container;
    ApplicationSystem system;
    JButton logoutJButton;
    ArrayList<Client> clientList;
    public ForgotPasswordJPanel() {
        initComponents();
    }

    ForgotPasswordJPanel(JPanel container, ApplicationSystem system, JButton logoutJButton) {
       initComponents();
        this.container = container;
        this.system = system;
        this.logoutJButton = logoutJButton;
        //sendEmailInit();
        clientList = this.system.getClientDirectory().getClientList();
       /*if(clientList.size()>0){
           
        for (int i = 0; i < this.system.getClientDirectory().getClientList().size(); i++) {
            clientList.add(this.system.getClientDirectory().getClientList().get(i));
            
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "No Client is Present with this");
        }*/
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        restPwdLabel2 = new javax.swing.JLabel();
        emailIdTextField = new javax.swing.JTextField();
        AddBtn1 = new javax.swing.JButton();
        sendEmail = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        restPwdLabel2.setBackground(new java.awt.Color(254, 254, 226));
        restPwdLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        restPwdLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel2.setText("Enter Your Email ID");
        add(restPwdLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 154, -1));

        emailIdTextField.setForeground(new java.awt.Color(72, 72, 72));
        emailIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIdTextFieldActionPerformed(evt);
            }
        });
        add(emailIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 240, 30));

        AddBtn1.setBackground(new java.awt.Color(255, 203, 162));
        AddBtn1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        AddBtn1.setText("Back");
        AddBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn1ActionPerformed(evt);
            }
        });
        add(AddBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 117, 49));

        sendEmail.setBackground(new java.awt.Color(255, 203, 162));
        sendEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        sendEmail.setText("Send Email");
        sendEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailActionPerformed(evt);
            }
        });
        add(sendEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 144, 46));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel2.setText("Enter Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 250, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 560, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void emailIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIdTextFieldActionPerformed

    private void AddBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        LoginPageJPanel su = new LoginPageJPanel(container, system, logoutJButton);
        container.add("workArea", su);
        layout.next(container);
    }//GEN-LAST:event_AddBtn1ActionPerformed

    private void sendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailActionPerformed
        int Index = -1;
        String to = emailIdTextField.getText();
        String password = "";
        String subject = "Forgot your password";
        String message = "Did you forget your password? Your Passwrod is";
        ArrayList<Client> clientList = this.system.getClientDirectory().getClientList();
        
        for (int i = 0; i < clientList.size(); i++){
              if(clientList.get(i).getEmail().equals(to)){
                  System.out.println("Hey " + clientList.get(i).getName() + "\n" +"Did you forget your password?" + "\n" +"Your Password is: " + clientList.get(i).getAccountDetails().getPassword() +"\n" + "If you dont want to change your password or didn't request this, please ignore and delete this message");
                  EmailReceipt sendMail = new EmailReceipt(clientList.get(i).getEmail(), "Your Password for Client account","Hey " + clientList.get(i).getName() + "\n" +" Did you forget your password? Your Passwrod is: " + 
                         clientList.get(i).getAccountDetails().getPassword() 
                  + "If you don't want to change your password or didn't request this, please ignore and delete this message");
                    Index = i;
                  break;
              }
          }
        if (Index >= 0) {

            CardLayout layout = (CardLayout) container.getLayout();
            LoginPageJPanel su = new LoginPageJPanel(container, system, logoutJButton);
            container.add("workArea", su);
            layout.next(container);
        } else {
            JOptionPane.showMessageDialog(this, "Email Id not found, Try Signing up", "Error message", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_sendEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn1;
    private javax.swing.JTextField emailIdTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel restPwdLabel2;
    private javax.swing.JButton sendEmail;
    // End of variables declaration//GEN-END:variables
}
