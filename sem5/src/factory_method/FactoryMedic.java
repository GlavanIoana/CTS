package factory_method;

public class FactoryMedic implements Factory{
    @Override
    public PersonalSpital createPErsonal(String nume) {
        return new Medic(nume);
    }
}
