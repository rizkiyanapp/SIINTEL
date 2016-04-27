/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.halamanPelapor;

import java.awt.event.ActionListener;
import view.halamanManager.*;

/**
 *
 * @author NANON
 */
public class lihatLaporan extends javax.swing.JPanel {

    /**
     * Creates new form lapMasuk
     */
    public lihatLaporan() {
        initComponents();
    }

    public Object getBtnRefresh() {
        return btnRefresh;
    }

    public void setListLap(String[] list) {
        listLap.setListData(list);
    }

    public void setTipeLap(String s) {
        txTipeLap.setText(s);
    }

    public void setAsset(String s) {
        txAsset.setText(s);
    }

    public void setQty(String s) {
        txQty.setText(s);
    }

    public void setLokasi(String s) {
        txLokasi.setText(s);
    }

    public void setDetail(String s) {
        txDetail.setText(s);
    }

    public void setStatLap(String s) {
        txStatLap.setText(s);
    }

    public void setStatAsset(String s) {
        txStatAsset.setText(s);
    }

    public void reset() {
        txTipeLap.setText("");
        txAsset.setText("");
        txQty.setText("");
        txLokasi.setText("");
        txDetail.setText("");
        txStatLap.setText("");
        txStatAsset.setText("");
    }
    
    public void addListener(ActionListener e) {
        btnRefresh.addActionListener(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listLap = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txTipeLap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txAsset = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txQty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txLokasi = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txDetail = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txStatLap = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txStatAsset = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("DAFTAR LAPORAN");

        jScrollPane1.setViewportView(listLap);

        jLabel2.setText("TIPE LAPORAN");

        txTipeLap.setEditable(false);

        jLabel3.setText("ASSET");

        txAsset.setEditable(false);

        jLabel4.setText("QTY");

        txQty.setEditable(false);

        jLabel5.setText("LOKASI");

        txLokasi.setEditable(false);

        btnRefresh.setText("REFRESH");

        jLabel6.setText("DETAIL");

        txDetail.setEditable(false);
        txDetail.setColumns(20);
        txDetail.setRows(5);
        jScrollPane2.setViewportView(txDetail);

        jLabel7.setText("STATUS LAPORAN");

        txStatLap.setEditable(false);

        jLabel8.setText("STATUS ASSET");

        txStatAsset.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txAsset)
                            .addComponent(txQty)
                            .addComponent(txLokasi)
                            .addComponent(txTipeLap)))
                    .addComponent(jScrollPane1)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txStatLap)
                            .addComponent(txStatAsset))))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txTipeLap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txStatLap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txAsset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txStatAsset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listLap;
    private javax.swing.JTextField txAsset;
    private javax.swing.JTextArea txDetail;
    private javax.swing.JTextField txLokasi;
    private javax.swing.JTextField txQty;
    private javax.swing.JTextField txStatAsset;
    private javax.swing.JTextField txStatLap;
    private javax.swing.JTextField txTipeLap;
    // End of variables declaration//GEN-END:variables
}
