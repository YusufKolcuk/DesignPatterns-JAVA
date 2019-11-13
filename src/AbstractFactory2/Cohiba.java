package AbstractFactory2;

public class Cohiba implements IPuro {
    @Override
    public void kalinlik(int byt) {
        System.out.println("s2 fabrikasi tarafindan uretilen Cohiba, puronun kalinligi : "+byt);
    }
}
