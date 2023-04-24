package restaurant.adapter.bucatarie;

public class SoftBucatarie implements ISoftBucatarie{
    private String numeBucatar;

    public SoftBucatarie(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        System.out.println("Nume bucatar "+this.numeBucatar);
        System.out.println("Nota dvs este in valoarea de "+totalSuma);
    }
}
