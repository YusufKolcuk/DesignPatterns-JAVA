package Singleton2;

public class Singleton { //çift kilitleme mekanizmasi kullanilarak gec olusturma

    private static Singleton singleton;
    private Singleton(){ }

    public synchronized static Singleton setSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class){
                if(singleton==null) {
                    System.out.println("first call");
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    public void trial(){
        System.out.println("singleton one object");
    }

}
