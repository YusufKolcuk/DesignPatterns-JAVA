package Mediator;

public abstract class ElektronikAygıt {

    protected Mediator arabulucu;

    public ElektronikAygıt(Mediator arabulucu) {
        this.arabulucu = arabulucu;
    }

    public abstract void çalıştır();

    public abstract void durdur();
}