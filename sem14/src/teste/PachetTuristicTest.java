package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Tag1;
import dubluri.StubPersoana;
import dubluri.StubPersoanaVarstnica;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Category(Tag1.class)
    @Test
    public void checkAplicaDiscount20(){
        IPersoana persoana=new StubPersoana();
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Mamaia",5000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals((Double)5000.0,pachetTuristic.getPret());
    }

    @Test
    public void checkAplicaDiscount80(){
        IPersoana persoana=new StubPersoanaVarstnica();
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Mamaia",5000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals((Double)4000.0,pachetTuristic.getPret());
    }
}