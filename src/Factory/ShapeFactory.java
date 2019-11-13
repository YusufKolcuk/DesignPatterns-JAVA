package Factory;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        else return null;

    }
}
