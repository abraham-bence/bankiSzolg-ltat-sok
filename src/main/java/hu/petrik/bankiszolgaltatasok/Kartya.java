package hu.petrik.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas{
    String kartyaSzam;
    Szamla szamla;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg) {
        return szamla.kivesz(osszeg);
    }
}
