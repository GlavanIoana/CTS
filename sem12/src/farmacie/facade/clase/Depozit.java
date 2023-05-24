package farmacie.facade.clase;

import farmacie.adapter.clase.Medicament;

import java.util.HashMap;

public class Depozit {
    HashMap<Integer,MEdicament> listaMEdicamente;

    public Depozit() {
        listaMEdicamente=new HashMap<>();
    }
    public void adaugaMedicament(MEdicament med){
        listaMEdicamente.put(med.getId(),med);
    }
    public boolean esteDisponibil(int id){
        return listaMEdicamente.get(id).getDisponibilitate()!=0;
    }

}
