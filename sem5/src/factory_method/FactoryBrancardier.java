package factory_method;

public class FactoryBrancardier implements Factory{
    @Override
    public PersonalSpital createPErsonal(String nume) {
        return new Brancardier(nume);
    }
}
