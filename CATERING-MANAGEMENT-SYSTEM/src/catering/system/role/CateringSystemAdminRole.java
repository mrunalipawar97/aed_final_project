/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.UI.AdminWorkArea.AdminJFrame;
import catering.system.Useraccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author mrunalipawar
 */
public class CateringSystemAdminRole {
    
    public CateringSystemAdminRole() {
    }

    
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        return new AdminJFrame(system, useraccount);
    }
}
