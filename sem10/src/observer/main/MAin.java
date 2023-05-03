package observer.main;

import observer.clase.ClientRestaurant;
import observer.clase.Observer;
import observer.clase.Restaurant;

public class MAin {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant("BOnita");

        Observer client1=new ClientRestaurant("Vlad");
        Observer client2=new ClientRestaurant("Pavel");
        Observer client3=new ClientRestaurant("Francesca");

        restaurant.adaugareObserver(client1);
        restaurant.adaugareObserver(client2);
        restaurant.notificareOfertaPret();
        restaurant.stergereObserver(client2);
        restaurant.adaugareObserver(client3);
        restaurant.notificaSchimbareMeniu();
    }
}
