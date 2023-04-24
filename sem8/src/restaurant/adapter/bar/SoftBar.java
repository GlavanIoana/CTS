package restaurant.adapter.bar;

public class SoftBar implements ISoftBar{
    private String denumire;

    public SoftBar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void printeazaNotaBar(double valoare) {
        System.out.println("Barul "+this.denumire+" a emis nota aferenta bauturilor consumate in valoare de "+valoare);
    }
}
