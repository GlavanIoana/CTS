package dubluri;

import clase.IPersoana;

public class StubPersoanaVarstnica implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 80;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
