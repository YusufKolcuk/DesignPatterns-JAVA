package Mediator;

public class Televizyon extends ElektronikAygıt {

    public Televizyon(final Mediator arabulucu) {
        super(arabulucu);
        arabulucu.televizyonEkle(this);
    }

    @Override
    public void çalıştır() {
        System.out.println("Televizyon çalıştı.");
        arabulucu.televizyonÇalıştır();
    }

    @Override
    public void durdur() {
        System.out.println("Televizyon durdu.");
    }
}