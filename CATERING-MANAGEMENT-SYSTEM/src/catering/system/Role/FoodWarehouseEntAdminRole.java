/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.UI.FoodWarehouseAdminWorkArea.FoodWareHouseAdminMainJPanel;
import catering.system.Users.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author nishipancholi
 */
public class FoodWarehouseEntAdminRole extends Role {
    public FoodWarehouseEntAdminRole() {
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, ApplicationSystem business) {
        return new FoodWareHouseAdminMainJPanel(userProcessContainer, account, business);
    }
}
