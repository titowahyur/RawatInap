/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tito Wahyu
 */
public class Admin {
    private String id_admin, Username, Password;

    // Constructor
    public Admin(String id_admin, String Username, String Password) {
        this.id_admin = id_admin;
        this.Username = Username;
        this.Password = Password;
    }
    
    // Empty Constructor
    public Admin() {
        
    }
    
    // Getter Setter
    public String getid_admin() {
        return id_admin;
    }
    
    public String setid_admin() {
        return id_admin;
    }
    
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    } 
}
