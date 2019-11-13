package Tasarım_Desenleri_1;

public class bike implements Ivehicle{
    @Override
    public String aracVer(String marka) {
        System.out.println(marka+" bir bisiklet aldınız");
        return marka;
    }
}
