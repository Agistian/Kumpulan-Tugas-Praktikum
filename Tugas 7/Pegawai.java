/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author DELL 5289
 */
public class Pegawai {
    private String nama;
    private String noKTP;
    private static int nPegawai = 0;
    
    Pegawai(){
        
    }
    Pegawai(String nama, String noKTP){
        setNama(nama);
        setNoKTP(noKTP);
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNoKTP(String noKTP){
        this.noKTP = noKTP;
    }
    public String getNama(){
        return nama;
    }
    public String getNoKTP(){
        return noKTP;
    }
    public double gaji(){
        return 0;
    }
    public static int getPegawai(){
        return nPegawai;
    }
    public String toString(){
        nPegawai++;
        String a = String.format("Pegawai ke\t: %d\nPegawai Tetap\t: %s\nNo. KTP\t\t: %s\nUpah\t\t: %s\nPendapatan\t: Rp %d\n",getPegawai(),getNama(),getNoKTP(),gaji(), (int)gaji());
        return a;
    }
}
