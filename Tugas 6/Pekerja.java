package inheritance;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    static int nPekerja = 0;
    
    Pekerja(){
        
    }
    Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean menikah, boolean jenisKelamin){
        setJamKerja(jamKerja);
        setHariKerja(hariKerja);
        setNIP(NIP);
        setNama(nama);
        setNIK(NIK);
        setMenikah(menikah);
        setJK(jenisKelamin);
        setGaji();
        setBonus();
    }
    
    public void setGaji(){
        this.gaji = (getHari() * getJam() * 15.0);
    }
    public void setBonus(){
        
        double lembur = (((getHari() / 7) * 7 + (getHari() % 7))*(getJam() - 7)* 15); 
        double libur = ((getHari() / 7 )* 2 * getJam() * 20);
        if(getJam() <= 7){
            this.bonus = libur;
        }else{
            this.bonus = lembur + libur;
        }
        //        if(getHari()%7 == 7){
//            lembur += (getHari()%7 - 2);
//        }else if(getHari()%7 == 6){
//            lembur += (getHari()%7 - 1);
//        }else{
//            lembur += (getHari()%7);
//        }
//        lembur *= (getJam() - 7)* 7;
//        if(getHari()%7 > 5){
//            libur += (getHari()%7 - 5);
//        }
//        libur *= getJam()*20;
    }
    public void setJamKerja(int jamKerja){
        this.jamKerja = jamKerja;
    }
    public void setHariKerja(int hariKerja){
        this.hariKerja = hariKerja;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    public double getGaji(){
        return gaji;
    }
    public int getHari(){
        return hariKerja;
    }
    public int getJam(){
        return jamKerja;
    }
    public double getBonus(){
        return bonus;
    }
    public String getNIP(){
        return NIP;
    }
    public String getStatus(){
        String kantor = "", cab, dep = "";
        switch(getNIP().substring(0,1)){
            case "1":
                kantor = "Mondstadt";
                break;
            case "2":
                kantor = "Liyue";
                break;
            case "3":
                kantor = "Inazuma";
                break;
            case "4":
                kantor = "Sumeru";
                break;
            case "5":
                kantor = "Fontaine";
                break;
            case "6":
                kantor = "Natlan";
                break;
            case "7":
                kantor = "Snezhnaya";
                break;
        }
        cab = getNIP().substring(2,3);
        switch(getNIP().substring(6,7)){
            case "1":
                dep = "Pemasaran";
                break;
            case "2":
                dep = "Humas";
                break;
            case "3":
                dep = "Riset";
                break;
            case "4":
                dep = "Teknologi";
                break;
            case "5":
                dep = "Personalia";
                break;
            case "6":
                dep = "Akademik";
                break;
            case "7":
                dep = "Administrasi";
                break;
            case "8":
                dep = "Operasional";
                break;
            case "9":
                dep = "Pembangunan";
                break;
        }
        return dep + "," + kantor + " cabang ke-"+ cab;
    }
    public static int getBanyakPekerja(){
        return nPekerja;
    }
    public String toString(){
        nPekerja++;
        String a = String.format("Nama\t\t:%s\nNIK\t\t:%s\nNIP\t\t:%s\n", getNama(), getNIK(),getNIP());
        String jk;
        if(getJK()== true)
            jk = "Laki-laki";
        else
            jk = "Perempuan";
        a+= String.format("Jenis Kelamin\t:%s\nPendapatan\t:%s$\nBonus\t\t:%s$\nGaji\t\t:%s$\nStatus\t\t:%s\n", jk, getPendapatan()+getBonus()+getGaji(), getBonus(),getGaji(), getStatus());
        a+= String.format("-------------------------");
        return a;
    }
    
}
