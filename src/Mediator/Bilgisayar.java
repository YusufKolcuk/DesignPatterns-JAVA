package Mediator;

public class Bilgisayar extends ElektronikAygıt {

    public Bilgisayar(final Mediator arabulucu) {
        super(arabulucu);
        arabulucu.bilgisayarEkle(this);
    }

    @Override
    public void çalıştır() {
        System.out.println("Bilgisayar çalıştı.");
        arabulucu.bilgisayarÇalıştır();
    }

    @Override
    public void durdur() {
        System.out.println("Bilgisayar durdu.");
    }
}