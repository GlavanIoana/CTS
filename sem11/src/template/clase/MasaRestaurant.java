package template.clase;

public abstract class MasaRestaurant {
    int numarMasa;

    public MasaRestaurant(int numarMasa) {
        this.numarMasa = numarMasa;
    }
    protected abstract void curataMasa();
    protected abstract void asazaServetele();
    protected abstract void asazaTacamuri();
    protected abstract void invitaPersoaneLaMasa();

    public final void ocupaMasa(){
        curataMasa();
        asazaServetele();
        asazaTacamuri();
        invitaPersoaneLaMasa();
    }

    public int getNumarMasa() {
        return numarMasa;
    }
}
