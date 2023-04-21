/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.OrderManagement;

import catering.system.FoodWarehouseOrganization.Inventory;
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

    public InventoryOrder createOrder(String item, String price, int quantity, Inventory inventory, UserAccount user) {
        InventoryOrder order = new InventoryOrder();
        order.setOrderItem(item);
        order.setOrderPrice(price);
        order.setOrderQuantity(quantity);
        inventory = inventory;
        clientDetails = user;
        inventoryOrderList.add(order);
        return order;
    }
}
