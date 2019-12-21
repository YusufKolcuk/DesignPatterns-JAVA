package Bridge2;

public class Client {
    public static void main(String[] args) {
        ITV tv=new SonyTV();
        LogitechRemoteContro logitechRemoteContro=new LogitechRemoteContro(tv);
        logitechRemoteContro.setChannelKeyboard(100);
    }
}
