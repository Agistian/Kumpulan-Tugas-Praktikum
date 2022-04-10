import java.util.*;

class Baju {
    String jenis;
    int harga;
    int jumlah;
    
    public Baju(String a, int b){
        this.jenis = a;
        this.jumlah = b;
    }
    
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;
    
    void hargaa(){
        if(jumlah > 100){
            harga = 95000;
        }else{
            harga = bajua;
        }
    }
    
    void hargab(){
        if(jumlah > 100){
            harga = 120000;
        }else{
            harga = bajub;
        }
    }
    
    void hargac(){
        if(jumlah > 100){
            harga = 160000;
        }else{
            harga = bajuc;
        }
    }
    
    void display(){
        if(jenis.equalsIgnoreCase("a")){
            hargaa();
        }else if(jenis.equalsIgnoreCase("b")){
            hargab();
        }else{
            hargac();
        }
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + (harga * jumlah));
    }
}

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000" );
        System.out.println("Baju B dengan harga 125000" );
        System.out.println("Baju C dengan harga 175000" );
        System.out.print("Baju yang akan anda beli bertipe : ");
        String a = sc.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        int b = sc.nextInt();
        Baju baju = new Baju(a, b);
        baju.display();
    }
}