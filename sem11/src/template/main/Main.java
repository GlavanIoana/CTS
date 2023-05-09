package template.main;

import template.clase.MasaLocal;
import template.clase.MasaRestaurant;
import template.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        MasaRestaurant masa=new MasaLocal(4);
        masa.ocupaMasa();
        MasaRestaurant masaRezervata=new MasaRezervata(5,"12:00");
        masaRezervata.ocupaMasa();
    }
}
