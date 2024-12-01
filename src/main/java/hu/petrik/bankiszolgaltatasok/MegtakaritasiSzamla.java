package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    private double kamat;
    static double alapKamat = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }
    public boolean kivesz(int osszeg) {
        if (getAktualisEgyenleg() - osszeg >= 0) {
                 aktualisEgyenleg -= osszeg;
            return true;
        }
        return false;
    }

    public void kamatJovairas() {
        aktualisEgyenleg = (int)(getAktualisEgyenleg() * kamat);
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }
}
