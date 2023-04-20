/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import catering.system.Enterprise.EnterpriseDirectory;
import catering.system.Users.EmployeeDirectory;
import catering.system.Users.UserAccountDirectory;

/**
 *
 * @author mrunalipawar
 */
public class ApplicationSystem {

    private UserAccountDirectory userAccountDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private EmployeeDirectory employeeDirectory;

    public ApplicationSystem() {
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        //UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "SystemAdmin");
        this.employeeDirectory = new EmployeeDirectory();
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

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    

}
