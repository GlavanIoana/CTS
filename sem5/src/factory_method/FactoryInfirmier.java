package factory_method;

public class FactoryInfirmier implements Factory{
    @Override
    public PersonalSpital createPErsonal(String nume) {
        return new Infirmier(nume);
    }
}
