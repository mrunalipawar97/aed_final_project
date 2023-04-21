/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.FoodWarehouseOrganization;

import catering.system.Users.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class InventoryManagerDirectory {
    
    private ArrayList<InventoryManager> inventoryManagerList;
    
    public InventoryManagerDirectory() {
        inventoryManagerList = new ArrayList();
    }

    public ArrayList<InventoryManager> getInventoryManagerList() {
        return inventoryManagerList;
    }

    
    public void setClientList(ArrayList<InventoryManager> inventoryManagerList) {
        this.inventoryManagerList = inventoryManagerList;
    }
    
    public Boolean deleteInventoryManager(String name) {
        for(int i = 0; i < inventoryManagerList.size(); i ++) {
            if(inventoryManagerList.get(i).getName().equals(name)) {
                inventoryManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public InventoryManager createInventoryManager(String name, UserAccount ua, String phone, String address, String location){
        InventoryManager im = new InventoryManager();
        im.setName(name);
        im.setAccountDetails(ua);
        im.setAddress(address);
        im.setPhone(phone);
        im.setLocation(location);
        inventoryManagerList.add(im);
        return im;
    }
}
