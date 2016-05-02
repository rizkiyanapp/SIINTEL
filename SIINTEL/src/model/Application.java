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

    private ArrayList<Employee> listAllUser;
    private ArrayList<Barang> listAsset;
    private ArrayList<Laporan> listLaporan;
    private ArrayList<Pelapor> listPelapor;
    private ManagerInventaris manager;
    private KoorInventaris koor;

    public Application() {
        listAllUser = new ArrayList();
        listAsset = new ArrayList();
        listLaporan = new ArrayList();
        listPelapor = new ArrayList();
    }

    public void addManager(String nama, Date birthday, String email, String username, String password, String NIP) {
        manager = new ManagerInventaris(nama, birthday, email, username, password, NIP);
        listAllUser.add(manager);
    }

    public void addKoor(String nama, Date birthday, String email, String username, String password, String NIP) {
        koor = new KoorInventaris(nama, birthday, email, username, password, NIP);
        listAllUser.add(koor);
    }

    public void addPelapor(String nama, Date birthday, String email, String username, String password, String NIP) {
        Pelapor pel = new Pelapor(nama, birthday, email, username, password, NIP);
        listPelapor.add(pel);
        listAllUser.add(pel);
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
            if (b.getIdBarang().equals(idBarang)) {
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

    public Laporan getLaporanById(String idLaporan) {
        for (Laporan lap : listLaporan) {
            if (lap.getIdLaporan().equals(idLaporan)) {
                return lap;
            }
        }
        return null;
    }

    public Laporan getLaporanByIndex(int idx) {
        return listLaporan.get(idx);
    }

    public boolean searchEmployee(String username) {
        for (Employee e : listAllUser) {
            if (e.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public Employee getEmployee(String username, String password) {
        for (Employee e : listAllUser) {
            if (e.getUsername().equals(username) && e.getPassword().equals(password)) {
                return e;
            }
        }
        return null;
    }

    public String[] getListAssetName() {
        String[] list = {("Kursi Chetos"), ("Meja Dosen"), ("Meja PC"), ("PC"), ("Kipas Angin"), ("AC"), ("Proyektor"),
            ("Kursi Meeting"), ("Kabel HDMI"), ("TV"), ("Lemari Buku"), ("Kursi Sofa"), ("Speaker")};
        return list;
    }

    public String[] getListLaporanByPelapor(Pelapor p) {
        ArrayList<String> list = new ArrayList();
        for (Laporan lap : p.getListLaporan()) {
            String s = lap.getDate().toString();
            list.add(s);
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public Laporan getLaporanByDate(String date, Pelapor p) {
        for (Laporan lap : p.getListLaporan()) {
            if (lap.getDate().toString().equals(date)) {
                return lap;
            }
        }
        return null;
    }

    public String[] getListLaporanAll() {
        ArrayList<String> list = new ArrayList();
        for (Pelapor p : listPelapor) {
            for (Laporan lap : p.getListLaporan()) {
                if (lap.isAcc() && lap.isStatKoor() == false) {
                    String s = lap.getDate().toString();
                    list.add(s);
                }
            }
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public Laporan getLaporanAllByDate(String date) {
        for (Pelapor p : listPelapor) {
            for (Laporan lap : p.getListLaporan()) {
                if (lap.getDate().toString().equals(date)) {
                    return lap;
                }
            }
        }
        return null;
    }
}
