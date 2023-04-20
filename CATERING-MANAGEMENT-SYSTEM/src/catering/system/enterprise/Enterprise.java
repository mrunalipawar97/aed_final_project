/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Enterprise;

import catering.system.Organization.OrganizationDirectory;

/**
 *
 * @author mrunalipawar
 */
public class Enterprise {
    
    String enterpriseName;
    String entAdminName;
    String entType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(){
        super();
        this.entAdminName="none";
        this.organizationDirectory=new OrganizationDirectory();
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEntAdminName() {
        return entAdminName;
    }

    public void setEntAdminName(String entAdminName) {
        this.entAdminName = entAdminName;
    } 
    
    public void removeAdminName(String entAdminName) {
        
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType;
    }
    
    @Override
    public String toString(){
        return this.enterpriseName;
    }
    
}
