/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Organization;

import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class OrganizationDirectory {
        private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        this.organizationList= new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization addOrganization(String type, String name){
       Organization org= new Organization();
       org.setType(type);
       org.setName(name);
       
       this.organizationList.add(org);
       return org;
    }
    
}
