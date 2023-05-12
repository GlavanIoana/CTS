package command.main;

import command.clase.Autobuz;
import command.clase.Automobil;
import command.clase.CommandPlecareCursa;
import command.clase.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi operator=new ManagerComenzi();
        Automobil autobuz=new Autobuz(12);
        operator.invocaComanda(new CommandPlecareCursa(10,new Autobuz(1)));
        operator.invocaComanda(new CommandPlecareCursa(11,autobuz));
        operator.invocaComanda(new CommandPlecareCursa(12,new Autobuz(2)));
        operator.invocaComanda(new CommandPlecareCursa(11,autobuz));

        operator.executaComanda();
        operator.executaComanda();
        operator.invocaComanda(new CommandPlecareCursa(10,new Autobuz(10)));
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
