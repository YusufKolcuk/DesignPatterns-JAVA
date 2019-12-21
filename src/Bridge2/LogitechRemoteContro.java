package Bridge2;

public class LogitechRemoteContro extends AbstractRemoteControl{
    public LogitechRemoteContro(ITV tv) {
        super(tv);
    }
    public void setChannelKeyboard(int channel){
        setChannel(channel);
        System.out.println("logitect use keyword to set channel");
    }
}
