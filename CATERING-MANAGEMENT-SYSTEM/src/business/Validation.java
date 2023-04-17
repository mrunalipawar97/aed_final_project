/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import javax.swing.JOptionPane;

/**
 *
 * @author nishipancholi
 */
public class Validation {
    public boolean checkNullEmpty(String fieldName) {
        if (fieldName != null && fieldName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out the field, it cannot be null or empty!");
            return false;
        } else {
            return true;
        }
    }
}
