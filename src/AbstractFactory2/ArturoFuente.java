package AbstractFactory2;

public class ArturoFuente implements IPuro {
    @Override
    public void kalinlik(int byt) {
        System.out.println("s1 fabrikasindan uretilen arturofuente, puronun kalinligi : "+byt);
    }
}
