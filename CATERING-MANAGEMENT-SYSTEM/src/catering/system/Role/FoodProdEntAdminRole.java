/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.UI.FoodProdAdminWorkArea.FoodProdAdminMainJPanel;
import catering.system.Users.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author nishipancholi
 */
public class FoodProdEntAdminRole extends Role {

    public FoodProdEntAdminRole() {
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, ApplicationSystem business) {
        return new FoodProdAdminMainJPanel(userProcessContainer, account, business);

    }
}
