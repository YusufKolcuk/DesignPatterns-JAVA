package Mediator;

public class Client {
    public static void main(final String[] args) {
        // Arabulu sınıf yaratılır.
        final Mediator arabulucu = new Mediator();

        // Arabulucu sınıfı içeren nesneler yaratılıyor ve bir
        // dizine ekleniyor. Bu nesneler arasındaki haberleşmeyi
        // ortak Arabulucu sınıf sağlayacak.
        final ElektronikAygıt[] aygıtlar = new ElektronikAygıt[3];
        aygıtlar[0] = new Bilgisayar(arabulucu);
        aygıtlar[1] = new Televizyon(arabulucu);
        aygıtlar[2] = new Radyo(arabulucu);

        // Her bir aygıtı çalıştır.
        for (final ElektronikAygıt aygıt : aygıtlar) {
            aygıt.çalıştır();
        }
    }
}
