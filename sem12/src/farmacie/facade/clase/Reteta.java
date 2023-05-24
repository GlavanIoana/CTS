package farmacie.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    boolean eValida;
    List<Integer> listaIdMEdicamente;

    public Reteta() {
        eValida=true;
        listaIdMEdicamente=new ArrayList<>();
    }
    public boolean eValida(){
        return eValida;
    }

}
