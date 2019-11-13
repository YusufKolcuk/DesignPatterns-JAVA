package AbstractFactory;

public class PMWindow implements Window {
    @Override
    public void repaint() {
        System.out.println("PMWindow#repaint");
    }
}
