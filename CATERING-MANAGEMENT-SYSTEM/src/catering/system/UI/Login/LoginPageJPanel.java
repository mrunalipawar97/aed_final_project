/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.Login;

import business.ApplicationSystem;
import catering.system.Users.UserAccount;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jeelkanzaria
 */
public class LoginPageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPageJPanel
     */
    private ApplicationSystem system;
    private UserAccount userAccount;
    JPanel container;
    JButton logoutJButton;
    
    public LoginPageJPanel() {
        initComponents();
    }

    public LoginPageJPanel(JPanel container, ApplicationSystem system, JButton logoutJButton) {
        initComponents();
        this.container = container;
        this.logoutJButton = logoutJButton;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginBtn1 = new javax.swing.JButton();
        forgotPasswordButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 180, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gdm_login_photo.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 150, 110));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("USERNAME:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 100, 30));
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 140, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("PASSWORD:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 90, 30));
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 140, 30));

        loginBtn1.setBackground(new java.awt.Color(255, 203, 162));
        loginBtn1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        loginBtn1.setText("LOGIN");
        loginBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn1ActionPerformed(evt);
            }
        });
        add(loginBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 170, 40));

        forgotPasswordButton.setBackground(new java.awt.Color(255, 203, 162));
        forgotPasswordButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        forgotPasswordButton.setText("FORGOT PASSWORD ?");
        forgotPasswordButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        forgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordButtonActionPerformed(evt);
            }
        });
        add(forgotPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 170, 40));

        signUpButton.setBackground(new java.awt.Color(255, 203, 162));
        signUpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        signUpButton.setText("Register Yourself As Client");
        signUpButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 220, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Meal_meate_1.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 27, 1030, 630));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("New User?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 120, 80, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 380, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void forgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)container.getLayout();
        ForgotPasswordJPanel fp = new ForgotPasswordJPanel(container, system, logoutJButton);
        container.add("workArea",fp);
        layout.next(container);
        
    }//GEN-LAST:event_forgotPasswordButtonActionPerformed

    private void loginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn1ActionPerformed
        // TODO add your handling code here:
        String userName = usernameField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, system));
            layout.next(container);
            logoutJButton.setEnabled(true);
        }

        loginBtn1.setEnabled(false);
        //        logoutJButton.setEnabled(true);
        usernameField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginBtn1ActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)container.getLayout();
        SignUpJPanel su = new SignUpJPanel(container, system, logoutJButton);
        container.add("workArea",su);
        layout.next(container);
    }//GEN-LAST:event_signUpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotPasswordButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
