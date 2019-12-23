package Mediator;

public class Radyo extends ElektronikAygıt {

    public Radyo(final Mediator arabulucu) {
        super(arabulucu);
        arabulucu.radyoEkle(this);
    }

    @Override
    public void çalıştır() {
        System.out.println("Radyo çalıştı.");
        arabulucu.radyoÇalıştır();
    }

    @Override
    public void durdur() {
        System.out.println("Radyo durdu.");
    }
}