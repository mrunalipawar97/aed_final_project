/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.role;

import business.ApplicationSystem;
import catering.system.UI.foodProdAdminWorkArea.FoodProdAdminJFrame;
import catering.system.useraccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class FoodProdAdminRole {
    public FoodProdAdminRole() {
    }

    
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        return new FoodProdAdminJFrame(system, useraccount);
    }
}