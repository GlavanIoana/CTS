package factory_method.main;
import factory_method.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory fabricaAsistenti=new FactoryAsistent();
        Factory fabricaMEdici=new FactoryMedic();
        Factory fabricaInfirmier=new FactoryInfirmier();
        Infirmier infirmier= (Infirmier) fabricaInfirmier.createPErsonal("MArcel");
        infirmier.setAniVechime(15);

        List<PersonalSpital> listaPErsonal=new ArrayList<>();
        listaPErsonal.add(fabricaAsistenti.createPErsonal("Maicuta Mihai"));
        listaPErsonal.add(fabricaAsistenti.createPErsonal("ANgelescu Corneliu"));
        listaPErsonal.add(fabricaMEdici.createPErsonal("Lupascu Cosanzeana"));
        listaPErsonal.add(infirmier);

        for (PersonalSpital p:listaPErsonal){
            p.descriere();
        }

    }
}
