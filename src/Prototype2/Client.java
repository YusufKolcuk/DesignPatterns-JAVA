package Prototype2;

public class Client {
    public static void main(String[] args) {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("blue").addColor();

        ColorStore.printColorMap();
        Color cblue=ColorStore.getColor("blue");
        Color cblue1=ColorStore.getColor("blue");
        Color cblue2=ColorStore.getColor("blue");
        System.out.println(cblue);
        System.out.println(cblue1);
        System.out.println(cblue2);
    }
}
