package OperClosePrinciple;

public class BMW implements Araba{

    String model =  "BMW";
    int tripKm = 50;
    int dolarPerKm = 2;


    public void go(){
        System.out.println("BMW gidiyor");
    }

    public void stop(){
        System.out.println("BMW duruyor");
    }

}


