package AbstractFactory2;

public class s2Factory implements TutunFabrika {
    //bu markanin urettigi puro ve sigaralar
    @Override
    public IPuro createPuro() {
        return new Cohiba();
    }

    @Override
    public ISigara createSigara() {
        return new Camel();
    }
}
