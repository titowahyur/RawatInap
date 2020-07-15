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
public class RawatInap {
    private String NoRM, Ruangan, NamaPasien, JenisKelamin, Alamat, Telepon,
            Umur, Pekerjaan, TanggalMasuk, TanggalKeluar, Keterangan;

    public String getNoRM() {
        return NoRM;
    }

    public void setNoRM(String NoRM) {
        this.NoRM = NoRM;
    }

    public String getRuangan() {
        return Ruangan;
    }

    public void setRuangan(String Ruangan) {
        this.Ruangan = Ruangan;
    }

    public String getNamaPasien() {
        return NamaPasien;
    }

    public void setNamaPasien(String NamaPasien) {
        this.NamaPasien = NamaPasien;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getTelepon() {
        return Telepon;
    }

    public void setTelepon(String Telepon) {
        this.Telepon = Telepon;
    }

    public String getUmur() {
        return Umur;
    }

    public void setUmur(String Umur) {
        this.Umur = Umur;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public String getTanggalMasuk() {
        return TanggalMasuk;
    }

    public void setTanggalMasuk(String TanggalMasuk) {
        this.TanggalMasuk = TanggalMasuk;
    }

    public String getTanggalKeluar() {
        return TanggalKeluar;
    }

    public void setTanggalKeluar(String TanggalKeluar) {
        this.TanggalKeluar = TanggalKeluar;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public RawatInap(String NoRM, String Ruangan, String NamaPasien, String JenisKelamin,
            String Alamat, String Telepon, String Umur, String Pekerjaan,
            String TanggalMasuk, String TanggalKeluar, String Keterangan) {
        this.Ruangan = Ruangan;
        this.NamaPasien = NamaPasien;
        this.JenisKelamin = JenisKelamin;
        this.Alamat = Alamat;
        this.Telepon = Telepon;
        this.Umur = Umur;
        this.Pekerjaan = Pekerjaan;
        this.TanggalMasuk = TanggalMasuk;
        this.TanggalKeluar = TanggalKeluar;
        this.Keterangan = Keterangan;
    }
    
    public RawatInap() {
        
    }
}
