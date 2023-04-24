package restaurant.proxy.main;

import restaurant.proxy.clase.IRestaurant;
import restaurant.proxy.clase.ProxyRestaurant;
import restaurant.proxy.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IRestaurant restaurant=new Restaurant("Hush");
        restaurant.rezervaMAsa(2);
        IRestaurant proxy=new ProxyRestaurant(restaurant);
        proxy.rezervaMAsa(2);
        proxy.rezervaMAsa(5);
    }
}
