package inheritance;


public class Main {
    public static void main(String[] args){
        Manusia man1 = new Manusia("Andre", "391123842934",true, true);
        Manusia man2 = new Manusia("Dinda", "391145912940",true, false);
        Manusia man3 = new Manusia("Ajeng", "391145911135",false, false);
        Mahasiswa mhs1 = new Mahasiswa("I Putu Yoga", "351923848239", false, true, "205150601111018",3.70);
        Mahasiswa mhs2 = new Mahasiswa("David S", "351923848507", false, true, "195150701111018",3.40);
        Mahasiswa mhs3 = new Mahasiswa("Rini H", "351923848112", false, false, "215150301111018",2.56);
        Pekerja pekerja1 = new Pekerja(7, 22,"195102439283", "Iqbal Biondy", "351717969", true,true);
        Pekerja pekerja2 = new Pekerja(11, 15,"492102739283","Yanurin Jayadi", "351719113", true,false);
        Pekerja pekerja3 = new Pekerja(9, 5,"793102939283", "Isnaini Syah", "351717433", true, false);
        Manager manager1 = new Manager(9, 20,"204837283728", "Lyra Hertin", "351707384392",false, false, 1500);//20*9*15 //15*2*7 //5*9*20
        Manager manager2 = new Manager(10, 17,"50583263728", "Dimas Anggara", "351707384392",false, true, 2000);
        Manager manager3 = new Manager(9, 20,"301837443728", "Yusuf Perkasa", "351707384392",true, true, 100);
        //output
        System.out.println("======Objek Manusia======");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(man3.toString());
        System.out.println("Total objek manusia : " + Manusia.getBanyakManusia());
        System.out.println("======Objek Mahasiswa======");
        System.out.println(mhs1.toString());
        System.out.println(mhs2.toString());
        System.out.println(mhs3.toString());
        System.out.println("Total objek mahasiswa : " + Mahasiswa.getBanyakMahasiswa());
        System.out.println("======Objek Pekerja======");
        System.out.println(pekerja1.toString());
        System.out.println(pekerja2.toString());
        System.out.println(pekerja3.toString());
        System.out.println("Total objek pekerja : " + Pekerja.getBanyakPekerja());
        System.out.println("======Objek Manager======");
        System.out.println(manager1.toString());
        System.out.println(manager2.toString());
        System.out.println(manager3.toString());
        System.out.println("Total objek Manager : " + Manager.getBanyakManager());

    }
}
