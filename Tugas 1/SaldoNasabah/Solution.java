package SaldoNasabah;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tab = sc.nextInt();
        int baru = sc.nextInt();
        int uang = tab + baru;
        // double hasil = 0.05 * (uang - 7000) / 100;
        // System.out.print(hasil);
        double hasil = akhir(uang);
        System.out.print(hasil);
        
    }
    public static double akhir(int uang){
        double result = (uang - 7000);
        double result2 = result + (0.05 * (uang - 7000) / 100);
        return result2;
    }
}