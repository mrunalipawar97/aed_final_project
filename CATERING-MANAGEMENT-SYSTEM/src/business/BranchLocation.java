/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class BranchLocation {
    
    ArrayList<String> branchLocation = new ArrayList<String>();

    public BranchLocation(){
        this.branchLocation = new ArrayList<String>();
    }

    public ArrayList<String> getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(ArrayList<String> branchLocation) {
        this.branchLocation = branchLocation;
    }

    public String createBranchLocation(String name){
        branchLocation.add(name);
        return name;
    }

}
