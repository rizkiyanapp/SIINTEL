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
public class Laporan {
    private String idLaporan;
    private String type;
    private Date date;
    private boolean acc;
    private boolean statKoor=false;
    private String barang;
    private int qty;
    private String detail;
    private int nLaporan;
    private String lokasi;

    public Laporan(String idLaporan, Date date, String barang, int qty, String detail, int nLaporan, String lokasi,boolean acc) {
        this.idLaporan = idLaporan;
        this.date = date;
        this.barang = barang;
        this.qty = qty;
        this.detail = detail;
        this.nLaporan = nLaporan;
        this.lokasi = lokasi;
        this.acc=false;
    }
    

    public boolean isAcc() {
        return acc;
    }

    public void setAcc(boolean acc) {
        this.acc = acc;
    }

    public boolean isStatKoor() {
        return statKoor;
    }

    public void setStatKoor(boolean statKoor) {
        this.statKoor = statKoor;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getIdLaporan() {
        return idLaporan;
    }

    public void setIdLaporan(String idLaporan) {
        this.idLaporan = idLaporan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getnLaporan() {
        return nLaporan;
    }

    public void setnLaporan(int nLaporan) {
        this.nLaporan = nLaporan;
    }
    
    
}
