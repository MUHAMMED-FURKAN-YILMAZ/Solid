package OperClosePrinciple;

public class Mercedes implements Araba{

    String model = "Mercedes";
    int tripKm= 50; // Kac km yaptigini tutan degisken
    int dolarPerKm = 3;

    public void go(){
        System.out.println("Mercedes gidiyor");
    }

    public void stop(){
        System.out.println("Mercedes duruyor");
    }

}
