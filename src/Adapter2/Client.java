package Adapter2;

public class Client {
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        PlasticToyDuck toyDuck=new PlasticToyDuck();
        ToyDuck birdAdapter=new BirdAdapter(sparrow);

        System.out.println("sparrow");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("toyduck");
        toyDuck.squeak();

        System.out.println("birdAdapter");
        birdAdapter.squeak();
    }
}
