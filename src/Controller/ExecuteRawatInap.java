/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnectionManager;
import Model.RawatInap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tito Wahyu
 */
public class ExecuteRawatInap {
    public String TabelRawatInap(RawatInap ri){
        String query = "INSERT INTO t_rawat_inap value(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, ri.getNoRM());
            pstm.setString(2, ri.getRuangan());
            pstm.setString(3, ri.getNamaPasien());
            pstm.setString(4, ri.getJenisKelamin());
            pstm.setString(5, ri.getAlamat());
            pstm.setString(6, ri.getTelepon());
            pstm.setString(7, ri.getUmur());
            pstm.setString(8, ri.getPekerjaan());
            pstm.setString(9, ri.getTanggalMasuk());
            pstm.setString(10, ri.getTanggalKeluar());
            pstm.setString(11, ri.getKeterangan());
            pstm.executeUpdate();
            Respon = "Insert Sukses";
        } catch (SQLException ex) {
            Respon = "Insert Gagal";
            
            Logger.getLogger(ExecuteRawatInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return Respon;
    }
    
    public List<RawatInap> ListRi(){
        List<RawatInap> arlistri = new ArrayList<>();
        String query = "SELECT * FROM t_rawat_inap";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                RawatInap ri = new RawatInap();
                ri.setNoRM(rs.getString("NoRM"));
                ri.setRuangan(rs.getString("Ruangan"));
                ri.setNamaPasien(rs.getString("NamaPasien"));
                ri.setJenisKelamin(rs.getString("JenisKelamin"));
                ri.setAlamat(rs.getString("Alamat"));
                ri.setTelepon(rs.getString("Telepon"));
                ri.setUmur(rs.getString("Umur"));
                ri.setPekerjaan(rs.getString("Pekerjaan"));
                ri.setTanggalMasuk(rs.getString("TanggalMasuk"));
                ri.setTanggalKeluar(rs.getString("TanggalKeluar"));
                ri.setKeterangan(rs.getString("Keterangan"));
                arlistri.add(ri);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteRawatInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return arlistri;
    }
    
    public String UpdateRawatInap(RawatInap ri){
        String hasil="";
        String query = "UPDATE t_rawat_inap SET Ruangan='"+ri.getRuangan()+"', NamaPasien='"+ri.getNamaPasien()+"', JenisKelamin='"+ri.getJenisKelamin()+"', Alamat='"+ri.getAlamat()+"', Telepon='"+ri.getTelepon()+"', Umur='"+ri.getUmur()+"', Pekerjaan='"+ri.getPekerjaan()+"', TanggalMasuk='"+ri.getTanggalMasuk()+"', TanggalKeluar='"+ri.getTanggalKeluar()+"', Keterangan='"+ri.getKeterangan()+"' ";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            hasil = "Berhasil";
        } catch ( SQLException ex) {
            hasil = "Gagal";
            Logger.getLogger(ExecuteRawatInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return hasil;
    }
    
    public String deleteRawatInap(String ri) {
        String hasil = "";
        String query = "DELETE FROM t_rawat_inap where NoRM='"+ri+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            hasil="Berhasil";
        } catch (SQLException ex) {
            hasil = "Gagal";
            Logger.getLogger(ExecuteRawatInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return hasil;
    }
}
