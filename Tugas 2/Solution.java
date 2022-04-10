import java.io.*;
import java.util.*;

class Persegi{
    int hasil;
        int luas(int sisi){
            hasil = sisi*sisi;
            return hasil;
        }
}
class Segitiga{
    int hasil;
        int luas(int a, int t){
            hasil = (int)(0.5 * a * t);
            return hasil;
        }
}
class Lingkaran{
    int hasil;
     int luas(int r){
         if(r % 7 == 0){
             hasil = ( 22/7 * r * r);
        }else{
             hasil =(int)(3.14 * r * r);
        }
        return hasil;
     }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int sisi, a, t, r;
        if (choice == 1){
            sisi = sc.nextInt();
            Persegi persegi = new Persegi();
            System.out.println(persegi.luas(sisi));
        }else if(choice == 2){
            a = sc.nextInt();
            t = sc.nextInt();
            Segitiga segitiga = new Segitiga();
            System.out.println(segitiga.luas(a, t));
        }else if(choice == 3){
            r = sc.nextInt();
            Lingkaran lingkaran = new Lingkaran();
            System.out.println((double)(lingkaran.luas(r)));
        }else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
