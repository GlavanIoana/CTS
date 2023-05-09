package state.clase;

public class StareLibera implements Stare{
    @Override
    public void schimbaStare(Masa masa) {
        if (!(masa.getStare() instanceof StareLibera)){
            masa.setStare(this);
            System.out.println("Masa "+masa.getNumar()+" s-a eliberat!");
        }else{
            System.out.println("Masa e deja libera!");
        }
    }
}
