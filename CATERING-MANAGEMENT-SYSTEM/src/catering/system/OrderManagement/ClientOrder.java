/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.OrderManagement;

import catering.system.FoodProdOrganization.Coordinator;
import catering.system.FoodProdOrganization.Menu;
import catering.system.Organization.ServiceEnterpriseOrganization.Client;

/**
 *
 * @author nishipancholi
 */
public class ClientOrder {
    String orderId;
    Menu menu;
    float price;
    String status;
    Client client;
    Coordinator coord;
    int count=0;

    public ClientOrder(){
        this.menu=new Menu();
        this.client=new Client();
        this.coord=new Coordinator();
        this.status="Order placed";
        this.orderId="OrderId"+count;
        count++;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    

    public void setStatus(String status) {
        this.status = status;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public Coordinator getCoord() {
        return coord;
    }

    public void setCoord(Coordinator coord) {
        this.coord = coord;
    }
    
    @Override
    public String toString(){
        return this.orderId;
    }

    
    
}
