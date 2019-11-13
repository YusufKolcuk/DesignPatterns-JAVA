package Factory;

public class Trial {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();
        Shape shape2=ShapeFactory.getShape("rectangle");
        shape2.draw();
        Shape shape3=ShapeFactory.getShape("square");
        shape3.draw();

    }
}
