package AbstractFactory;

public class PMWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }
}
