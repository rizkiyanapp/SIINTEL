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
    private String name;
    private Date birth;
    private String email;
    private String username;
    private String password;
    private String NIP;
    private String type;

    public Employee(String nama, Date birthday, String email, String username, String password, String NIP, String type) {
        this.name = nama;
        this.birth = birthday;
        this.email = email;
        this.username = username;
        this.password = password;
        this.NIP = NIP;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String nama) {
        this.name = nama;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birthday) {
        this.birth = birthday;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
        
}
