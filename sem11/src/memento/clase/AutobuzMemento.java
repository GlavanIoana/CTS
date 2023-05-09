package memento.clase;

public class AutobuzMemento {
    private String numeSofer;
    float consumMediu;

    public AutobuzMemento(String numeSofer, float consumMediu) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public float getConsumMediu() {
        return consumMediu;
    }

}
