package teste;

import clase.PachetTuristic;
import dubluri.FakePersoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class PachetTuristicVarstaTest {
    @Test
    public void unTanarNuPoateRezerva(){
        FakePersoana persoana=new FakePersoana();
        persoana.setVarsta(15);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Vama Veche",500.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
    @Test
    public void unAdultPoateRezerva(){
        FakePersoana persoana=new FakePersoana();
        persoana.setVarsta(35);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Vama Veche",500.0);
        assertTrue(pachetTuristic.poateRezerva());
    }
}