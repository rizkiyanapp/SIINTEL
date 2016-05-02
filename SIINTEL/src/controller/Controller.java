/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Application;
import model.Barang;
import model.Employee;
import model.KoorInventaris;
import model.Laporan;
import model.ManagerInventaris;
import model.Pelapor;
import view.halamanKoor.dasboardKoor;
import view.halamanKoor.inputAsset;
import view.halamanKoor.pengelolaan;
import view.halamanManager.dasboardManager;
import view.halamanKoor.lapAsset;
import view.halamanManager.lapBerkas;
import view.halamanManager.lapMasuk;
import view.halamanMasuk.Info;
import view.halamanMasuk.mainPage;
import view.halamanMasuk.signInPage;
import view.halamanMasuk.signUpPage;
import view.halamanPelapor.dasboardPelapor;
import view.halamanPelapor.lapPengajuan;
import view.halamanPelapor.lihatLaporan;

/**
 *
 * @author NANON
 */
public class Controller extends MouseAdapter implements ActionListener {

    private ManagerInventaris manager;
    private KoorInventaris koor;
    private Pelapor pelapor;

    private Application model;
    private mainPage view;
    private Info viewInfo;
    private dasboardKoor viewKoor;
    private dasboardManager viewManager;
    private dasboardPelapor viewPelapor;

    private String asset;
    private Laporan lap;

    private String currentView;
    private JPanel mainPanel;
    private JPanel koorPanel;
    private JPanel managerPanel;
    private JPanel pelaporPanel;

    private signInPage sip;
    private signUpPage sup;
    private inputAsset ias;
    private pengelolaan peng;
    private lapAsset las;
    private lapAsset lasK;
    private lapBerkas lab;
    private lapMasuk lam;
    private lapPengajuan laj;
    private lihatLaporan lip;

    public Controller(Application model) {
        this.model = model;
        this.view = new mainPage();
        this.viewInfo = new Info();
        this.viewKoor = new dasboardKoor();
        this.viewManager = new dasboardManager();
        this.viewPelapor = new dasboardPelapor();

        sip = new signInPage();
        sup = new signUpPage();
        ias = new inputAsset();
        peng = new pengelolaan();
        las = new lapAsset();
        lasK = new lapAsset();
        lab = new lapBerkas();
        lam = new lapMasuk();
        laj = new lapPengajuan();
        lip = new lihatLaporan();

        view.addListener(this);
        viewInfo.addListener(this);
        viewKoor.addListener(this);
        viewManager.addListener(this);
        viewPelapor.addListener(this);
        sip.addListener(this);
        sup.addListener(this);
        sup.addAdapter(this);
        ias.addAdapter(this);
        ias.addListener(this);
        peng.addListener(this);
        peng.addAdapter(this);
        las.addListener(this);
        lasK.addListener(this);
        lab.addListener(this);
        lam.addListener(this);
        lam.addAdapter(this);
        laj.addAdapter(this);
        laj.addListener(this);
        lip.addListener(this);
        lip.AddAdapter(this);

        mainPanel = view.getMenuPanel();
        mainPanel.add(sip, "Sign In Page");
        mainPanel.add(sup, "Sign Up Page");
        currentView = "Sign In Page";

        koorPanel = viewKoor.getMenuPanel();
        koorPanel.add(lasK, "Laporan Asset Koor Page");
        koorPanel.add(ias, "Input Asset Page");
        koorPanel.add(peng, "Pengelolaan Page");

        managerPanel = viewManager.getMenuPanel();
        managerPanel.add(las, "Laporan Asset Page");
        managerPanel.add(lab, "Laporan Berkas Page");
        managerPanel.add(lam, "Laporan Masuk Page");

        pelaporPanel = viewPelapor.getMenuPanel();
        pelaporPanel.add(laj, "Laporan Pengajuan Page");
        pelaporPanel.add(lip, "Lihat Laporan Page");

        view.getCardLayout().show(mainPanel, currentView);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnSignIn())) {
            sip.reset();
            currentView = "Sign In Page";
            view.getCardLayout().show(mainPanel, currentView);
        } else if (source.equals(view.getBtnSignUp())) {
            sup.reset();
            currentView = "Sign Up Page";
            view.getCardLayout().show(mainPanel, currentView);
        } else if (source.equals(view.getBtnExit())) {
            JOptionPane.showMessageDialog(null, "Exit program....");
            view.dispose();
            System.exit(0);
        } else if (source.equals(view.getBtnInfo())) {
            view.dispose();
            viewInfo.setVisible(true);
        } else if (source.equals(viewInfo.getBtnBack())) {
            viewInfo.dispose();
            view.setVisible(true);
        } else if (source.equals(viewKoor.getBtnAsset())) {
            currentView = "Laporan Asset Koor Page";
            viewKoor.setTittle("LAPORAN ASSET PAGE");
            viewKoor.getCardLayout().show(koorPanel, currentView);
        } else if (source.equals(viewKoor.getBtnExit())) {
            koor = null;
            JOptionPane.showMessageDialog(null, "Keluar.....");
            viewKoor.dispose();
            currentView = "Sign In Page";
            view.getCardLayout().show(mainPanel, currentView);
            view.setVisible(true);
        } else if (source.equals(viewKoor.getBtnInput())) {
            viewKoor.setTittle("INPUT ASSET PAGE");
            currentView = "Input Asset Page";
            viewKoor.getCardLayout().show(koorPanel, currentView);
            lap = null;
            ias.reset();
            ias.setListLap(model.getListLaporanInputAsset());
        } else if (source.equals(viewKoor.getBtnPengelolaan())) {
            viewKoor.setTittle("PENGELOLAAN PAGE");
            currentView = "Pengelolaan Page";
            viewKoor.getCardLayout().show(koorPanel, currentView);
            lap = null;
            peng.reset();
            peng.setListLap(model.getListLaporanAll());
        } else if (source.equals(viewManager.getBtnAsset())) {
            viewManager.setTittle("LAPORAN ASSET PAGE");
            currentView = "Laporan Asset Page";
            viewManager.getCardLayout().show(managerPanel, currentView);
        } else if (source.equals(viewManager.getBtnBerkasLap())) {
            viewManager.setTittle("LAPORAN BERKAS PAGE");
            currentView = "Laporan Berkas Page";
            viewManager.getCardLayout().show(managerPanel, currentView);
        } else if (source.equals(viewManager.getBtnExit())) {
            manager = null;
            JOptionPane.showMessageDialog(null, "Keluar.....");
            viewManager.dispose();
            currentView = "Sign In Page";
            view.getCardLayout().show(mainPanel, currentView);
            view.setVisible(true);
        } else if (source.equals(viewManager.getBtnLapMasuk())) {
            viewManager.setTittle("LAPORAN MASUK PAGE");
            currentView = "Laporan Masuk Page";
            viewManager.getCardLayout().show(managerPanel, currentView);
            lap = null;
            lam.reset();
            lam.setListLap(model.getLaporanAjukan());
        } else if (source.equals(viewPelapor.getBtnExit())) {
            pelapor = null;
            JOptionPane.showMessageDialog(null, "Keluar.....");
            viewPelapor.dispose();
            currentView = "Sign In Page";
            view.getCardLayout().show(mainPanel, currentView);
            view.setVisible(true);
        } else if (source.equals(viewPelapor.getBtnLapPengajuan())) {
            viewPelapor.setTittle("LAPORAN PENGAJUAN PAGE");
            currentView = "Laporan Pengajuan Page";
            viewPelapor.getCardLayout().show(pelaporPanel, currentView);
        } else if (source.equals(viewPelapor.getBtnLihatLap())) {
            viewPelapor.setTittle("LIHAT LAPORAN PAGE");
            currentView = "Lihat Laporan Page";
            viewPelapor.getCardLayout().show(pelaporPanel, currentView);
            lap = null;
            lip.reset();
            lip.setListLap(model.getListLaporanByPelapor(pelapor));
        }

        if (currentView.equals("Sign In Page")) {
            if (source.equals(sip.getBtnSingIn())) {
                String username = sip.getUsername();
                String password = sip.getPassword();
                Employee emp = model.getEmployee(username, password);
                if (emp instanceof ManagerInventaris) {
                    manager = (ManagerInventaris) emp;
                } else if (emp instanceof KoorInventaris) {
                    koor = (KoorInventaris) emp;
                } else if (emp instanceof Pelapor) {
                    pelapor = (Pelapor) emp;
                }
                sip.reset();
                String sManager = "===== STATUS =====" + "\n"
                        + "Laporan masuk : 0" + "\n"
                        + "Laporan disetujui : 0" + "\n"
                        + "Laporan ditolak : 0" + "\n"
                        + "Berkas Laporan : 0" + "\n"
                        + "Jumlah Asset : 0" + "\n";
                String sKoor = "===== STATUS =====" + "\n"
                        + "Laporan masuk : 0" + "\n"
                        + "Laporan disetujui : 0" + "\n"
                        + "Laporan ditolak : 0" + "\n"
                        + "Asset belum diinput : 0" + "\n"
                        + "Berkas Laporan : 0" + "\n"
                        + "Jumlah Asset : 0" + "\n";
                String sPelapor = "===== STATUS =====" + "\n"
                        + "Laporan diajukan : 0" + "\n"
                        + "Laporan disetujui : 0" + "\n"
                        + "Laporan ditolak : 0" + "\n";
                if (manager != null) {
                    view.dispose();
                    currentView = "Laporan Masuk Page";
                    viewManager.getCardLayout().show(managerPanel, currentView);
                    viewManager.setVisible(true);
                    viewManager.setGreetings("Selamat datang, " + manager.getName());
                    viewManager.setStatus(sManager);
                } else if (koor != null) {
                    view.dispose();
                    currentView = "Pengelolaan Page";
                    viewKoor.getCardLayout().show(koorPanel, currentView);
                    viewKoor.setVisible(true);
                    viewKoor.setGreetings("Selamat datang, " + koor.getName());
                    viewKoor.setStatus(sKoor);
                } else if (pelapor != null) {
                    view.dispose();
                    currentView = "Laporan Pengajuan Page";
                    viewPelapor.getCardLayout().show(pelaporPanel, currentView);
                    viewPelapor.setVisible(true);
                    viewPelapor.setGreetings("Selamat datang, " + pelapor.getName());
                    viewPelapor.setStatus(sPelapor);
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password salah!");
                    sip.reset();
                }
            }
        } else if (currentView.equals(
                "Sign Up Page")) {
            if (source.equals(sup.getBtnSignUp())) {
                int type = sup.getType();
                String username = sup.getUsername();
                String password = sup.getPassword();
                String cPassword = sup.getConfirmPassword();
                String NIP = sup.getNIP();
                String name = sup.getName();
                Date date = new Date();
                date.setDate(sup.getDay());
                date.setMonth(sup.getMonth());
                date.setYear(sup.getYear());
                String email = sup.getEmail();
                String number = sup.getNumber();
                boolean ada = model.searchEmployee(username);
                if (ada) {
                    JOptionPane.showMessageDialog(null, "Username sudah ada!");
                } else if (type == 0) {
                    JOptionPane.showMessageDialog(null, "Silahkan pilih tipe!");
                } else if (password.equals(cPassword)) {
                    if (NIP.equals("") || name.equals("") || email.equals("") || number.equals("")) {
                        JOptionPane.showMessageDialog(null, "Form tidak boleh kosong!");
                    } else {
                        if (type == 1) {
                            model.addManager(name, date, email, username, password, NIP);
                        } else if (type == 2) {
                            model.addKoor(name, date, email, username, password, NIP);
                        } else if (type == 3) {
                            model.addPelapor(name, date, email, username, password, NIP);
                        }
                        JOptionPane.showMessageDialog(null, "Akun berhasil dibuat...");
                        sup.reset();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password tidak sama!");
                }
            }
        } else if (currentView.equals(
                "Laporan Asset Page")) {
            if (source.equals(las.getBtnRefresh())) {
                int i = 0;
                for (Barang b : model.getListAsset()) {
                    las.getTableAsset().setValueAt(i + 1, i, 0);
                    las.getTableAsset().setValueAt(b.getBuyDate(), i, 1);
                    las.getTableAsset().setValueAt(b.getIdBarang(), i, 2);
                    las.getTableAsset().setValueAt(b.getName(), i, 3);
                    las.getTableAsset().setValueAt(b.getMerk(), i, 4);
                    las.getTableAsset().setValueAt(b.getLocation(), i, 5);
                    i++;
                }
            }
        } else if (currentView.equals(
                "Laporan Asset Koor Page")) {
            if (source.equals(lasK.getBtnRefresh())) {
                int i = 0;
                for (Barang b : model.getListAsset()) {
                    lasK.getTableAsset().setValueAt(i + 1, i, 0);
                    lasK.getTableAsset().setValueAt(b.getBuyDate(), i, 1);
                    lasK.getTableAsset().setValueAt(b.getIdBarang(), i, 2);
                    lasK.getTableAsset().setValueAt(b.getName(), i, 3);
                    lasK.getTableAsset().setValueAt(b.getMerk(), i, 4);
                    lasK.getTableAsset().setValueAt(b.getLocation(), i, 5);
                    i++;
                }
            }
        } else if (currentView.equals(
                "Input Asset Page")) {
            if (source.equals(ias.getBtnInput())) {
                Date date = ias.getDate();
                String name = ias.getNama();
                String merk = ias.getMerk();
                String location = ias.getLokasi();
                String detail = ias.getDetail();
                if (name.equals("") || merk.equals("") || location.equals("") || detail.equals("")) {
                    JOptionPane.showInternalMessageDialog(null, "Form tidak boleh kosong!");
                } else {
                    model.addAsset(date, name, merk, location, detail);
                    JOptionPane.showMessageDialog(null, "Asset berhasil diinput");
                    lap.setStatKoor(true);
                    ias.reset();
                    lap = null;
                    ias.setListLap(model.getListLaporanInputAsset());
                }
            } else if (source.equals(ias.getBtnRefresh())) {
                ias.setListLap(model.getListLaporanInputAsset());
                lap = null;
                ias.reset();
            }
        } else if (currentView.equals(
                "Pengelolaan Page")) {
            if (source.equals(peng.getBtnAjukan())) {
                if (lap != null) {
                    lap.setAjukan(true);
                    JOptionPane.showMessageDialog(null, "Laporan berhasil diajukan");
                    lap = null;
                    peng.reset();
                    peng.setListLap(model.getListLaporanAll());
                } else {
                    JOptionPane.showMessageDialog(null, "Silahkan pilih laporan");
                    lap = null;
                    peng.reset();
                    peng.setListLap(model.getListLaporanAll());
                }
            } else if (source.equals(peng.getBtnRefresh())) {
                lap = null;
                peng.setListLap(model.getListLaporanAll());
            } else if (source.equals(peng.getBtnTolak())) {
                if (lap != null) {
                    lap.setTolakKoor(true);
                    JOptionPane.showMessageDialog(null, "Laporan berhasil ditolak");
                    lap = null;
                    peng.reset();
                    peng.setListLap(model.getListLaporanAll());
                } else {
                    JOptionPane.showMessageDialog(null, "Silahkan pilih laporan");
                    lap = null;
                    peng.reset();
                    peng.setListLap(model.getListLaporanAll());
                }
            }
        } else if (currentView.equals(
                "Laporan Berkas Page")) {
            if (source.equals(lab.getBtnRefresh())) {
                int i = 0;
                for (Laporan lap : model.getListBerkasKoor()) {
                    lab.getTableBerkas().setValueAt(i + 1, i, 0);
                    lab.getTableBerkas().setValueAt(lap.getDate(), i, 1);
                    lab.getTableBerkas().setValueAt(lap.getType(), i, 2);
                    lab.getTableBerkas().setValueAt(lap.getAsset(), i, 3);
                    lab.getTableBerkas().setValueAt(lap.getQty(), i, 4);
                    lab.getTableBerkas().setValueAt(lap.getLocation(), i, 5);
                    if (lap.isStatKoor()) {
                        lab.getTableBerkas().setValueAt("Sudah diinput", i, 6);
                    } else {
                        lab.getTableBerkas().setValueAt("Belum diinput", i, 6);
                    }
                    lab.getTableBerkas().setValueAt(lap.getDetail(), i, 7);
                }
            }
        } else if (currentView.equals(
                "Laporan Masuk Page")) {
            if (source.equals(lam.getBtnRefresh())) {
                lam.setListLap(model.getLaporanAjukan());
                lap = null;
            } else if (source.equals(lam.getBtnSetujui())) {
                if (lap != null) {
                    lap.setAcc(true);
                    JOptionPane.showMessageDialog(null, "Laporan berhasil disetujui");
                    model.addLaptoKoor(lap);
                    lap = null;
                    lam.reset();
                    lam.setListLap(model.getListLaporanAll());
                } else {
                    JOptionPane.showMessageDialog(null, "Silahkan pilih laporan");
                    lap = null;
                    lam.reset();
                    lam.setListLap(model.getListLaporanAll());
                }
            } else if (source.equals(lam.getBtnTolak())) {
                if (lap != null) {
                    lap.setTolakAcc(true);
                    JOptionPane.showMessageDialog(null, "Laporan berhasil ditolak");
                    lap = null;
                    lam.reset();
                    lam.setListLap(model.getListLaporanAll());
                } else {
                    JOptionPane.showMessageDialog(null, "Silahkan pilih laporan");
                    lap = null;
                    lam.reset();
                    lam.setListLap(model.getListLaporanAll());
                }
            }
        } else if (currentView.equals(
                "Laporan Pengajuan Page")) {
            if (source.equals(laj.getBtnKirimLap())) {
                Date date = laj.getSelectedDate();
                String type = laj.getTypeLap();
                int qty = laj.getQty();
                String lokasi = laj.getLokasi();
                String detail = laj.getDetail();
                if (date.equals(null) || type.equals("") || qty == 0 || lokasi.equals("") || detail.equals("")) {
                    JOptionPane.showMessageDialog(null, "Form tidak boleh kosong");
                } else {
                    JOptionPane.showMessageDialog(null, "Laporan berhasil dibuat");
                    pelapor.createLaporan(type, date, asset, qty, lokasi, detail);
                    laj.reset();
                    asset = null;
                }
            } else if (source.equals(laj.getBtnRefresh())) {
                laj.setListAsset(model.getListAssetName());
                asset = null;
                laj.setSelectedAsset("");
            }
        } else if (currentView.equals(
                "Lihat Laporan Page")) {
            if (source.equals(lip.getBtnRefresh())) {
                lip.setListLap(model.getListLaporanByPelapor(pelapor));
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (currentView.equals("Sign Up Page")) {

        } else if (currentView.equals("Input Asset Page")) {
            lap = model.getLaporanAllByDate(ias.getSelectedLap());
            ias.setTipeLap(lap.getType());
            ias.setAsset(lap.getAsset());
            ias.setQty("" + lap.getQty());
            ias.setLokasi(lap.getLocation());
        } else if (currentView.equals("Laporan Pengajuan Page")) {
            asset = laj.getSelectedAsset();
            laj.setSelectedAsset(laj.getSelectedAsset());
        } else if (currentView.equals("Lihat Laporan Page")) {
            lap = model.getLaporanByDate(lip.getSelectedLap(), pelapor);
            lip.setTipeLap(lap.getType());
            lip.setAsset(lap.getAsset());
            lip.setQty("" + lap.getQty());
            lip.setLokasi(lap.getLocation());
            lip.setDetail(lap.getDetail());
            if (lap.isAcc()) {
                lip.setStatLap("Sudah disetujui");
            } else if (lap.isAcc() == false && lap.isTolakAcc()) {
                lip.setStatLap("Laporan ditolak");
            } else if (lap.isAcc() == false && lap.isTolakAcc() == false) {
                lip.setStatLap("Belum disetujui");
            }
            if (lap.isStatKoor()) {
                lip.setStatAsset("Asset sudah diinput");
            } else if (lap.isStatKoor() == false && lap.isTolakKoor()) {
                lip.setStatAsset("Laporan ditolak");
            } else if (lap.isStatKoor() == false && lap.isTolakKoor() == false) {
                lip.setStatAsset("Asset belum diinput");
            }
        } else if (currentView.equals("Pengelolaan Page")) {
            lap = model.getLaporanAllByDate(peng.getSelectedLap());
            peng.setTipeLap(lap.getType());
            peng.setAsset(lap.getAsset());
            peng.setQty("" + lap.getQty());
            peng.setLokasi(lap.getLocation());
            peng.setDetail(lap.getDetail());
        } else if (currentView.equals("Laporan Masuk Page")) {
            lap = model.getLaporanAllByDate(lam.getSelectedLap());
            lam.setTipeLap(lap.getType());
            lam.setAsset(lap.getAsset());
            lam.setQty("" + lap.getQty());
            lam.setLokasi(lap.getLocation());
            lam.setDetail(lap.getDetail());
        }
    }
}
