package Prototype;

public class Client {
    public static void main(String[] args) {
        ConcreatePrototype obj1=new ConcreatePrototype();
        ConcreatePrototype obj2= (ConcreatePrototype) obj1.clone();
    }
}
