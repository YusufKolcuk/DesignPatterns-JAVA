package AbstractFactory;

public class PMScrollBar implements ScrollBar {
    @Override
    public void setMax(int max) {
        System.out.println("PMScrollBar#setMax: "+max);
    }
}
