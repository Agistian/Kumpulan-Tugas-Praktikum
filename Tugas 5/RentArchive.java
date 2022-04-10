import java.util.ArrayList;

public class RentArchive {
    ArrayList<CarRent> rentData = new ArrayList<CarRent>();
    
    public void Rent(CarRider rider, Car car, int rentDur){
       if(car.status == false){
           System.out.println("MAAF, MOBIL SUDAH DISEWA");
       }else{
           System.out.println("MOBIL BERHASIL DISEWA");
           car.status = false;
           rentData.add(new CarRent(rider, car, rentDur));
       }
    }
    
    public void info(){
        System.out.println("-----------------------------");
        System.out.println(" INFORMASI PELANGGAN");
        System.out.println("-----------------------------");
        for(CarRent data : rentData){
            System.out.println("NAMA PEMINJAM : " + data.getRider().getName());
            System.out.println("TIPE MOBIL    : " + data.getCar().getMerk());
            System.out.println("NO. POLISI    : " + data.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " + data.getRentDur());
            System.out.println("-----------------------------");
        }
        
    }
}
