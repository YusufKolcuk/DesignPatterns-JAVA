package Factory2;

public class kucukOto extends OtoFabrikasi{
    @Override
    protected Otomobil otoYarat(String s) {
        if(s.equals("Binek")) return new mercedes();
        else if(s.equals("Ticari")) return null;
        else return null;

    }
}
