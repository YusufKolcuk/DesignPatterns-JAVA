package AbstractFactory3;

public class VatanFactory implements TechFac {
    @Override
    public Apple createPhone() {
        return new VPhone();
    }

    @Override
    public Asus createComputer() {
        return new VComputer();
    }
}
