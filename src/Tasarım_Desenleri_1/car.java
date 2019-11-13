package Tasarım_Desenleri_1;

public class car implements Ivehicle {

    @Override
    public String aracVer(String marka) {
        System.out.println(marka+ " bir araba aldınız");
        return marka;
    }
}
