package spital_simple_factory_clase;

public class Factory {
    public Factory() {
    }
    public PersonalSpital createInstance(TipPersonalSpital tipPersonalSpital,String numePErsonal){
        switch(tipPersonalSpital){
            case MEDIC:
                return new Medic(numePErsonal);
            case ASISTENT:
                return new Asistent(numePErsonal);
            case BRANCARDIER:
                return new Brancardier(numePErsonal);
            case ANESTEZIST:
                return new Anestezist(numePErsonal);
            default:
                return null;
        }
    }
}
