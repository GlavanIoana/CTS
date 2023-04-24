package restaurant.proxy.clase;

public class ProxyRestaurant implements IRestaurant{
    private IRestaurant restaurant;

    public ProxyRestaurant(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervaMAsa(int nrPErsoane) {
        if (nrPErsoane>=4){
            this.restaurant.rezervaMAsa(nrPErsoane);
        }else {
            System.out.println("Rezervarea nu a putut fi facuta!");
        }
    }
}
