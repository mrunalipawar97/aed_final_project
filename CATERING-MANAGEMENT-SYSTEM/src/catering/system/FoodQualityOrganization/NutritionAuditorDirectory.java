/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.FoodQualityOrganization;

import catering.system.Users.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author jeelkanzaria
 */
public class NutritionAuditorDirectory {
    private ArrayList<NutritionAuditor> nutritionAuditorList;
    
    public NutritionAuditorDirectory() {
        nutritionAuditorList = new ArrayList();
    }

    public ArrayList<NutritionAuditor> getNutritionAuditorList() {
        return nutritionAuditorList;
    }

    public void setNutritionAuditorList(ArrayList<NutritionAuditor> nutritionAuditorList) {
        this.nutritionAuditorList = nutritionAuditorList;
    }

    public Boolean deletenutritionAuditorManager(String name) {
        for(int i = 0; i < nutritionAuditorList.size(); i ++) {
            if(nutritionAuditorList.get(i).getAuditorName().equals(name)) {
//                system.getUserAccountDirectory().deleteUser(groceryManagerList.get(i).getAccountDetails().getUsername());
                nutritionAuditorList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public NutritionAuditor createNutritionAuditor(String name, UserAccount ua, String phone, String address, String location){
        NutritionAuditor nut = new NutritionAuditor();
        nut.setAuditorName(name);
        nut.setAccountDetails(ua);
        nut.setPhone(phone);
        nut.setAddress(address);
        nut.setLocation(location);
        
        nutritionAuditorList.add(nut);
        return nut;
    }
}
