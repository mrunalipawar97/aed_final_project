/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.OrderManagement;

import catering.system.FoodProdOrganization.Menu;
import catering.system.Organization.ServiceEnterpriseOrganization.Client;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class ClientOrderDirectory {
    ArrayList<ClientOrder> clientorderList;
    
    public ClientOrderDirectory(){
        this.clientorderList=new ArrayList<ClientOrder>();
    }

    public ArrayList<ClientOrder> getClientorderList() {
        return clientorderList;
    }

    public void setClientorderList(ArrayList<ClientOrder> clientorderList) {
        this.clientorderList = clientorderList;
    }

    public boolean deleteMenu(String orderId) {
        for(int i = 0; i < clientorderList.size(); i ++) {
            if(clientorderList.get(i).orderId.equals(orderId)) {
//               system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                clientorderList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public ClientOrder createOrder(Menu menu, float price, Client c){
        ClientOrder cust = new ClientOrder();
        cust.setMenu(menu);
        cust.setClient(c);
        cust.setPrice(price);
        clientorderList.add(cust);
        return cust;
    }
    
}
