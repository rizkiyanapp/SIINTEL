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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Application;
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

    private Application model;
    private mainPage view;
    private Info viewInfo;
    private dasboardKoor viewKoor;
    private dasboardManager viewManager;
    private dasboardPelapor viewPelapor;

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
        las.addListener(this);
        lab.addListener(this);
        lam.addListener(this);
        laj.addAdapter(this);
        laj.addListener(this);
        lip.addListener(this);

        mainPanel = view.getMenuPanel();
        mainPanel.add(sip, "Sign In Page");
        mainPanel.add(sup, "Sign Up Page");
        currentView = "Sign In Page";

        koorPanel = viewKoor.getMenuPanel();
        koorPanel.add(las, "Laporan Asset Page");
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
            currentView = "Sign In Page";
            view.getCardLayout().show(mainPanel, currentView);
        } else if (source.equals(view.getBtnSignUp())) {
            currentView = "Sign Up Page";
            view.getCardLayout().show(mainPanel, currentView);
        } else if (source.equals(view.getBtnExit())) {
            JOptionPane.showMessageDialog(null, "Exit program....");
            view.dispose();
            System.exit(0);
        } else if(source.equals(view.getBtnInfo())) {
            view.dispose();
            viewInfo.setVisible(true);
        } else if(source.equals(viewInfo.getBtnBack())) {
            viewInfo.dispose();
            view.setVisible(true);
        } else if (source.equals(viewKoor.getBtnAsset())) {
            currentView = "Laporan Asset Page";
            viewKoor.getCardLayout().show(koorPanel, currentView);
        } else if (source.equals(viewKoor.getBtnExit())) {
            JOptionPane.showMessageDialog(null, "Keluar.....");
            viewKoor.dispose();
            currentView = "Sign In Page";
            view.getCardLayout().show(mainPanel, currentView);
            view.setVisible(true);
        } else if (source.equals(viewKoor.getBtnInput())) {
            currentView = "Input Asset Page";
            viewKoor.getCardLayout().show(koorPanel, currentView);
        } else if (source.equals(viewKoor.getBtnPengelolaan())) {
            currentView = "Pengelolaan Page";
            viewKoor.getCardLayout().show(koorPanel, currentView);
        } else if (source.equals(viewManager.getBtnAsset())) {
            currentView = "Laporan Asset Page";
            viewManager.getCardLayout().show(managerPanel, currentView);
        } else if (source.equals(viewManager.getBtnBerkasLap())) {
            currentView = "Laporan Berkas Page";
            viewManager.getCardLayout().show(managerPanel, currentView);
        } else if (source.equals(viewManager.getBtnExit())) {
            JOptionPane.showMessageDialog(null, "Keluar.....");
            viewManager.dispose();
            currentView = "Sign In Page";
            view.getCardLayout().show(mainPanel, currentView);
            view.setVisible(true);
        } else if (source.equals(viewManager.getBtnLapMasuk())) {
            currentView = "Laporan Masuk Page";
            viewManager.getCardLayout().show(managerPanel, currentView);
        } else if (source.equals(viewPelapor.getBtnExit())) {
            JOptionPane.showMessageDialog(null, "Keluar.....");
            viewPelapor.dispose();
            currentView = "Sign In Page";
            view.getCardLayout().show(mainPanel, currentView);
            view.setVisible(true);
        } else if (source.equals(viewPelapor.getBtnLapPengajuan())) {
            currentView = "Laporan Pengajuan Page";
            viewPelapor.getCardLayout().show(pelaporPanel, currentView);
        } else if (source.equals(viewPelapor.getBtnLihatLap())) {
            currentView = "Lihat Laporan Page";
            viewPelapor.getCardLayout().show(pelaporPanel, currentView);
        }

        if (currentView.equals("Sign In Page")) {
            if (source.equals(sip.getBtnSingIn())) {
                view.dispose();
                
//                currentView = "Laporan Masuk Page";
//                viewManager.getCardLayout().show(managerPanel, currentView);
//                viewManager.setVisible(true);

                currentView = "Laporan Pengajuan Page";
                viewPelapor.getCardLayout().show(pelaporPanel, currentView);
                viewPelapor.setVisible(true);
                
//                currentView = "Pengelolaan Page";
//                viewKoor.getCardLayout().show(koorPanel, currentView);
//                viewKoor.setVisible(true);
            }
        } else if (currentView.equals("Sign Up Page")) {
            if (source.equals(sup.getBtnSignUp())) {

            }
        } else if(currentView.equals("Laporan Asset Page")) {
            if (source.equals(las.getBtnRefresh())) {
                
            }
        } else if(currentView.equals("Input Asset Page")) {
            if(source.equals(ias.getBtnInput())) {
                
            } else if(source.equals(ias.getBtnRefresh())) {
                
            }
        } else if(currentView.equals("Pengelolaan Page")) {
            if(source.equals(peng.getBtnAjukan())) {
                
            } else if(source.equals(peng.getBtnRefresh())) {
                
            } else if(source.equals(peng.getBtnTolak())) {
                
            }
        } else if(currentView.equals("Laporan Berkas Page")) {
            if(source.equals(lab.getBtnRefresh())) {
                
            }
        } else if (currentView.equals("Laporan Masuk Page")) {
            if(source.equals(lam.getBtnRefresh())) {
                
            } else if(source.equals(lam.getBtnSetujui())) {
                
            } else if(source.equals(lam.getBtnTolak())) {
                
            }
        } else if(currentView.equals("Laporan Pengajuan Page")) {
            if (source.equals(laj.getBtnKirimLap())) {
                
            } else if(source.equals(laj.getBtnRefresh())) {
                
            }
        } else if(currentView.equals("Lihat Laporan Page")) {
            if(source.equals(lip.getBtnRefresh())) {
                
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if(currentView.equals("Sign Up Page")) {
            
        } else if (currentView.equals("Input Asset Page")) {
            
        } else if (currentView.equals("Laporan Pengajuan Page")) {
            
        }
    }
}
