package spital_simple_factory_clase.main;

import spital_simple_factory_clase.Asistent;
import spital_simple_factory_clase.Factory;
import spital_simple_factory_clase.PersonalSpital;
import spital_simple_factory_clase.TipPersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        PersonalSpital asistent=factory.createInstance(TipPersonalSpital.ASISTENT,"Popescu Ionica");
        PersonalSpital medic=factory.createInstance(TipPersonalSpital.MEDIC,"Popescu Ionela");
        PersonalSpital brancardier=factory.createInstance(TipPersonalSpital.BRANCARDIER,"Margescu Margica");

        asistent.descriere();
        medic.descriere();
        brancardier.descriere();
        List<PersonalSpital> listaPersonal=new ArrayList<>();
        listaPersonal.add(asistent);
        listaPersonal.add(medic);
        listaPersonal.add(brancardier);
        listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT,"Lungescu Ionica"));
        listaPersonal.add(factory.createInstance(TipPersonalSpital.BRANCARDIER,"Popa Viorica"));
        listaPersonal.add(factory.createInstance(TipPersonalSpital.MEDIC,"Popa MArinela"));

        for (PersonalSpital personal:listaPersonal){
            personal.descriere();
        }

    }
}
