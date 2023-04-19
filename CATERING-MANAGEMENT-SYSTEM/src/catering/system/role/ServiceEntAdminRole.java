/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Role;

import business.ApplicationSystem;
import catering.system.Enterprise.Enterprise;
import catering.system.UI.serviceEntAdminWorkArea.ServiceEntAdminJFrame;
import catering.system.Users.UserAccount;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class ServiceEntAdminRole {
    public ServiceEntAdminRole() {
    }

    
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        ArrayList<Enterprise> entList= system.getEnterpriseDirectory().getEnterpriseList();
        Enterprise enterprise=new Enterprise();
        for (Enterprise ent:entList){
            if(ent.getEnterpriseName().equals("Service Enterprise")){
                enterprise=ent;
            }
        }
        return new ServiceEntAdminJFrame(system, useraccount, enterprise);

    }
    
}
