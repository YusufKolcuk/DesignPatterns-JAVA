package AbstractFactory3;

public class TeknosaFactory implements TechFac {
    @Override
    public Apple createPhone() {
        return new TPhone();
    }

    @Override
    public Asus createComputer() {
        return new TComputer();

    }
}
