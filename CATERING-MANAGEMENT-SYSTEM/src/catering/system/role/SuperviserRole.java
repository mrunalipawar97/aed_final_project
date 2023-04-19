/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.UI.AdminWorkArea.SupervisorJPanel;
import catering.system.Users.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mrunalipawar
 */
public class SuperviserRole {
    
    public SuperviserRole() {
    }

    
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        //return new SupervisorJPanel(system, useraccount);
       return null;
    }
    
//    public JPanel createWorkArea(ApplicationSystem appSystem, UserAccount useraccount) {
//        return new SupervisorJPanel(appSystem,useraccount);
//    }
    
}
