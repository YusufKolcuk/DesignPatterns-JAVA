package Command;

public class StereoOffCommand implements ICommand
{
    Stereo stereo;
    public StereoOffCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }
    public void execute()
    {
        stereo.off();
    }
}