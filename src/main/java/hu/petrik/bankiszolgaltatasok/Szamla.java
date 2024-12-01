package hu.petrik.bankiszolgaltatasok;

public abstract class Szamla extends BankiSzolgaltatas{

    int aktualisEgyenleg;

    Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }
    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        aktualisEgyenleg += osszeg;
    }

    public abstract boolean kivesz(int osszeg);

    public Kartya ujKartya(String kartyaSzam) {
        return new Kartya(getTulajdonos(), this, kartyaSzam);
    }
}
