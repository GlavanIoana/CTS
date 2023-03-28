package factory_method;

public class Infirmier implements PersonalSpital{
    private String nume;
    private int aniVechime;

    public void setAniVechime(int aniVechime) {
        this.aniVechime = aniVechime;
    }

    public Infirmier(String nume, int aniVechime) {
        this.nume = nume;
        this.aniVechime=aniVechime;
    }

    public Infirmier(String nume) {
        this.nume = nume;
        this.aniVechime=0;
    }

    @Override
    public void descriere() {
        System.out.println("Infirmier "+this.nume+" are "+this.aniVechime+" ani vechime");
    }
}
