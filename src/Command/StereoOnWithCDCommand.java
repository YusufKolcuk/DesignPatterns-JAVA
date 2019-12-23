package Command;

public class StereoOnWithCDCommand implements ICommand
{
    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }
    public void execute()
    {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
