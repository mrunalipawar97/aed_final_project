/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.system.useraccount;

/**
 *
 * @author mrunalipawar
 */
public class UserAccount {
    
    Person person;
    String role;
    String username;
    String password;
    private static int count = 0;
    private String accountId;
    
    public UserAccount () {
        this.person = new Person();
        accountId = "ID" + count++;
    }
    
    public UserAccount(String username, String password, String role) {
        
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public UserAccount(Person p){
        person = p;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public JFrame getWorkArea(String role,ApplicationSystem appSystem, UserAccount userAccount) {
        // the abstract class way
        if (role.equals("Admin")) {
            return new AdminRole().getWorkArea(college,  userAccount);
        }
        if (role.equals("Student")) {
            return new StudentRole().getWorkArea(college,  userAccount);
        }
        if (role.equals("Faculty")) {
            return new FacultyRole().getWorkArea(college,   userAccount);
        }
        if (role.equals("Employer")) {
            return new EmployerRole().getWorkArea(college, userAccount);
        }
        return null;
    }*/
}
