package Bridge;

public class Client {
    public static void main(String[] args) {
        Shape redOne = new Circle(100,100, 10, new RedCircle());
        Shape greenOne = new Circle(100,100, 10, new GreenCircle());

        redOne.draw();
        greenOne.draw();
    }
}
