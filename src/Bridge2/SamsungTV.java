package Bridge2;

public class SamsungTV implements ITV{
    @Override
    public void on() {
        System.out.println("samsung tv is turned on");
    }

    @Override
    public void off() {
        System.out.println("samsung tv is turned off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("samsung channel : "+ channel);
    }
}
