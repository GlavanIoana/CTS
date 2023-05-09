package state.clase;

public class Masa {
    int numar;
    Stare stare;

    public Masa(int numar) {
        this.numar = numar;
        stare=new StareLibera();
    }

    public int getNumar() {
        return numar;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }
    public void rezervaMasa(){
        Stare rezervata=new StareRezervata();
        rezervata.schimbaStare(this);
    }
    public void ocupaMasa(){
        Stare ocupa=new StareOcupata();
        ocupa.schimbaStare(this);
    }
    public void elibereazaMasa(){
        Stare elib=new StareLibera();
        elib.schimbaStare(this);
    }
    public void efectueazaRezervare(){
        Stare ocupata=new StareOcupata();
        ocupata.schimbaStare(this);
    }
    public void anuleazaRezervare(){
        Stare libera=new StareLibera();
        libera.schimbaStare(this);
    }
}
