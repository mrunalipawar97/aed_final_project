/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Users;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mrunalipawar
 */
public class Person {
    private String firstName;
    private String name;
    private String lastName;
    private Date dob;
    private String address1;
    private String phoneNumber;
    private String personId;
    private boolean Client;
    private String emailId;
    private String occupation;
    private String address2;
    private String town;
    private String zipCode;
    private String gender;
    private static int count = 00001;
    private String country;
    private String state;
    private int age;

    public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }

    public String getPersonId() {
        return personId;
    }
    
    
}
