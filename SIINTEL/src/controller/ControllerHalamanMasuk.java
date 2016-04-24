/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Application;
import view.halamanMasuk.mainPage;
import view.halamanMasuk.signInPage;
import view.halamanMasuk.signUpPage;

/**
 *
 * @author NANON
 */
public class ControllerHalamanMasuk extends MouseAdapter implements ActionListener{
    private Application model;
    private mainPage view;
    
    private String currentView;
    private JPanel mainPanel;
    
    private signInPage sip;
    private signUpPage sup;
    
    public ControllerHalamanMasuk(Application model) {
        this.model = model;
        this.view = new mainPage();
        
        sip = new signInPage();
        sup = new signUpPage();
        
        view.addListener(this);
        sip.addListener(this);
        sup.addListener(this);
        sup.addAdapter(this);
        
        mainPanel = view.getMenuPanel();
        mainPanel.add(sip, "Sign In Page");
        mainPanel.add(sup, "Sign Up Page");
        currentView = "Sign In Page";
        
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
        }
        
        if (currentView.equals("Sign In Page")) {
            if (source.equals(sip.getBtnSingIn())) {
                
            }
        } else if (currentView.equals("Sign Up Page")) {
            if (source.equals(sup.getBtnSignUp())) {
                
            }
        }
    }
}
