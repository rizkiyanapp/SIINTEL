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
public class Pelapor extends Employee{
    private String type="Pelapor";
    private ArrayList<Laporan> laporan;
    private static int nPelapor;

    public Pelapor(String nama, Date birthday, String email, String username, String password, String NIP) {
        super(nama, birthday, email, username, password, NIP);
    }
    
    public void createLaporan(String idLaporan, Date date, String barang, int qty, String detail, int nLaporan, String lokasi,boolean acc){
        Laporan lpr;
        //Object created di dalam method (komposisi)
        String id = Integer.toString(laporan.size() + 1);
        lpr =new Laporan(idLaporan,date,barang,qty,detail,nLaporan,lokasi,acc);
        //Insert it to array list
        laporan.add(lpr);
    }
    
    public Laporan getlaporanByIndex(int idx){
        try {
            return laporan.get(idx);
        } catch (Exception e) {
            return null; //Jika tidak ditemukan
        }
    }
    
    public Laporan getLaporanById(String id){
        for(Laporan lpr : laporan){
            if(lpr.getIdLaporan()== id)
                return lpr;
        }
        return null; //Jika tidak ditemukan
    }
    
    public ArrayList<Laporan> getListLaporan(){
        return laporan;
    }
}
