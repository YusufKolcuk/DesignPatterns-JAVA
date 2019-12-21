package Prototip;

public class PrototipKlon implements IPrototip {
    @Override
    public Object clone() {
        return new PrototipKlon();
    }
}
