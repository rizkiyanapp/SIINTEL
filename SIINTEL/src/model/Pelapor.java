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
public class Pelapor extends Employee {

    private ArrayList<Laporan> listLap;
    private static int nPelapor;

    public Pelapor(String nama, Date birthday, String email, String username, String password, String NIP) {
        super(nama, birthday, email, username, password, NIP, "Pelapor");
        nPelapor++;
    }

    public void createLaporan(String type, Date date, String asset, int qty, String location, String detail) {
        Laporan lap = new Laporan(type, date, asset, qty, location, detail);
        listLap.add(lap);
    }

    public static int getnPelapor() {
        return nPelapor;
    }

    public static void setnPelapor(int nPelapor) {
        Pelapor.nPelapor = nPelapor;
    }

    public Laporan getlaporanByIndex(int idx) {
        return listLap.get(idx);
    }

    public Laporan getLaporanById(String id) {
        for (Laporan lpr : listLap) {
            if (lpr.getIdLaporan().equals(id)) {
                return lpr;
            }
        }
        return null;
    }

    public ArrayList<Laporan> getListLaporan() {
        return listLap;
    }
}
