/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.FoodWarehouseOrganization;

import catering.system.OrderManagement.InventoryOrder;
import catering.system.OrderManagement.InventoryOrderDirectory;
import catering.system.Users.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mrunalipawar
 */
public class Inventory {
    
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;    
    private String location;
    private String phone;
    private double price;
    private InventoryManager managerDetails;
    private UserAccount userAccount;
    private ArrayList<InventoryOrder> orderList;
    private ArrayList<InventoryOrderDirectory> orderDirectoryList;
    private String locationNet;
    
    public Inventory() {
        id = count;
        count++;
        orderList = new ArrayList<InventoryOrder>();
        orderDirectoryList = new ArrayList<InventoryOrderDirectory>();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        Inventory.count = count;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public InventoryManager getManagerDetails() {
        return managerDetails;
    }

    public void setManagerDetails(InventoryManager managerDetails) {
        this.managerDetails = managerDetails;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
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

    public String getLocationNet() {
        return locationNet;
    }

    public void setLocationNet(String locationNet) {
        this.locationNet = locationNet;
    }
    
    @Override
    public String toString() {
        return this.name;
    }

}
