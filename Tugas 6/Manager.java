package inheritance;


public class Manager extends Pekerja{
    private int lamaKerja;
    static int nManager = 0;
    
    Manager(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean menikah, boolean jenisKelamin, int lamaKerja){
        setJamKerja(jamKerja);
        setHariKerja(hariKerja);
        setNIP(NIP);
        setNama(nama);
        setNIK(NIK);
        setMenikah(menikah);
        setJK(jenisKelamin);
        setLamaKerja(lamaKerja);
        setGaji();
        setBonus();
        
    }
    public void setLamaKerja(int lamaKerja){
        this.lamaKerja = lamaKerja;
    }
    public int getLamaKerja(){
        return lamaKerja;
    }
    public double getBonusManager(){
        return getBonus() * 0.30;
    }
    public static int getBanyakManager(){
        return nManager;
    }
    public String toString(){
        nManager++;
        String a = String.format("Nama\t\t:%s\nNIK\t\t:%s\nNIP\t\t:%s\n", getNama(), getNIK(),getNIP());
        String jk;
        if(getJK()== true)
            jk = "Laki-laki";
        else
            jk = "Perempuan";
        a+= String.format("Jenis Kelamin\t:%s\nPendapatan\t:%s$\nBonus\t\t:%s$\nGaji\t\t:%s$\nStatus\t\t:%s\nLama Kerja\t:%s hari\n", jk, getPendapatan()+getBonus()+getBonusManager()+getGaji()+15, (getBonus()+getBonusManager()),getGaji(), getStatus(), getLamaKerja());
        a+= String.format("-------------------------"); 
        return a;
    }
}
