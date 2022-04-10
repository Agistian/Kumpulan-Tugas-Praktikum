import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama    : Muhammad Dhzuhri Agistian");
        System.out.println("NIM     : 215150600111020");
        System.out.println("----------------------------------------");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid","Bakso",8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes","Nasi Goreng Jawa",10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros","Ayam Kota Ekstra Nasi",10000));
        DataMerchant.tampilData();
        System.out.println();
        
        //coding u/ tambah data merchant
        int kon = 0;
        while(kon == 0){
            System.out.println("Mau tambah merchant baru ? (y/n)");
            String jawab = sc.nextLine();
            if(jawab.equalsIgnoreCase("y")){
                System.out.println("==Tambah Merchant Baru==");
                System.out.print("Nama Merchant   : ");
                String a = sc.nextLine();
                System.out.print("Nama Produk     : ");
                String b = sc.nextLine();
                System.out.print("Harga           : ");
                int c = sc.nextInt(); sc.nextLine();
                DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(a,b,c));
                System.out.println();
                DataMerchant.tampilData();
            }else{
                kon = 1;
            }
        }
        
//        //coding u/ menampilkan merchant
        int stat = 0;
        while(stat == 0){
            System.out.println("Mau mencari merchant ? (y/n)");
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase("n")){
                stat = 1;
            }else{
                System.out.print("Cari merchant   : ");
                String nama = sc.nextLine();
                if(DataMerchant.cariMerchant(nama) == null){
                    System.out.println("Merchant tidak diketahui");
                }else{
                    DataMerchant.tampilMerchant(DataMerchant.cariMerchant(nama));
                }
            }
        }
        
//        //coding u/ update merchant
        int kond = 0;
        while(kond == 0){
            System.out.println("Mau update merchant ? (y/n)");
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase("n")){
                kond = 1;
            }else{
                System.out.print("Cari merchant   : ");
                String nama = sc.nextLine();
                if(DataMerchant.cariMerchant(nama) == null){
                    System.out.println("Merchant tidak diketahui");
                }else{
                    DataMerchant.updateMerchant(DataMerchant.cariMerchant(nama));
                }
            }
        }
    }
}
