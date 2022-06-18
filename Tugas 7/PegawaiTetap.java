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
public class PegawaiTetap extends Pegawai{
    private double upah;
    
    PegawaiTetap(String nama, String noKTP, double upah){
        setUpah(upah);
        setNama(nama);
        setNoKTP(noKTP);
    }
    public void setUpah(double upah){
        this.upah = upah;
    }
    public double getUpah(){
        return upah;
    }
    @Override
    public double gaji(){
        return upah;
    }
}
