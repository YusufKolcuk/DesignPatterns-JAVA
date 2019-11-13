package Factory3;

public class PC extends Computer{
    @Override
    public String getRAM() {
        return "8GB";
    }

    @Override
    public String getCPU() {
        return "i7";
    }

    @Override
    public String getHDD() {
        return "1tb";
    }
}
