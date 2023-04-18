/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Useraccount;

import java.util.ArrayList;
import catering.system.Role.Role;
/**
 *
 * @author mrunalipawar
 */
public class UserAccountDirectory {
    
    ArrayList<UserAccount> userAccountlist;
    
    public UserAccountDirectory () {
        this.userAccountlist = new ArrayList<UserAccount> ();
    }
   

    public UserAccount newUserAccount(Person p) {

        UserAccount ua = new UserAccount(p);
        userAccountlist.add(ua);
        return ua;
    }

     public String[] getAllRoles() {
       return Role.getRoles();
    }

    public ArrayList<UserAccount> getUserAccountlist() {
        return userAccountlist;
    }

    public void setUserAccountlist(ArrayList<UserAccount> userAccountlist) {
        this.userAccountlist = userAccountlist;
    }
     
    
    public UserAccount createUserAccount(String username, String password, String role){
        UserAccount user = new UserAccount(username, password, role);
        userAccountlist.add(user);
        return user;
        
    }
    
    public UserAccount findbyId(String id) {
        for(UserAccount u: this.userAccountlist) {
            if(u.getPerson().getPersonId().equals(id)) {
                return u;
            }
        }
        return null;  //not found after going through the whole list
    }
   
    
    public UserAccount getUserAccount(String username, String password, String role) {
        for (UserAccount u : this.userAccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                return u;
            }
        }
        return null;
    }
    
    public Boolean accountExists(String username, String password) {
        
        for (UserAccount u : this.userAccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
     public Boolean roleExists(String role) {
        
        for (UserAccount u : this.userAccountlist) {
            if(u.getRole().equals(role)){
                return true;
            }
        }
        return false;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.userAccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount findByUsername(String name) {
        for(UserAccount u: this.userAccountlist) {
            if(u.getUsername().equals(name)) {
                return u;
            }
        }
        return null;
    }
    
    public void removeUser(UserAccount u){
        this.userAccountlist.remove(u);
    }
}
