package HitungLuas;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int sisi, alas, tinggi, r, result, hasil = 0;
        if(choice == 1){
             sisi = sc.nextInt();
             result = luas(sisi, hasil);
             System.out.println(result);

        }else if(choice == 2){
              alas = sc.nextInt();
              tinggi = sc.nextInt();
              result = luas(alas, tinggi, hasil);
             System.out.println(result);
        }else if(choice == 3){
              r = sc.nextInt();
              result = lingkaran(r, hasil);
              System.out.println((double)result);
        }else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    public static int luas(int sisi, int hasil){
        hasil = sisi * sisi;
        return hasil;
    }
    public static int luas(int alas, int tinggi, int hasil){
        hasil = (int)(0.5 * alas * tinggi);
        return hasil;
    }
    public static int lingkaran(int r, int hasil){
        if(r % 7 == 0){
             hasil = ( 22/7 * r * r);
        }else{
             hasil =(int)(3.14 * r * r);
        }
        return hasil;
    }
}