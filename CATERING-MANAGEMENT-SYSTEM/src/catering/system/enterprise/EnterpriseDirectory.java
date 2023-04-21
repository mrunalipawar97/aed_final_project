/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Enterprise;

import catering.system.FoodProdOrganization.CateringManager;
import catering.system.FoodProdOrganization.Coordinator;
import catering.system.FoodProdOrganization.Menu;
import catering.system.FoodProdOrganization.Supervisor;
import catering.system.Users.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mrunalipawar
 */
public class EnterpriseDirectory {
    ArrayList<EnterpriseAdmin> enterpriseAdminList;
    ArrayList<Supervisor> supervisorList;
    ArrayList<CateringManager> cateringManagerList;
    ArrayList<Coordinator> coordinatorList;
    
    ArrayList<Enterprise> enterpriseList;
    ArrayList<Menu> menuList;
    
    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<Enterprise>();
        this.enterpriseAdminList = new ArrayList<EnterpriseAdmin>();
        this.supervisorList = new ArrayList<Supervisor>();
        this.cateringManagerList = new ArrayList<CateringManager>();
        this.coordinatorList = new ArrayList<Coordinator>();
        this.menuList = new ArrayList<Menu>();
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

    public ArrayList<CateringManager> getCateringManagerList() {
        return cateringManagerList;
    }

    public void setCateringManagerList(ArrayList<CateringManager> cateringManagerList) {
        this.cateringManagerList = cateringManagerList;
    }

    public ArrayList<Coordinator> getCoordinatorList() {
        return coordinatorList;
    }

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Menu> menuList) {
        this.menuList = menuList;
    }
    
    

    public void setCoordinatorList(ArrayList<Coordinator> coordinatorList) {
        this.coordinatorList = coordinatorList;
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
    
    public Boolean deleteCateringManager(String name) {
        for(int i = 0; i < cateringManagerList.size(); i ++) {
            if(cateringManagerList.get(i).getName().equals(name)) {
//               system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                cateringManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public CateringManager createCateringManager(String name, UserAccount ua, String phone, String address){
        CateringManager cust = new CateringManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cateringManagerList.add(cust);
        return cust;
    }
    
    public Boolean deleteCoordinator(String name) {
        for(int i = 0; i < coordinatorList.size(); i ++) {
            if(coordinatorList.get(i).getName().equals(name)) {
//               system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                coordinatorList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Coordinator createCoordinator(String name, UserAccount ua, String phone, String address){
        Coordinator cust = new Coordinator();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        coordinatorList.add(cust);
        return cust;
    }
    
    public boolean deleteMenu(String breakfast) {
        for(int i = 0; i < menuList.size(); i ++) {
            if(menuList.get(i).getBreakfast().equals(breakfast)) {
//               system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                menuList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Menu createMenu(Date date, String breakfast, String lunch, String dinner, int batch, float price){
        Menu cust = new Menu();
        cust.setDate(date);
        cust.setBreakfast(breakfast);
        cust.setLunch(lunch);
        cust.setDinner(dinner);
        cust.setBatch(batch);
        cust.setPrice(price);
        menuList.add(cust);
        return cust;
    }
}
