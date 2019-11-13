package Prototype;

public class ConcreatePrototype implements IPrototype {
    @Override
    public Object clone() {
        return new ConcreatePrototype();
    }
}
