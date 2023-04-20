/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Organization;

import business.BranchLocation;
import catering.system.Organization.ServiceEnterpriseOrganization.ClientDirectory;
import catering.system.Users.EmployeeDirectory;
import catering.system.Users.UserAccountDirectory;
import catering.system.Work.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class Organization {
    
    private String organizationName;
    
    private WorkQueue workQueue;
    
    private EmployeeDirectory employeeDirectory;    
    
    private ClientDirectory clientDirectory;
    
    private UserAccountDirectory userAccountDirectory;
    
    private BranchLocation createBranch;
    
    private int organizationId;
    
    private static int counter=0;
    
    public Organization() {
        
    }
    
    public enum Type{
        AuditingAndReporting("Auditing and Reporting"),
        School("School"),
        office("Office"),
        Government("Government"),
        Hospital("Hospital"),
        Warehouse("Warehouse"),
        Catering("Catering"),
        SysAdmin("Sysadmin");
        
        private String orgValue;
        
        private Type(String value) {
            this.orgValue = value;
        }

        public String getOrgValue() {
            return orgValue;
        }

        public void setOrgValue(String orgValue) {
            this.orgValue = orgValue;
        }
    }

    public Organization(String orgName) {
        this.organizationName = orgName;
        
        workQueue = new WorkQueue();
        
        employeeDirectory = new EmployeeDirectory();
        
        userAccountDirectory = new UserAccountDirectory();
        
        createBranch = new BranchLocation();
        
        organizationId = ++counter;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public ClientDirectory getClientDirectory() {
        return clientDirectory;
    }

    public void setClientDirectory(ClientDirectory clientDirectory) {
        this.clientDirectory = clientDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public BranchLocation getCreateBranch() {
        return createBranch;
    }

    public void setCreateBranch(BranchLocation createBranch) {
        this.createBranch = createBranch;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    
    
    @Override
    public String toString() {
        return organizationName;
    }
}
