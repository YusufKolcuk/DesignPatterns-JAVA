package AbstractFactory2;

public class Malbora implements ISigara {
    @Override
    public void nikotin(int nkt) {
        System.out.println("s1 fabrikasi tarafindan uretilen malbora, nikotin miktari : "+ nkt);
    }
}
