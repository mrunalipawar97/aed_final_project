/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Users;

import business.ApplicationSystem;
import catering.system.Role.CateringManagerRole;
import catering.system.Role.CateringSystemAdminRole;
import catering.system.Role.ClientRole;
import catering.system.Role.CoordinatorRole;
import catering.system.Role.FoodProdAdminRole;
import catering.system.Role.FoodQualityAdminRole;
import catering.system.Role.FoodWarehouseAdminRole;
import catering.system.Role.InventoryManagerRole;
import catering.system.Role.NutritionAuditorRole;
import catering.system.Role.ServiceEntAdminRole;
import catering.system.Role.ServiceStaffManagerRole;
import catering.system.Role.SuperviserRole;
import javax.swing.JFrame;

/**
 *
 * @author mrunalipawar
 */
public class UserAccount {
    
    Person person;
    String role;
    String username;
    String password;
    private static int count = 0;
    private String accountId;
    
    public UserAccount () {
        this.person = new Person();
        accountId = "ID" + count++;
    }
    
    public UserAccount(String username, String password, String role) {
        
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public UserAccount(Person p){
        person = p;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public JFrame getWorkArea(String role,ApplicationSystem appSystem, UserAccount userAccount) {
        // the abstract class way
        if (role.equals("SystemAdmin")) {
            return new CateringSystemAdminRole().getWorkArea(appSystem,  userAccount);
        }
        if (role.equals("Coordinator")) {
            return new CoordinatorRole().getWorkArea(appSystem,  userAccount);
        }
        if (role.equals("Supervisor")) {
            return new SuperviserRole().getWorkArea(appSystem,   userAccount);
        }
        if (role.equals("NutritionAuditor")) {
            return new NutritionAuditorRole().getWorkArea(appSystem, userAccount);
        }
        if (role.equals("CateringManager")) {
            return new CateringManagerRole().getWorkArea(appSystem, userAccount);
        }
        if (role.equals("Client")) {
            return new ClientRole().getWorkArea(appSystem, userAccount);
        }
        if (role.equals("ServiceStaffManager")) {
            return new ServiceStaffManagerRole().getWorkArea(appSystem, userAccount);
        }
        if (role.equals("InventoryManager")) {
            return new InventoryManagerRole().getWorkArea(appSystem, userAccount);
        }
         if (role.equals("ServiceEntAdmin")) {
            return new ServiceEntAdminRole().getWorkArea(appSystem, userAccount);
        } 
        if (role.equals("FoodProdAdmin")) {
            return new FoodProdAdminRole().getWorkArea(appSystem, userAccount);
        } 
        if (role.equals("FoodQualityAdmin")) {
            return new FoodQualityAdminRole().getWorkArea(appSystem, userAccount);
        } 
        if (role.equals("FoodWarehouseAdmin")) {
            return new FoodWarehouseAdminRole().getWorkArea(appSystem, userAccount);
        }
        return null;
    }
}
