package Factory2;

public abstract class OtoFabrikasi {
    public  Otomobil ozellikleriYaz(String s){
        Otomobil oto=otoYarat(s);
        String sonuc=s+" kisi adedi: "+oto.getKapasite()+" yakit tuketimi: "+oto.getTuketim();
        System.out.println(sonuc);
        return oto;
    }
    protected abstract Otomobil otoYarat(String s);
}
