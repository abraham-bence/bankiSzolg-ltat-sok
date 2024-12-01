package hu.petrik.bankiszolgaltatasok;

public class HitelSzamla extends Szamla{

    private final int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (((getAktualisEgyenleg() + hitelKeret) - osszeg) >= 0){
            aktualisEgyenleg -= osszeg;
            return true;
        }
        return false;
    }
}
