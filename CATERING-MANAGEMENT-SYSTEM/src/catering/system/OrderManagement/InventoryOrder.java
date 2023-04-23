/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.OrderManagement;

import catering.system.FoodProdOrganization.CateringManager;
import catering.system.FoodWarehouseOrganization.Inventory;
import catering.system.FoodWarehouseOrganization.InventoryManager;

/**
 *
 * @author mrunalipawar
 */
public class InventoryOrder {
    
    String orderId;
    String status;
    CateringManager cm;
    Inventory inventory;
    InventoryManager im;
    private String orderItem;
    private String orderPrice;
    private int orderQuantity;
    private static int counter=0;

    
    public InventoryOrder() {
        this.inventory = new Inventory();
        this.im = new InventoryManager();
        this.cm = new CateringManager();
        this.status="Order placed";
        this.counter++;
        this.orderId="OrderId"+this.counter;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CateringManager getCm() {
        return cm;
    }

    public void setCm(CateringManager cm) {
        this.cm = cm;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public InventoryManager getIm() {
        return im;
    }

    public void setIm(InventoryManager im) {
        this.im = im;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        InventoryOrder.counter = counter;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    @Override
    public String toString(){
        return this.orderId;
    }

}
