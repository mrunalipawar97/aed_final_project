/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catering.system.UI.Login;

import business.ApplicationSystem;
import catering.system.Organization.ServiceEnterpriseOrganization.Client;
import catering.system.Organization.ServiceEnterpriseOrganization.EmailReceipt;
import catering.system.Role.ClientRole;
import catering.system.Users.Employee;
import catering.system.Users.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jeelkanzaria
 */
public class SignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    JPanel container;
    ApplicationSystem system;
    private ArrayList<Client> clientList ;
    JButton logoutJButton;
    
    public SignUpJPanel() {
        initComponents();
    }

    SignUpJPanel(JPanel container, ApplicationSystem system, JButton logoutJButton) {
        initComponents();
        this.container = container;
        this.system = system;
        this.logoutJButton = logoutJButton;
        this.clientList = new ArrayList<Client>();
        for (int i = 0; i < system.getClientDirectory().getClientList().size(); i++) {
            clientList.add(system.getClientDirectory().getClientList().get(i));
        }
        
     for (int i = 0; i < system.getBranchLocation().getBranchLocation().size(); i++) {
             System.out.println(system.getBranchLocation().getBranchLocation().get(i));
            jComboBox1.addItem(system.getBranchLocation().getBranchLocation().get(i));
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

        backButton = new javax.swing.JButton();
        updateRestManagerLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        restPwdLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        restPwdText = new javax.swing.JPasswordField();
        phoneLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        AddressText = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JTextField();
        Email1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(204, 204, 204));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 51));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        updateRestManagerLabel.setBackground(new java.awt.Color(46, 31, 39));
        updateRestManagerLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateRestManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel.setText("Name");
        add(updateRestManagerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 40, -1));

        nameText.setForeground(new java.awt.Color(72, 72, 72));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 170, -1));

        restPwdLabel1.setBackground(new java.awt.Color(46, 31, 39));
        restPwdLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel1.setText("Username");
        add(restPwdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 100, 20));

        usernameText.setForeground(new java.awt.Color(72, 72, 72));
        add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 170, -1));

        jLabel6.setBackground(new java.awt.Color(46, 31, 39));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 100, -1));

        restPwdText.setForeground(new java.awt.Color(72, 72, 72));
        add(restPwdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 170, -1));

        phoneLabel.setBackground(new java.awt.Color(46, 31, 39));
        phoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");
        add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 90, -1));

        phoneText.setForeground(new java.awt.Color(72, 72, 72));
        add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 170, -1));

        addressLabel.setBackground(new java.awt.Color(46, 31, 39));
        addressLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel.setText("Address");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        AddressText.setForeground(new java.awt.Color(72, 72, 72));
        add(AddressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 170, -1));

        Email.setBackground(new java.awt.Color(46, 31, 39));
        Email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Email.setText("Email");
        add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        EmailTxt.setForeground(new java.awt.Color(72, 72, 72));
        add(EmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 170, -1));

        Email1.setBackground(new java.awt.Color(46, 31, 39));
        Email1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Email1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Email1.setText("Location");
        add(Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 170, -1));

        AddBtn.setBackground(new java.awt.Color(204, 204, 204));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(51, 51, 51));
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)container.getLayout();
        LoginPageJPanel su = new LoginPageJPanel(container, system, logoutJButton);
        container.add("workArea",su);
        layout.next(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    public Boolean validateFields(String username, String address, String phone, String name, char[] pwd, String email) {
        String passregex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(passregex);
        Matcher matcher = pattern.matcher(String.valueOf(pwd));
        
        if(username.isEmpty() || phone.isEmpty() || name.isEmpty() || address.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (pwd.length < 8) {
            JOptionPane.showMessageDialog(null,"Password cannot be less than 8","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if(phone.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!phone.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!email.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")){
             JOptionPane.showMessageDialog(null, "Email is invalid","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!matcher.matches()){
            JOptionPane.showMessageDialog(null, "Enter valid password with atleast on number, one lowercase letter, one uppercase letter,one special char and atleast 8 digits");
            return false;
        }
        return true;
    }
    
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        Boolean isValid = validateFields(usernameText.getText(), AddressText.getText(), phoneText.getText(), nameText.getText(), restPwdText.getPassword(), EmailTxt.getText());
        if (!isValid) {
            return;
        }
        for (int i = 0; i < clientList.size(); i++) {
            if(/*"customerAdmin".equals(customerList.get(i).getAccountDetails().getRoleName()) &&*/ clientList.get(i).getAccountDetails().getUsername().equals(usernameText.getText())&& system.getUserAccountDirectory().getUserAccountList().get(i).getUsername().equals(usernameText.getText())){
                JOptionPane.showMessageDialog(null,"Username Already Present", "Error message" ,JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        char[] ch = restPwdText.getPassword();
        String pwd = new String(ch);
        String name = (String) jComboBox1.getSelectedItem();
        Employee employee = system.getEmployeeDirectory().createEmployee(nameText.getText());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new ClientRole(), "customerAdmin");
        Client cust = system.getClientDirectory().createClient(nameText.getText(), ua, phoneText.getText(), AddressText.getText(), EmailTxt.getText(), name);
        clientList.add(cust);
        JOptionPane.showMessageDialog(this, "Customer added successfully");
        
        CardLayout layout=(CardLayout)container.getLayout();
        LoginPageJPanel su = new LoginPageJPanel(container, system, logoutJButton);
        container.add("workArea",su);
        layout.next(container);
        
        nameText.setText("");
        usernameText.setText("");
        restPwdText.setText("");
        phoneText.setText("");
        AddressText.setText("");
        EmailTxt.setText("");
        int Index = -1;
        
        //need to check for mail (jeel)

//        EmailReceipt sendMail = new EmailReceipt(cust.getEmail(), "Meal Mate Registration", "Hey " + cust.getName() + "\n"
//            +"Thank you for successfully registering. Your Username and Password are below:" + "\n" + "\n" +
//            "Username: " + ua.getUsername() + "\n" +
//            "Passowrd: " + ua.getPassword());

    }//GEN-LAST:event_AddBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AddressText;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel restPwdLabel1;
    private javax.swing.JPasswordField restPwdText;
    private javax.swing.JLabel updateRestManagerLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
