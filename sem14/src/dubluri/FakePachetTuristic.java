package dubluri;

import clase.IPachet;
import clase.IPersoana;

public class FakePachetTuristic implements IPachet {
    Double pret;

    @Override
    public IPersoana getClient() {
        return null;
    }

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return pret;
    }

    @Override
    public void setDestinatie(String destinatie) {

    }

    @Override
    public void setPret(Double pret) {
        this.pret=pret;
    }

    @Override
    public void setClient(IPersoana client) {

    }

    @Override
    public String getDestinatie() {
        return null;
    }
}
