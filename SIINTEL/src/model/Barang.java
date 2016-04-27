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
    private String namaBarang;
    private String merk;
    private int jumlah;
    private Date tanggalPembelian;
    private boolean kondisi = true;
    private String keterangan;
    private String lokasi;

    public Barang(String IdBarang, String namaBarang, Date tanggalPembelian, String keterangan) {
        this.IdBarang = IdBarang;
        this.namaBarang = namaBarang;
        this.tanggalPembelian = tanggalPembelian;
        this.keterangan = keterangan;
    }

    
    public String getIdBarang() {
        return IdBarang;
    }

    public void setIdBarang(String IdBarang) {
        this.IdBarang = IdBarang;
    }



    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Date getTanggalPembelian() {
        return tanggalPembelian;
    }

    public void setTanggalPembelian(Date tanggalPembelian) {
        this.tanggalPembelian = tanggalPembelian;
    }

    public boolean isKondisi() {
        return kondisi;
    }

    public void setKondisi(boolean kondisi) {
        this.kondisi = kondisi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
}
