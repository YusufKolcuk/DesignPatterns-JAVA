package AbstractFactory;

public class MotifWindow implements Window {
    @Override
    public void repaint() {
        System.out.println("MotifWindow#repaint");
    }
}
