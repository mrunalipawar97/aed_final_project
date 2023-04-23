/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Enterprise;

import catering.system.Users.UserAccount;

/**
 *
 * @author nishipancholi
 */
public class EnterpriseAdmin {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String address;
    private String phone;
    private UserAccount accountDetails;
    private Enterprise ent;

    public Enterprise getEnt() {
        return ent;
    }

    public void setEnt(Enterprise ent) {
        this.ent = ent;
    }
    
    public UserAccount getAccountDetails() {
        return accountDetails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setAccountDetails(UserAccount accountDetails) {
        this.accountDetails = accountDetails;
    }
    
    public EnterpriseAdmin() {
        id = count;
        count++;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        EnterpriseAdmin.count = count;
    }
    
    @Override
    public String toString(){
        return this.getEnt().getEntType();
    } 
    
    
}
