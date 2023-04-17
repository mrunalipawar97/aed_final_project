/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import catering.system.useraccount.UserAccount;
import catering.system.useraccount.UserAccountDirectory;

/**
 *
 * @author mrunalipawar
 */
public class ApplicationSystem {
    private UserAccountDirectory userAccountDirectory;
    public ApplicationSystem(){
        this.userAccountDirectory=new UserAccountDirectory();
        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "SystemAdmin");
    }
     public static ApplicationSystem getApplicationSystemInstance() {
        
        return new ApplicationSystem();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
     
     
}
