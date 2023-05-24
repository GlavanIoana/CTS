package farmacie.facade.clase;

public class MEdicament {
    int id;
    int disponibilitate;

    public MEdicament(int id, int disponibilitate) {
        this.id = id;
        this.disponibilitate = disponibilitate;
    }

    public int getId() {
        return id;
    }

    public int getDisponibilitate() {
        return disponibilitate;
    }

}
