/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.OrderManagement;

import catering.system.FoodProdOrganization.CateringManager;
import catering.system.FoodProdOrganization.Menu;
import catering.system.FoodWarehouseOrganization.Inventory;
import catering.system.FoodWarehouseOrganization.InventoryManager;
import catering.system.Organization.ServiceEnterpriseOrganization.Client;
import catering.system.Users.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class InventoryOrderDirectory {
    
    private ArrayList<InventoryOrder> inventoryOrderList;
    private String status;
    private int id;
    private static int count = 1;
    private Boolean isAccept;
    private String comment;    
    private String feedbackComment;
    private UserAccount clientDetails;
    private Inventory inventory;

   

    public InventoryOrderDirectory() {
        id = count;
        count++;
        inventoryOrderList = new ArrayList<InventoryOrder>();
        //deliveryMan = new DeliveryMan();
        status = "Placed";
        comment = "";        
        feedbackComment = "";
        isAccept = false;
    }

    public ArrayList<InventoryOrder> getInventoryOrderList() {
        return inventoryOrderList;
    }

    public void setInventoryOrderList(ArrayList<InventoryOrder> inventoryOrderList) {
        this.inventoryOrderList = inventoryOrderList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        InventoryOrderDirectory.count = count;
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFeedbackComment() {
        return feedbackComment;
    }

    public void setFeedbackComment(String feedbackComment) {
        this.feedbackComment = feedbackComment;
    }

    public UserAccount getClientDetails() {
        return clientDetails;
    }

    public void setClientDetails(UserAccount clientDetails) {
        this.clientDetails = clientDetails;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    

   
    public void deleteOrder(String name) {
        for (int i = 0; i < inventoryOrderList.size(); i++) {
            if (inventoryOrderList.get(i).getOrderItem().equals(name)) {
                inventoryOrderList.remove(i);
                return;
            }
        }
    }

    public void deleteOrderAll() {
        for (int i = 0; i < inventoryOrderList.size(); i++) {
            inventoryOrderList.remove(i);
        }
    }

    public InventoryOrder createOrder(Inventory iv, String price, int quantity, CateringManager user) {
        InventoryOrder order = new InventoryOrder();
        order.setInventory(iv);
        order.setOrderPrice(price);
        order.setOrderQuantity(quantity);
        order.setCm(user);
        inventoryOrderList.add(order);
        return order;
    }
}
