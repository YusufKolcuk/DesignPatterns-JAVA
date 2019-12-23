package Facade2;

public class ArabaYap {
    private Ferrari ferrari;
    private Audi audi;
    private Mercedes mercedes;

    public ArabaYap(){
        ferrari=new Ferrari();
        audi=new Audi();
        mercedes=new Mercedes();
    }
    public void fer(){
        ferrari.hiz();
    }
    public void aud(){
        audi.hiz();
    }
    public void merc(){
        mercedes.hiz();
    }
}
