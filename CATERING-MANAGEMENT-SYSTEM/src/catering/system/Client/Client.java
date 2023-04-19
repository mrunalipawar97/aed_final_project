/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Client;

import catering.system.Organization.Organization;
import catering.system.Users.Person;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jeelkanzaria
 */
public class Client extends Person{
    
    private Organization organization;
    ArrayList<Client> clientList;
    
    public Client(){
        super();
        this.clientList = new ArrayList<Client>();
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    
    public Client addClient(String firstname,String lastName, Date dob, String address1, String address2, String city, String zipcode
         , String email, String occupation, String phnNo,String gender){
        Client c=new Client();
        c.setFirstName(firstname);
        c.setLastName(lastName);
        c.setAddress1(address1);
        c.setDob(dob);
        c.setAddress2(address2);
        c.setTown(city);
        c.setZipCode(zipcode);
        c.setEmail(email);
        c.setOccupation(occupation);
        c.setPhoneNumber(phnNo);
        c.setEmail(email);
        
        this.clientList.add(c);
        
        return c;
    }
    
}
