package Mediator;

public class Mediator {
    private Bilgisayar bilgisayar;
    private Televizyon televizyon;
    private Radyo radyo;

    public void bilgisayarEkle( Bilgisayar bilgisayar) {
        this.bilgisayar = bilgisayar;
    }

    public void radyoEkle( Radyo radyo) {
        this.radyo = radyo;
    }

    public void televizyonEkle( Televizyon televizyon) {
        this.televizyon = televizyon;
    }

    public void bilgisayarÇalıştır() {
        // Bilgisayar çalıştığında, diğer aygıtların durması isteniyor.
        televizyon.durdur();
        radyo.durdur();
    }

    public void radyoÇalıştır() {
        // Radyo çalıştığında, diğer aygıtların durması isteniyor.
        bilgisayar.durdur();
        televizyon.durdur();
    }

    public void televizyonÇalıştır() {
        // Televizyon çalıştığında, diğer aygıtların durması isteniyor.
        bilgisayar.durdur();
        radyo.durdur();
    }

}
