package AbstractProduct;

public class Trial {
    public static void main(String[] args) {
        AbstractFactory nesne=new ConcreateFactory1();
        AbstractProductA a1=nesne.createProductA();
        a1.HelloA();
    }
}
