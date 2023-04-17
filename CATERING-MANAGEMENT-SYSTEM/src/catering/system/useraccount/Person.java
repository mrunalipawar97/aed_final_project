/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.useraccount;

/**
 *
 * @author mrunalipawar
 */
public class Person {
    String id;
    private static int count = 0;
   
    public Person() {
        this.count++;
        this.id = "ID"+this.count;
    }
    public Person (String pid){
        this.id = pid;
    }
    
    public String getPersonId(){
        return id+ this.count++;
    }

    public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
}
