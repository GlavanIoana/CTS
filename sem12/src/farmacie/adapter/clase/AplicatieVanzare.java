package farmacie.adapter.clase;

import java.util.List;

public class AplicatieVanzare implements IAplicatieVanzare{
    List<Medicament> medicamente;
    @Override
    public void setareMedicament(int id) {
//        if (medicamente.contains())
    }

    @Override
    public boolean verificareDisponibilitate(int nr) {
        return false;
    }
}
