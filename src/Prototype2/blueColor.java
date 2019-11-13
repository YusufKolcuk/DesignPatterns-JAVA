package Prototype2;

public class blueColor extends Color {
    public blueColor(){
        this.colorName="blue";
    }

    @Override
    void addColor() {
        System.out.println("blue color added");
    }
}
