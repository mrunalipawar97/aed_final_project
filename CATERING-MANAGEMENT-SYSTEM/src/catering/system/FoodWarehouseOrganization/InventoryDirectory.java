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
    
    public InventoryDirectory() {
        storeList = new ArrayList();
    }

    public ArrayList<Inventory> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Inventory> storeList) {
        this.storeList = storeList;
    }

    public Boolean deleteInvetory(String name) {
        for(int i = 0; i < storeList.size(); i ++) {
            if(storeList.get(i).getName().equals(name)) {
                storeList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
    public Inventory createInventory(String name, InventoryManager im, String phone, String location, String locationNet){
        Inventory inventory = new Inventory();
        inventory.setName(name);
        inventory.setPhone(phone);
        inventory.setLocation(location);
        inventory.setManagerDetails(im);
        inventory.setLocationNet(locationNet);
        inventory.setUserAccount(im.getAccountDetails());
        storeList.add(inventory);
        return inventory;
    }
    
}
