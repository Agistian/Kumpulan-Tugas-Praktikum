
public class Car {
    String carType;
    String polNum;
    String merk;
    boolean status;
    
    public Car(String carType, String polNum, String merk, boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }
    
    public String getPolNum(){
        return polNum;
    }
    
    public String getMerk(){
        return merk;
    }
    
//    public boolean isStatus(){
//        return status;
//    }
//    
//    public void setStatus(String status){
//        if(status.equals("0")){
//            this.status = false;
//        }else{
//            this.status = true;
//        }
//    }
}
