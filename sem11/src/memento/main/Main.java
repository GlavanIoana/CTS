package memento.main;

import memento.clase.Autobuz;
import memento.clase.OperatorAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("George", 18.25F,"autobuz de la Soldanu",2012,50);
        OperatorAutobuz operator=new OperatorAutobuz();
        System.out.println(autobuz.toString());;
        operator.adaugaMemento(autobuz.creareMemento());
        autobuz.setNumeSofer("Micu");
        autobuz.setConsumMediu(20);
        System.out.println(autobuz.toString());
        autobuz.restaurareAutobuz(operator.returneazaMemento(0));
        System.out.println(autobuz.toString());;

    }
}
