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
    private InventoryManager managerDetails;
    private UserAccount userAccount;
    private HashMap<String, String> menu;
    private ArrayList<InventoryOrder> inventoryOrderList;
    private HashMap<String, ArrayList<InventoryOrder>> orders;
    private ArrayList<InventoryOrderDirectory> inventoryOrderDirectoryList;
    private String locationNet;
    
    public Inventory() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        inventoryOrderList = new ArrayList<InventoryOrder>();
        orders = new HashMap<String, ArrayList<InventoryOrder>>();
        inventoryOrderDirectoryList = new ArrayList<InventoryOrderDirectory>();
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

    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }

    public ArrayList<InventoryOrder> getInventoryOrderList() {
        return inventoryOrderList;
    }

    public void setInventoryOrderList(ArrayList<InventoryOrder> inventoryOrderList) {
        this.inventoryOrderList = inventoryOrderList;
    }

    public HashMap<String, ArrayList<InventoryOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<InventoryOrder>> orders) {
        this.orders = orders;
    }

    public ArrayList<InventoryOrderDirectory> getInventoryOrderDirectoryList() {
        return inventoryOrderDirectoryList;
    }

    public void setInventoryOrderDirectoryList(ArrayList<InventoryOrderDirectory> inventoryOrderDirectoryList) {
        this.inventoryOrderDirectoryList = inventoryOrderDirectoryList;
    }

    public String getLocationNet() {
        return locationNet;
    }

    public void setLocationNet(String locationNet) {
        this.locationNet = locationNet;
    }
    
}
