package farmacie.adapter.clase;

public class Medicament {
    int id;
    int numarInStoc;

    public Medicament(int id, int numarInStoc) {
        this.id = id;
        this.numarInStoc = numarInStoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumarInStoc() {
        return numarInStoc;
    }

    public void setNumarInStoc(int numarInStoc) {
        this.numarInStoc = numarInStoc;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "id=" + id +
                ", numarInStoc=" + numarInStoc +
                '}';
    }
}
