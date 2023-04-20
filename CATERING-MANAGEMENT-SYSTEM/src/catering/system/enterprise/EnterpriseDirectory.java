/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Enterprise;

import catering.system.Users.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class EnterpriseDirectory {
    ArrayList<EnterpriseAdmin> enterpriseAdminList;
    
    ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<Enterprise>();
        this.enterpriseAdminList = new ArrayList<EnterpriseAdmin>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public ArrayList<EnterpriseAdmin> getEnterpriseAdminList() {
        return enterpriseAdminList;
    }

    public void setEnterpriseAdminList(ArrayList<EnterpriseAdmin> enterpriseAdminList) {
        this.enterpriseAdminList = enterpriseAdminList;
    }
    
    public Enterprise createEnterprise(String name, String type) {
        Enterprise ent= new Enterprise();
        ent.setEnterpriseName(name);
        ent.setEntType(type);
        this.enterpriseList.add(ent);
        return ent;
    }
    
    public Boolean deleteEnterpriseAdmin(String name) {
        for(int i = 0; i < enterpriseAdminList.size(); i ++) {
            if(enterpriseAdminList.get(i).getName().equals(name)) {
//                system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                enterpriseAdminList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public EnterpriseAdmin createEnterpriseAdmin(String name, UserAccount ua, Enterprise ent){
        EnterpriseAdmin cust = new EnterpriseAdmin();
        cust.setName(name);
        cust.setAccountDetails(ua);
        ent.setEntAdminName(name);
        enterpriseAdminList.add(cust);
        return cust;
    }
    
}
