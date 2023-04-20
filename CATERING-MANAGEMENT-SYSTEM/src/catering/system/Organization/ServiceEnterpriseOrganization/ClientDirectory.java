/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Organization.ServiceEnterpriseOrganization;

import catering.system.Users.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class ClientDirectory {
     
    private ArrayList<Client> clientList;
    
    public ClientDirectory() {
        clientList = new ArrayList<Client>();
    }

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }


    public void deleteClient(String name) {
        for(int i = 0; i < clientList.size(); i ++) {
            if(clientList.get(i).getName().equals(name)) {
                clientList.remove(i);
            }
        }
    }
    
    public Client createClient(String name, UserAccount ua, String phone, String address, String Email, String location, String orgType){
        Client cust = new Client();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setEmail(Email);
        cust.setLocation(location);
        cust.setClientType(orgType);
        clientList.add(cust);
        return cust;
    }
}
