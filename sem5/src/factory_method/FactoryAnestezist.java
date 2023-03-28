package factory_method;

public class FactoryAnestezist implements Factory{
    @Override
    public PersonalSpital createPErsonal(String nume) {
        return new Anestezist(nume);
    }
}
