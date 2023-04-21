/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.UI.ClientRegistrationWorkArea.ClientWorkAreaJPanel;
import catering.system.Users.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mrunalipawar
 */
public class InventoryManagerRole extends Role {

    public InventoryManagerRole() {
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, ApplicationSystem business) {
        return new ClientWorkAreaJPanel(userProcessContainer, account, business);
        //need to replace with required workarea jpanel
    }

}
