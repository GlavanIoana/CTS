package chain.clase;

public class Client {
    private String nume;
    private String adresaEmail;
    private String nrTelefon;

    public Client(String nume, String adresaEmail, String nrTelefon) {
        this.nume = nume;
        this.adresaEmail = adresaEmail;
        this.nrTelefon = nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }
}
