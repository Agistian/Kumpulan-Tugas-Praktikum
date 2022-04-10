package SuratKaisar;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int n = sc.nextInt();
        String hasil = change(in, n);
        System.out.println(hasil);
    }
    public static String change(String in, int n){
        String huruf2 = "";
        for(int i = 0; i < in.length(); i++){
            char word = in.charAt(i);
            int huruf = word;
            int count = huruf + n;
            if(word >= 'a' && word <= 'z'){
                if(count > 122 ){
                     count = 96 + (count - 122);
                }
                    huruf2 += String.valueOf((char)count);   
            }else if(word >= 'A' && word <= 'Z'){
                if(count > 90 ){
                     count = 64 + (count - 90);
                }
                    huruf2 += String.valueOf((char)count); 
            }else{
                    huruf2 += String.valueOf(word);
            }
        }
        return huruf2;
    }
}