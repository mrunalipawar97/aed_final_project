/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.useraccount;

import business.ApplicationSystem;
import catering.system.role.CateringManagerRole;
import catering.system.role.CateringSystemAdminRole;
import catering.system.role.ClientRole;
import catering.system.role.CoordinatorRole;
import catering.system.role.InventoryManagerRole;
import catering.system.role.NutritionAuditorRole;
import catering.system.role.ServiceStaffManagerRole;
import catering.system.role.SuperviserRole;
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
        return null;
    }
}
