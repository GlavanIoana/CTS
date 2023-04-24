package restaurant.proxy.clase;

public class Restaurant implements IRestaurant{
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezervaMAsa(int nrPErsoane) {
        System.out.println("Masa a fost rezervata pt "+nrPErsoane+" persoane la restaurantul "+this.nume);
    }
}
