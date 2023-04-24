package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.ISoftBucatarie;
import restaurant.adapter.bucatarie.SoftBucatarie;

public class Main {
    public static void imprimare(ISoftBucatarie bucatarie,double totalNota){
        bucatarie.printeazaNota(totalNota);
    }
    public static void main(String[] args) {
        ISoftBar bar=new SoftBar("Hugo");
//        bar.printeazaNotaBar(240);
        ISoftBucatarie bucatarie=new SoftBucatarie("George");
//        bucatarie.printeazaNota(300);
//        Main.imprimare(bar,340);
        Main.imprimare(bucatarie,500);

        AdapterRestaurant adapter=new AdapterRestaurant("Alcadibo");
        adapter.printeazaNota(340);

        AdapterObiecteRestaurant adapterObiecte=new AdapterObiecteRestaurant(bar);
        imprimare(adapterObiecte,700);
    }
}
