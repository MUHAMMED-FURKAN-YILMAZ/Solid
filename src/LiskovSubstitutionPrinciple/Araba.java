package LiskovSubstitutionPrinciple;

public class Araba {


    public void go(){
        System.out.println("Araba gidiyor");
    }

    public void stop(){
        System.out.println("Araba duruyor");
    }

    public void sendSms(){
        System.out.println("sms");
    }

    public void sendEmail(){
        System.out.println("email");
    }


}
