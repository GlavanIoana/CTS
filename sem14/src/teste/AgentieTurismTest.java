package teste;

import clase.AgentieTurism;
import clase.IPachet;
import clase.Tag1;
import dubluri.FakePachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class AgentieTurismTest {

    @Category(Tag1.class)
    @Test
    public void calculareSumaTotalaPachete() {
        AgentieTurism agentieTurism=new AgentieTurism();
        IPachet pachet1=new FakePachetTuristic();
        IPachet pachet2=new FakePachetTuristic();
        IPachet pachet3=new FakePachetTuristic();

        pachet1.setPret(200.0);
        pachet2.setPret(300.0);
        pachet3.setPret(400.0);

        agentieTurism.adaugaPachet(pachet1);
        agentieTurism.adaugaPachet(pachet2);
        agentieTurism.adaugaPachet(pachet3);
        assertEquals(900.0,agentieTurism.calculareSumaTotalaPachete(),0.1);
    }
}