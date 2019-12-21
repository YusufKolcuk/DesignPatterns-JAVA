package Bridge2;

public class SonyTV implements ITV {
    @Override
    public void on() {
        System.out.println("sony tv is turned on");
    }

    @Override
    public void off() {
        System.out.println("sony tv is turned off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("sony channel : "+ channel);
    }
}
