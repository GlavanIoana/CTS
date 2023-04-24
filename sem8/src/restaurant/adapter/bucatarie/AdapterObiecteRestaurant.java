package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftBucatarie{
    private ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        this.softBar.printeazaNotaBar(totalSuma);
    }
}
