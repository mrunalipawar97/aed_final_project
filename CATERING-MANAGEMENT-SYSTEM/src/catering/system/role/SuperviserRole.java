/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.UI.FoodProdAdminWorkArea.SupervisorMainJPanel;
import catering.system.Users.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mrunalipawar
 */
public class SuperviserRole extends Role {
    
    public SuperviserRole() {
        
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, ApplicationSystem business) {
        return new SupervisorMainJPanel(userProcessContainer, business);
    }
    
}
