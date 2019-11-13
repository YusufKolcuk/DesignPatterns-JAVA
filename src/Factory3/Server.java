package Factory3;

public class Server extends Computer {
    @Override
    public String getRAM() {
        return "120gb";
    }

    @Override
    public String getCPU() {
        return "i9";
    }

    @Override
    public String getHDD() {
        return "240tb";
    }
}
