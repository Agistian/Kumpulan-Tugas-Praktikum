package inheritance;

public class Mahasiswa extends Manusia {
    private String NIM;
    private double IPK;
    static int nMahasiswa = 0;
    
    Mahasiswa(String nama, String NIK, boolean menikah, boolean jenisKelamin, String NIM, double IPK){
        setNama(nama);
        setNIK(NIK);
        setJK(jenisKelamin);
        setMenikah(menikah);
        setNIM(NIM);
        setIPK(IPK);
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public void setIPK(double IPK){
        this.IPK = IPK;
    }
    public String getNIM(){
        return NIM;
    } 
    public double getIPK(){
        return IPK;
    }
    public String getStatus(){
        String a = "20", jurusan = "";
        a += getNIM().substring(0,2);
        switch(getNIM().substring(6,7)){
            case "2":
                jurusan = "Teknik Meniup Gelembung";
                break;
            case "3":
                jurusan = "Teknik Berburu Ubur Ubur";
                break;
            case "4":
                jurusan = "Sistem Perhamburgeran";
                break;
            case "6":
                jurusan = "Pendidikan Chum Bucket";
                break;
            case "7":
                jurusan = "Teknologi Telepon Kerang";
                break;
        }
        return (jurusan +","+ a);
    }
    public double getBeasiswa(){
        if(getIPK() <= 4.0 && getIPK() >= 3.5){
            return 75.0;
        }else if(getIPK() < 3.5 && getIPK() >= 3.0){
            return 50.0;
        }
        return 0.0;
    }
    public static int getBanyakMahasiswa(){
        return nMahasiswa;
    }
    public String toString(){
        nMahasiswa++;
        String a = String.format("Nama\t\t:%s\nNIK\t\t:%s\n", getNama(), getNIK());
        String jk;
        if(getJK()== true)
            jk = "Laki-laki";
        else
            jk = "Perempuan";
        a+= String.format("Jenis Kelamin\t:%s\nPendapatan\t:%s$\nIPK\t\t:%s\nNIM\t\t:%s\nStatus\t\t:%s\n", jk, getBeasiswa()+getPendapatan(), getIPK(),getNIM(), getStatus());
        a+= String.format("---------------------------");
        return a;
    }
}
