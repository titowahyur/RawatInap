/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnectionManager;
import Model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tito Wahyu
 */
public class ExecuteAdmin {
    public String InsertAdmin(Admin adm) {
        String query = "INSERT INTO t_admin value(?, ?, ?)";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, adm.getid_admin());
            pstm.setString(2, adm.getUsername());
            pstm.setString(3, adm.getPassword());
            pstm.executeUpdate();
            Respon = "Sign Up Success";
        } catch (SQLException ex) {
            Respon = "Sign Up Failed";
            Logger.getLogger(ExecuteAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return Respon;
    }
}
