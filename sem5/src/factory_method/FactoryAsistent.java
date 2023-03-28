package factory_method;

public class FactoryAsistent implements Factory{
    @Override
    public PersonalSpital createPErsonal(String nume) {
        return new Asistent(nume);
    }
}
