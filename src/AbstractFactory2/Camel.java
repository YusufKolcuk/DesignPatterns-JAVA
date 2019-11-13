package AbstractFactory2;

public class Camel implements ISigara {
    @Override
    public void nikotin(int nkt) {
        System.out.println("s2 fabrikasi tarafindan uretilen Camel, nikotin miktari : "+nkt);
    }
}
