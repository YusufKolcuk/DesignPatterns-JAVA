package Factory3;

public class Trial {
    public static void main(String[] args) {
        Computer pc=ComputerFactory.getComputer(CompEnum.PC);
        System.out.println("PC  :"+pc.getCPU()+"--"+pc.getRAM()+"--"+pc.getHDD());
        Computer server=ComputerFactory.getComputer(CompEnum.Server);
        System.out.println("Server  :"+server.getCPU()+"--"+server.getRAM()+"--"+server.getHDD());


    }

}
