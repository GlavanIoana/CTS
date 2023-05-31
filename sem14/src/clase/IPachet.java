package clase;

public interface IPachet {
    IPersoana getClient();
    boolean poateRezerva();
    void aplicaDiscountVarstnici(int procent);
    Double getPret();
    void setDestinatie(String destinatie);
    void setPret(Double pret);
    void setClient(IPersoana client);
    String getDestinatie();

}
