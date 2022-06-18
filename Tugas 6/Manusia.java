package inheritance;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    static int nManusia = 0;
    Manusia(){
        
    }
    Manusia(String nama, String NIK, boolean menikah, boolean jenisKelamin){
        setNama(nama);
        setNIK(NIK);
        setJK(jenisKelamin);
        setMenikah(menikah);
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNIK(String NIK){
        this.NIK = NIK;
    }
    public void setJK(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }
    public String getNama(){
        return nama;
    }
    public String getNIK(){
        return NIK;
    }
    public boolean getJK(){
        return jenisKelamin;
    }
    public boolean getMenikah(){
        return menikah;
    }
    public double getTunjangan(){
        if(getMenikah() == true){
            if(getJK() == true){
                return 25.0;
            }else{
                return 20.0;
            }
        }else{
            return 15.0;
        }
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    public static int getBanyakManusia(){
        return nManusia;
    }
    public String toString(){
        nManusia++;
        String a = String.format("Nama\t\t:%s\nNIK\t\t:%s\n", getNama(), getNIK());
        String jk;
        if(getJK()== true)
            jk = "Laki-laki";
        else
            jk = "Perempuan";
        a+= String.format("Jenis Kelamin\t:%s\nPendapatan\t:%s$\n", jk, getPendapatan());
        a+=String.format("-------------------------");
        return a;
    }
}