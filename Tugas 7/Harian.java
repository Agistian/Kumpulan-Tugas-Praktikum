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
public class Harian extends Pegawai{
    private double upahPerJam;
    private int totalJam;
    private static int nPegawai = 0;
    
    Harian(String nama, String noKTP, double upahPerJam, int totalJam){
        setNama(nama);
        setNoKTP(noKTP);
        setUpahPerJam(upahPerJam);
        setTotalJam(totalJam);
    }
    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }
    public void setTotalJam(int totalJam){
        this.totalJam = totalJam;
    }
    public double getUpahPerJam(){
        return upahPerJam;
    }
    public int getTotalJam(){
        return totalJam;
    }
    @Override
    public double gaji(){
        if(getTotalJam() <= 40){
            return getTotalJam() * getUpahPerJam();
        }
        return ((40 * getUpahPerJam()) + ((getTotalJam() - 40)*getUpahPerJam())) * 1.5;
    }
    public static int nPegawai(){
        return nPegawai;
    }
    @Override
    public String toString(){
        nPegawai++;
        String a = String.format("Pegawai ke\t: %d\nPegawai Harian\t: %s\nNo. KTP\t\t: %s\nUpah/jam\t: %s\nTotal Jam Kerja\t: %s\nPendapatan\t: Rp %d\n",nPegawai(),getNama(),getNoKTP(),getUpahPerJam(),(double)getTotalJam(),(int)gaji());
        return a;
    }
}
