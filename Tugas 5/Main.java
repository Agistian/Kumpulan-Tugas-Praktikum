
public class Main {
    public static void main(String[] args){
        CarRider ming = new CarRider("Lin Ming", 19, "08000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "08111111");
        CarRider ling = new CarRider("Ling'er", 31, "08122222");
        CarRider agis = new CarRider("Agistian", 22, "08765999");
        
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB","Suzuki");
        data.addCar("SPORT", "N 4444 AB","Lamborghini");
        
        data.listOfCar();
        
        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        arsip.Rent(agis, data.carList.get(2), 1);
        
        System.out.println("");
        arsip.info();
    }
}
