/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.FoodWarehouseOrganization;

import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class InventoryDirectory {
    
    private ArrayList<Inventory> storeList;
    private ArrayList<Inventory> itemsList;
    
    public InventoryDirectory() {
        this.storeList = new ArrayList<Inventory>();
        this.itemsList = new ArrayList<Inventory>();
    }

    public ArrayList<Inventory> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Inventory> itemsList) {
        this.itemsList = itemsList;
    }

    public ArrayList<Inventory> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Inventory> storeList) {
        this.storeList = storeList;
    }

    public Boolean deleteInvetory(String name) {
        for(int i = 0; i < itemsList.size(); i ++) {
            if(itemsList.get(i).getName().equals(name)) {
                itemsList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
    public Inventory createInventoryStore(String name, InventoryManager im, String phone, String location){
        Inventory inventory = new Inventory();
        inventory.setName(name);
        inventory.setPhone(phone);
        inventory.setLocation(location);
        inventory.setManagerDetails(im);
        inventory.setUserAccount(im.getAccountDetails());
        storeList.add(inventory);
        return inventory;
    }
    
     public Inventory createInventory(String name, double price){
        Inventory inventory = new Inventory();
        inventory.setName(name);
        inventory.setPrice(price);
        itemsList.add(inventory);
        return inventory;
    }
    
}
