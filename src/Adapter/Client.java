package Adapter;

public class Client {

    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.Turkeygobble();
        turkey.Turkeyfly();

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck) {
        duck.Duckquack();
        duck.Duckfly();
    }
}
