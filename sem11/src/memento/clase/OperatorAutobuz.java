package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorAutobuz {
    private List<AutobuzMemento> listaMementouri=new ArrayList<>();
    public void adaugaMemento(AutobuzMemento memento){
        this.listaMementouri.add(memento);
    }
    public AutobuzMemento returneazaMemento(int poz){
        return this.listaMementouri.get(poz);
    }
}
