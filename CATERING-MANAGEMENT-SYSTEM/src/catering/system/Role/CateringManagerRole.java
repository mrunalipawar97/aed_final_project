/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.UI.FoodProdAdminWorkArea.CateringManagerMainJPanel;
import catering.system.Users.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author nishipancholi
 */
public class CateringManagerRole extends Role{
    public CateringManagerRole() {
        
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, ApplicationSystem business) {
        return new CateringManagerMainJPanel(userProcessContainer, business);
    }
}
