/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import config.CounterObject;
//import java.util.ArrayList;
//import java.util.Date;

/**
 *
 * @author NANON
 */
public class Application {
    // Array List Container
//    private ArrayList<Barang> daftarBarang;
//    private ArrayList<String> daftarBarangAwal;
//    private ArrayList<String> laporan;
//    private ArrayList<ManagerInventaris> daftarManager;
//    private ArrayList<Pelapor> daftarPelapor;
//    private ArrayList<KoorInventaris> daftarKoorInventaris;
//    
//    private CounterObject counter;
//
//    public Application() {
//        
//        // Load from FileObject
//        if(daftarBarang == null)
//            daftarBarang = new ArrayList();
//        
//        if(daftarManager == null)
//            daftarManager = new ArrayList();
//        
//        if(daftarPelapor == null)
//            daftarPelapor = new ArrayList();
//        
//        if(daftarKoorInventaris == null)
//            daftarKoorInventaris = new ArrayList();
//        
//        if(counter == null)
//            counter = new CounterObject();
//        
//        
//    }
//    
//    // ------ Method Applications Manager -------- //
//    
//    public void addManager(String nama, Date birthday, String email, String username, String password, String NIP){
//        String nNIP =(counter.getnNIP() + 1);
//        ManagerInventaris manager = new ManagerInventaris(nama,birthday,email,username,password,nNIP);
//        daftarManager.add(manager);
//    }
//    
//    public ManagerInventaris getManagerByIndex(int idx){
//        try{
//            return daftarManager.get(idx);
//        }catch(Exception e){
//            return null;
//        }
//    }
//    
//    public ManagerInventaris getManagerByNIP(String NIP){
//        for(ManagerInventaris mng : daftarManager){
//            if(mng.getNIP().equals(NIP))
//                return mng;
//        }
//        return null;
//    }
//    
//    // ------ Method Applications KoorInventaris -------- //
//    
//    public void addKoor(String nama, Date birthday, String email, String username, String password, String NIP){
//        String nNIP =(counter.getnNIP() + 1);
//        KoorInventaris koor = new KoorInventaris(nama,birthday,email,username,password,nNIP);
//        daftarKoorInventaris.add(koor);
//    }
//    
//    public KoorInventaris getKoorByIndex(int idx){
//        try{
//            return daftarKoorInventaris.get(idx);
//        }catch(Exception e){
//            return null;
//        }
//    }
//    
//    public KoorInventaris getKoorByNIP(String NIP){
//        for(KoorInventaris koor : daftarKoorInventaris){
//            if(koor.getNIP().equals(NIP))
//                return koor;
//        }
//        return null;
//    }
//    
//    // ------ Method Applications Barang  -------- //
//    
//    public void addBarang(String IdBarang,String namaBarang,Date tanggalPembelian,String keterangan) {
//        String id = "BRG" + (counter.getnBarang()+ 1);
//        counter.incBarang();
//        Barang barang = new Barang(IdBarang,namaBarang,tanggalPembelian,keterangan);
//        daftarBarang.add(barang);
//    }
//    
//    public Barang getBarangByIdx(int idx){
//        try{
//            return daftarBarang.get(idx);
//        }catch(Exception e){
//            return null;
//        }
//    }
//    
//    public Barang getBarangById(String id){
//        for(Barang b: daftarBarang){
//            if (b.getIdBarang().equals(id))
//                return b;
//        }
//        return null;
//    }
//    
//    public Barang getBarangByNama(String nama){
//        for(Barang b: daftarBarang){
//            if (b.getNamaBarang().equals(nama))
//                return b;
//        }
//        return null;
//    }
//    
//    public boolean deleteBuku(String id){
//        Buku tempBuku = getBukuById(id);
//        if(tempBuku!=null){
//            daftarBuku.remove(tempBuku);
//            return true;
//        } else {
//            return false;
//        }
//            
//    }    
//    
//    public ArrayList<Buku> getAllBuku(){
//        return daftarBuku;
//    }
//    
//    // ------ Method Applications Anggota    -------- //
//
//    public String addAnggota(String name){
//        String id = "AGT" + (counter.getnAnggota()+ 1);
//        counter.incAnggota();
//        Anggota a = new Anggota(id, name);
////        a.setAlamat(alamat);
//        daftarAnggota.add(a);
//        return a.getId();
//    }
//    
//    public Anggota getAnggotaById(String id){
//        for(Anggota a: daftarAnggota){
//            if (a.getId().equals(id)){
//                return a;
//            }
//        }
//        return null;
//    }
//    
//    public Anggota getAnggotaByIndex(int idx){
//        try {
//            return daftarAnggota.get(idx);
//        } catch (Exception e) {
//            return null;
//        }
//    }
//    
//    public void deleteAnggotaById(String id){
//        for(Anggota a: daftarAnggota){
//            if(a.getId().equals(id)){
//                daftarAnggota.remove(a);
//                break;
//            }
//        }
//    }
//    
//    public ArrayList<Anggota> getAllAnggota(){
//        return daftarAnggota;
//    }
//    
//    //-------------- Saving it to File ------------//
//    
//    public void saveDataBarang(){
//        
//    }
//    
//    public void saveDataManager(){
//        try {
//            FileObject.saveListAnggota(daftarAnggota);
//            FileObject.saveCounter(counter);
//        } catch (Exception e) {
//            System.out.println("Save daftarAnggota error" + e);
//        }
//    }
//    
//    public void saveDataPetugas(){
//        try {
//            FileObject.saveListPetugas(daftarPetugas);
//            FileObject.saveCounter(counter);
//        } catch (Exception e) {
//            System.out.println("Save daftarPetugas error" + e);
//        }
//    }
}
