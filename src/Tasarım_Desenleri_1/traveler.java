package Tasarım_Desenleri_1;

public class traveler {
    Ivehicle ıvehicle;

    traveler(Ivehicle ıvehicle){
        this.ıvehicle=ıvehicle;

    }

    public void yolculuk(){
        String yolculukaraci=ıvehicle.aracVer("honda");
        System.out.println("YOLCULUGUNUZ BASLADI ARACINIZ  " + yolculukaraci);
    }
}
