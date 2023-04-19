/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.UI.foodQualityAdminWorkArea.FoodQualityAdminJFrame;
import catering.system.Users.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class FoodQualityAdminRole {
    public FoodQualityAdminRole() {
    }

    
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        return new FoodQualityAdminJFrame(system, useraccount);
    }
}
