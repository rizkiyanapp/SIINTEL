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
    private boolean statKoor;
    private boolean tolakKoor;
    private boolean tolakAcc;
    private boolean ajukan;
    private String asset;
    private int qty;
    private String detail;
    private String location;
    private static int nLaporan;

    public Laporan(String type, Date date, String asset, int qty, String location, String detail) {
        this.type = type;
        this.date = date;
        this.asset = asset;
        this.qty = qty;
        this.location = location;
        this.detail = detail;
        this.idLaporan = "LAP-" + nLaporan++;
        setAcc(false);
        setStatKoor(false);
        setTolakKoor(false);
        setAjukan(false);
        setTolakAcc(false);
    }

    public boolean isTolakAcc() {
        return tolakAcc;
    }

    public void setTolakAcc(boolean tolakAcc) {
        this.tolakAcc = tolakAcc;
    }

    public boolean isAjukan() {
        return ajukan;
    }

    public void setAjukan(boolean ajukan) {
        this.ajukan = ajukan;
    }

    public boolean isTolakKoor() {
        return tolakKoor;
    }

    public void setTolakKoor(boolean tolak) {
        this.tolakKoor = tolak;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String lokasi) {
        this.location = lokasi;
    }

    public String getIdLaporan() {
        return idLaporan;
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

    public String getAsset() {
        return asset;
    }

    public void setAsset(String barang) {
        this.asset = barang;
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
