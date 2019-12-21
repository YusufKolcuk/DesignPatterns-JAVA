package Yegane;

public class Yegane {
    private static Yegane yegane;
    private Yegane(){}
    public static Yegane TekNesne(){
        if(yegane==null){
            yegane=new Yegane();
        }
        return yegane;
    }

    public void deneme(){
        System.out.println("yegane tasarım deseni");
    }
}
