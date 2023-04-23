/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.validations;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jeelkanzaria
 */
public class ValidateStrings extends InputVerifier{
    Validate validate;
    ValidateStrings(){
        this.validate=new Validate();
    }
    public static boolean checkNullEmpty(String fieldName) {
        if (fieldName != null && fieldName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out the field, it cannot be null or empty!");
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean verifyString(String text) {
     
        String pattern = "^[0-9]*[a-zA-Z][a-zA-Z0-9]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                JOptionPane.showMessageDialog(null, "Please enter valid string. Special characters are not allowed", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                return true;
            }
        }
        else
        {
            return true;
        }
    }
    public static Boolean validateFields(String username, String name, char[] pwd) {
        String passregex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(passregex);
        Matcher matcher = pattern.matcher(String.valueOf(pwd));
        if(username.isEmpty()  || name.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (pwd.length < 8) {
            JOptionPane.showMessageDialog(null,"Password cannot be less than 8","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!matcher.matches()){
            JOptionPane.showMessageDialog(null, "Enter valid password with atleast on number, one lowercase letter, one uppercase letter,one special char and atleast 8 digits");
            return false;
        }
        return true;
    }
       public static Boolean validateStringFields(String username, String address, String phone, String name, char[] pwd) {
        String passregex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(passregex);
        Matcher matcher = pattern.matcher(String.valueOf(pwd));
        if(username.isEmpty() || phone.isEmpty() || name.isEmpty() || address.isEmpty()) {
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
        }else if(!matcher.matches()){
            JOptionPane.showMessageDialog(null, "Enter valid password with atleast on number, one lowercase letter, one uppercase letter,one special char and atleast 8 digits");
            return false;
        }
        return true;
    }
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
     
        String pattern = "^[0-9]*[a-zA-Z][a-zA-Z0-9]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid string. Special characters are not allowed", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
        }
        else
        {
            input.setBackground(Color.white);
            return true;
        }
    }
}
