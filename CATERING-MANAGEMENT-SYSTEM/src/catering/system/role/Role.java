/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.role;

import javax.swing.JFrame;
import catering.system.useraccount.UserAccount;
/**
 *
 * @author mrunalipawar
 */
public abstract class Role {
    static String[] roles = {"SystemAdmin","Coordinator","Supervisor","NutritionAuditor","CateringManager","Client","ServiceStaffManager","InventoryManager"};

    public static String[] getRoles() {
        return roles;
    }

    public abstract JFrame getWorkArea(UserAccount userAccount);
    
}
