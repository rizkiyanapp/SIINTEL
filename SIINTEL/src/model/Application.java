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
 * @author NANON
 */
public class Application {

    private ArrayList<Barang> listAsset;
    private ArrayList<Laporan> listLaporan;
    private ArrayList<Pelapor> listPelapor;
    private ManagerInventaris manager;
    private KoorInventaris koor;

    public Application() {
        listAsset = new ArrayList();
        listLaporan = new ArrayList();
        listPelapor = new ArrayList();
    }

    public void addManager(String nama, Date birthday, String email, String username, String password, String NIP) {
        manager = new ManagerInventaris(nama, birthday, email, username, password, NIP);
    }

    public void addKoor(String nama, Date birthday, String email, String username, String password, String NIP) {
        koor = new KoorInventaris(nama, birthday, email, username, password, NIP);
    }

    public void addPelapor(String nama, Date birthday, String email, String username, String password, String NIP) {
        listPelapor.add(new Pelapor(nama, birthday, email, username, password, NIP));
    }

    public ManagerInventaris getManager(String username, String password) {
        if (manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
            return manager;
        } else {
            return null;
        }
    }

    public KoorInventaris getKoor(String username, String password) {
        if (koor.getUsername().equals(username) && koor.getPassword().equals(password)) {
            return koor;
        } else {
            return null;
        }
    }

    public Pelapor getPelapor(String username, String password) {
        for (Pelapor p : listPelapor) {
            if (p.getUsername().equals(username) && p.getPassword().equals(password)) {
                return p;
            }
        }
        return null;
    }

    public void addAsset(Date buyDate, String name, String merk, String location, String detail) {
        listAsset.add(new Barang(buyDate, name, merk, location, detail));
    }
    
    public Barang getAssetById(String idBarang) {
        for (Barang b : listAsset) {
            if(b.getIdBarang().equals(idBarang)) {
                return b;
            }
        }
        return null;
    }
    
    public Barang getAssetByIndex(int idx) {
        return listAsset.get(idx);
    }
    
    public void addLaporan(Laporan lap) {
        listLaporan.add(lap);
    }

}
