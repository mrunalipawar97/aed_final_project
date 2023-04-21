/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import catering.system.Enterprise.EnterpriseDirectory;
import catering.system.FoodQualityOrganization.NutritionAuditorDirectory;
import catering.system.FoodWarehouseOrganization.InventoryDirectory;
import catering.system.FoodWarehouseOrganization.InventoryManagerDirectory;
import catering.system.OrderManagement.InventoryOrderDirectory;
import catering.system.Organization.ServiceEnterpriseOrganization.ClientDirectory;
import catering.system.Users.EmployeeDirectory;
import catering.system.Users.UserAccountDirectory;

/**
 *
 * @author mrunalipawar
 */
public class ApplicationSystem {

    private UserAccountDirectory userAccountDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private EmployeeDirectory employeeDirectory;
    private ClientDirectory clientDirectory;
    private BranchLocation branchDirectory;
    
    private InventoryDirectory inventoryDirectory;
    private InventoryManagerDirectory inventoryManagerDirectory; 
    private InventoryOrderDirectory inventoryOrderDirectory;
    private NutritionAuditorDirectory nutritionAuditorDirectory;

    public ApplicationSystem() {
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        //UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "SystemAdmin");
        this.employeeDirectory = new EmployeeDirectory();
        this.clientDirectory = new ClientDirectory();
        this.branchDirectory = new BranchLocation();
        this.inventoryDirectory = new InventoryDirectory();
        this.inventoryManagerDirectory = new InventoryManagerDirectory();
        this.inventoryOrderDirectory = new InventoryOrderDirectory();
        this.nutritionAuditorDirectory = new NutritionAuditorDirectory();
    }

    public static ApplicationSystem getApplicationSystemInstance() {

        return new ApplicationSystem();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public ClientDirectory getClientDirectory() {
        return clientDirectory;
    }

    public void setClientDirectory(ClientDirectory clientDirectory) {
        this.clientDirectory = clientDirectory;
    }

    public BranchLocation getBranchDirectory() {
        return branchDirectory;
    }

    public void setBranchDirectory(BranchLocation branchDirectory) {
        this.branchDirectory = branchDirectory;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }

    public InventoryManagerDirectory getInventoryManagerDirectory() {
        return inventoryManagerDirectory;
    }

    public void setInventoryManagerDirectory(InventoryManagerDirectory inventoryManagerDirectory) {
        this.inventoryManagerDirectory = inventoryManagerDirectory;
    }

    public InventoryOrderDirectory getInventoryOrderDirectory() {
        return inventoryOrderDirectory;
    }

    public void setInventoryOrderDirectory(InventoryOrderDirectory inventoryOrderDirectory) {
        this.inventoryOrderDirectory = inventoryOrderDirectory;
    }

    public NutritionAuditorDirectory getNutritionAuditorDirectory() {
        return nutritionAuditorDirectory;
    }

    public void setNutritionAuditorDirectory(NutritionAuditorDirectory nutritionAuditorDirectory) {
        this.nutritionAuditorDirectory = nutritionAuditorDirectory;
    }

    
}
