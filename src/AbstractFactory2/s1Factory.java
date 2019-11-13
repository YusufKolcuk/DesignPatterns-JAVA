package AbstractFactory2;

public class s1Factory implements TutunFabrika{
    //bu markanın urettigi puro ve sigaralar
    @Override
    public IPuro createPuro() {
        return new ArturoFuente();
    }

    @Override
    public ISigara createSigara() {
        return new Malbora();
    }
}
