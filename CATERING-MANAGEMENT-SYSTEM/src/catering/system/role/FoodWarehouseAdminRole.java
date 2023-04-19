/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.UI.FoodWarehouseAdminWorkArea.FoodWarehouseAdminJFrame;
import catering.system.Users.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class FoodWarehouseAdminRole {
    public FoodWarehouseAdminRole() {
    }

    
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        return new FoodWarehouseAdminJFrame(system, useraccount);

    }
}
