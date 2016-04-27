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
public class ManagerInventaris extends Employee{
    private String type = "Manager Inventaris";

    public ManagerInventaris(String nama, Date birthday, String email, String username, String password, String NIP) {
        super(nama, birthday, email, username, password, NIP);
    }

    public void accLaporan(Laporan lap,boolean accManager){
        if (accManager==true){
            lap.setAcc(accManager);
            lap.setStatKoor(accManager);
        }
    }
}