package Adapter;
/**
 * Adapter sinifi
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void Duckquack() {
        turkey.Turkeygobble();
    }

    public void Duckfly() {
        turkey.Turkeygobble();
    }
}