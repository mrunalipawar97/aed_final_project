/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.FoodProdOrganization;

import catering.system.OrderManagement.InventoryOrder;
import catering.system.OrderManagement.InventoryOrderDirectory;
import catering.system.Users.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class CateringManager {
    private String name;
    private int id;
    private static int count = 1;
    private String address;
    private String phone;
    private UserAccount accountDetails;
    private String Network;
    private ArrayList<InventoryOrder> orderList;
    private ArrayList<InventoryOrderDirectory> orderDirectoryList;

    public CateringManager() {
        id = count;
        count++;
        this.orderList = new ArrayList<InventoryOrder>();
        this.orderDirectoryList = new ArrayList<InventoryOrderDirectory>();
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
   
    public void setAccountDetails(UserAccount accountDetails) {
        this.accountDetails = accountDetails;
    }

    public ArrayList<InventoryOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<InventoryOrder> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<InventoryOrderDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<InventoryOrderDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
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
        CateringManager.count = count;
    }

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    
}
