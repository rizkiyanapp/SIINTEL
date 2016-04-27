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
public abstract class Employee {
    private String nama;
    private Date birthday;
    private String email;
    private String username;
    private String password;
    private String NIP;

    public Employee(String nama, Date birthday, String email, String username, String password, String NIP) {
        this.nama = nama;
        this.birthday = birthday;
        this.email = email;
        this.username = username;
        this.password = password;
        this.NIP = NIP;
    }

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    
    
    
}
