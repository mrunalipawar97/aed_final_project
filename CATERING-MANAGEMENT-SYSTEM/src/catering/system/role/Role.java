/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.Users.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mrunalipawar
 */
public abstract class Role {

    static String[] roles = {"SystemAdmin", "Coordinator", "Supervisor", "NutritionAuditor", "CateringManager", "Client", "ServiceStaffManager", "InventoryManager", "ServiceEntAdmin", "FoodProdAdmin", "FoodQualityAdmin", "FoodWarehouseAdmin"};

    public enum RoleType {
        FoodProdAdmin("FoodProdAdmin"),
        FoodQualityAdmin("FoodQualityAdmin"),
        FoodWarehouseAdmin("FoodWarehouseAdmin"),
        ServiceEntAdmin("ServiceEntAdmin"),
        InventoryManager("InventoryManager"),
        ServiceStaffManager("ServiceStaffManager"),
        Client("Client"),
        CateringManager("CateringManager"),
        NutritionAuditor("NutritionAuditor"),
        Supervisor("Supervisor"),
        Coordinator("Coordinator"),
        SystemAdmin("SystemAdmin");

        private String roleValue;

        private RoleType(String value) {
            this.roleValue = value;
        }

        public String getRoleValue() {
            return roleValue;
        }

        public void setRoleValue(String roleValue) {
            this.roleValue = roleValue;
        }

        @Override
        public String toString() {
            return roleValue;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            ApplicationSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
