package AbstractFactory3;

public class Trial {
    public static void main(String[] args) {
        TechFac techFac=new TeknosaFactory();
        TechFac techFac2=new VatanFactory();
        techFac.createComputer().computer();
        techFac.createPhone().phone();
        System.out.println("-------------------------------------------------------------------------");
        techFac2.createComputer().computer();
        techFac2.createPhone().phone();
    }


}
