/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.enterprise;

import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class EnterpriseDirectory {
    ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    
    public Enterprise createEnterprise(String name) {
        Enterprise entName = new Enterprise();
        entName.setName(name);
        this.enterpriseList.add(entName);
        return entName;
    }
    
}
