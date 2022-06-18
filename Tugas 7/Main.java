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
public class Main {
    public static void main(String[] args){
        Pegawai pt1 = new PegawaiTetap("Bayu","350728490327424892342",2000000);
        Pegawai pt2 = new PegawaiTetap("Jessica","350726710327424895514",2450000);
        Pegawai pt3 = new PegawaiTetap("Dwi","350729900327424893389",2600000);
        Pegawai ph1 = new Harian("Edo","350728490327424892342", 8500, 40);
        Pegawai ph2 = new Harian("Andre","350726710327424895514",9000, 35);
        Pegawai ph3 = new Harian("Dias","350729900327424893389",7500, 50);
        Pegawai s1 = new Sales("Tika", "350729900327424893389",50,50000);
        Pegawai s2 = new Sales("Yayan", "350726710327424895514",35,45000);
        Pegawai s3 = new Sales("Dika", "350729900327424893389",60,60000);
        
        //output
        System.out.println("=====Data Pegawai Tetap=====");
        System.out.println(pt1.toString());
        System.out.println(pt2.toString());
        System.out.println(pt3.toString());
        System.out.println("=====Data Pegawai Harian=====");
        System.out.println(ph1.toString());
        System.out.println(ph2.toString());
        System.out.println(ph3.toString());
        System.out.println("=========Data Sales=========");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        
    }
}
