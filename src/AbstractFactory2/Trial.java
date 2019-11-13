package AbstractFactory2;

public class Trial {
    public static void main(String[] args) {
        TutunFabrika tutunFabrika=new s1Factory();
        TutunFabrika tutunFabrika2=new s2Factory();
        tutunFabrika.createPuro().kalinlik(5);
        tutunFabrika.createSigara().nikotin(100);
        tutunFabrika2.createSigara().nikotin(200);
        tutunFabrika2.createPuro().kalinlik(7);

    }
}
