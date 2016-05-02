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
public class KoorInventaris extends Employee {

    
    private ArrayList<Laporan> listBerkas;

    public KoorInventaris(String nama, Date birthday, String email, String username, String password, String NIP) {
        super(nama, birthday, email, username, password, NIP, "Koordinator Inventaris");
        listBerkas = new ArrayList();
    }
    
    public void assetInputed(Laporan lap) {
        lap.setStatKoor(true);
    }
    
    public void addBerkas(Laporan lap) {
        listBerkas.add(lap);
    }

    public Laporan getBerkasByIndex(int idx) {
        return listBerkas.get(idx);
    }

    public Laporan getBerkasById(String idLaporan) {
        for (Laporan lpr : listBerkas) {
            if (lpr.getIdLaporan().equals(idLaporan)) {
                return lpr;
            }
        }
        return null;
    }

    public ArrayList<Laporan> getListBerkas() {
        return listBerkas;
    }
}
