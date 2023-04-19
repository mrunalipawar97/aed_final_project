/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.role;

import business.ApplicationSystem;
import catering.system.UI.serviceEntAdminWorkArea.ServiceEntAdminJFrame;
import catering.system.useraccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class ServiceEntAdminRole {
    public ServiceEntAdminRole() {
    }

    
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        return new ServiceEntAdminJFrame(system, useraccount);

    }
    
}
