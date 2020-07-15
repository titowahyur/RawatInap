/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Controller.ExecuteRawatInap;
import Model.RawatInap;
import java.util.List;

/**
 *
 * @author Tito Wahyu
 */
public class AdapterRawatInap {
    
    public Object[][] getAllGuru(){
        ExecuteRawatInap eri = new ExecuteRawatInap();
        List<RawatInap>lstri = eri.ListRi();
        Object[][] datari = new Object[lstri.size()][11];
        
        int mysize = 0;
        for (RawatInap ri:lstri){
        datari[mysize][0] = ri.getNoRM();
        datari[mysize][1] = ri.getRuangan();
        datari[mysize][2] = ri.getNamaPasien();
        datari[mysize][3] = ri.getJenisKelamin();
        datari[mysize][4] = ri.getAlamat();
        datari[mysize][5] = ri.getTelepon();
        datari[mysize][6] = ri.getUmur();
        datari[mysize][7] = ri.getPekerjaan();
        datari[mysize][8] = ri.getTanggalMasuk();
        datari[mysize][9] = ri.getTanggalKeluar();
        datari[mysize][10] = ri.getKeterangan();
        mysize++;
    }
    return datari;
    }
    
}
