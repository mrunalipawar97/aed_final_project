/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.Users;

import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeLists;

    public EmployeeDirectory() {
        employeeLists = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeLists() {
        return employeeLists;
    }

    public void setEmployeeLists(ArrayList<Employee> employeeLists) {
        this.employeeLists = employeeLists;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setEmpName(name);
        employeeLists.add(employee);
        return employee;
    }   
}
