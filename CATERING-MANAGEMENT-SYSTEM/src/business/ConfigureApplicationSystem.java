/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import catering.system.Role.SystemAdminRole;
import catering.system.Users.Employee;
import catering.system.Users.UserAccount;

/**
 *
 * @author mrunalipawar
 */
public class ConfigureApplicationSystem {
    
     public static ApplicationSystem configure(){
        
        ApplicationSystem system = ApplicationSystem.getApplicationSystemInstance(); 
        
        Employee employee = system.getEmployeeDirectory().createEmployee("mrunali");        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole(), "admin");
        
        return system;
    }
}
