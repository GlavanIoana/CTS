package dubluri;

import clase.IPersoana;

public class FakePersoana implements IPersoana {
    String sex;
    int varsta;
    boolean cnp;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCnp(boolean cnp) {
        this.cnp = cnp;
    }

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return 0;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
