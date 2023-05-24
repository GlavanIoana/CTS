package farmacie.facade.clase;

public class CardSanatate {
    int id;
    boolean eValid;
    public CardSanatate(int id) {
        this.id=id;
        eValid=true;
    }
    public boolean eValid(){
        return eValid;
    }

    public int getId() {
        return id;
    }
}
