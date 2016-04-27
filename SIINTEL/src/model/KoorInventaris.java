/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Async
 */
public class KoorInventaris extends Employee{

    private String type = "Koordinator Inventaris";
    private ArrayList<Laporan> berkas;

    public KoorInventaris(String nama, Date birthday, String email, String username, String password, String NIP) {
        super(nama, birthday, email, username, password, NIP);
    }

    //private ArrayList<Laporan> laporan;

    public void addBerkas(Laporan lap) {
        Laporan lpr = lap;
        berkas.add(lap);
        
    }

    public Laporan getBerkasByIndex(int idx) {
        try {
            return berkas.get(idx);
        } catch (Exception e) {
            return null; //Jika tidak ditemukan; indexoutofbonds
        }
    }

    public Laporan getBerkasById(String idLaporan) {
        for (Laporan lpr : berkas) {
            if (lpr.getIdLaporan().equals(idLaporan)) {
                return lpr;
            }
        }
        return null; //Jika tidak ditemukan
    }
}
