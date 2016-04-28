/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Async
 */
public class Barang {
    private String IdBarang;
    private String name;
    private String merk;
    private Date buyDate;
    private boolean condition;
    private String detail;
    private String location;
    private static int nBarang;

    public Barang(Date buyDate, String name, String merk, String location, String detail) {
        this.buyDate = buyDate;
        this.name = name;
        this.merk = merk;
        this.location = location;
        this.detail = detail;
        this.IdBarang = "BRG-" + nBarang++;
        setCondition(true);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static int getnBarang() {
        return nBarang;
    }

    public static void setnBarang(int nBarang) {
        Barang.nBarang = nBarang;
    }
    
    public String getIdBarang() {
        return IdBarang;
    }

    public String getName() {
        return name;
    }

    public void setName(String namaBarang) {
        this.name = namaBarang;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date tanggalPembelian) {
        this.buyDate = tanggalPembelian;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean kondisi) {
        this.condition = kondisi;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String keterangan) {
        this.detail = keterangan;
    }
    
}
