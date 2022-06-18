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
public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;
    private static int nPegawai = 0;
    
    Sales(String nama, String noKTP, int penjualan, double komisi){
        setNama(nama);
        setNoKTP(noKTP);
        setPenjualan(penjualan);
        setKomisi(komisi);
    }
    public void setPenjualan(int penjualan){
        this.penjualan = penjualan;
    }
    public void setKomisi(double komisi){
        this.komisi = komisi;
    }
    public int getPenjualan(){
        return penjualan;
    }
    public double getKomisi(){
        return komisi;
    }
    @Override
    public double gaji(){
        return getPenjualan() * getKomisi();
    }
    public static int nPegawai(){
        return nPegawai;
    }
    @Override
    public String toString(){
        nPegawai++;
        String a = String.format("Pegawai ke\t: %d\nSales\t\t: %s\nNo. KTP\t\t: %s\nTotal Penjualan\t: %s\nBesaran Komisi\t: %s\nPendapatan\t: Rp %d\n",nPegawai(),getNama(),getNoKTP(),(double)getPenjualan(),getKomisi(),(int)gaji());
        return a;
    }
}
