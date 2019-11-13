package Singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("object");
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void  doOperation(){
        System.out.println("singleton design patterns");
    }


}
