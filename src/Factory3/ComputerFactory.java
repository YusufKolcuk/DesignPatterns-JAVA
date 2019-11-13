package Factory3;

public class ComputerFactory {

    public static Computer getComputer(CompEnum compEnum){
        if(CompEnum.PC==compEnum) return new PC();
        else if(CompEnum.Server==compEnum) return new Server();
        else return null;
    }
}
