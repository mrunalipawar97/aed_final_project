/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Enterprise;

import catering.system.FoodProdOrganization.Supervisor;
import catering.system.Users.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class EnterpriseDirectory {
    ArrayList<EnterpriseAdmin> enterpriseAdminList;
    ArrayList<Supervisor> supervisorList;
    
    ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<Enterprise>();
        this.enterpriseAdminList = new ArrayList<EnterpriseAdmin>();
        this.supervisorList = new ArrayList<Supervisor>();
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

    public ArrayList<Supervisor> getSupervisorList() {
        return supervisorList;
    }

    public void setSupervisorList(ArrayList<Supervisor> supervisorList) {
        this.supervisorList = supervisorList;
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
    
    public Boolean deleteSupervisor(String name) {
        for(int i = 0; i < supervisorList.size(); i ++) {
            if(supervisorList.get(i).getName().equals(name)) {
//               system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                supervisorList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Supervisor createSupervisor(String name, UserAccount ua, String phone, String address){
        Supervisor cust = new Supervisor();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        supervisorList.add(cust);
        return cust;
    }
    
}
