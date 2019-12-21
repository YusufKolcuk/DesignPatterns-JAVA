package Adapter;
/**
 * Somut Adaptee sinifi
 */
public class WildTurkey implements Turkey {
    public void Turkeygobble() {
        System.out.println("Gobble gobble");
    }

    public void Turkeyfly() {
        System.out.println("I'm flying a short distance");
    }
}