package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Szamla> szamlak =  new ArrayList<>();

    public int getOsszHitelkeret() {
        int osszHitelkeret = 0;
        for (Szamla szamla : szamlak) {
            if ( szamla instanceof HitelSzamla) {
                System.out.println("asd");
                osszHitelkeret += ((HitelSzamla) szamla).getHitelKeret();
            }
        }
        return osszHitelkeret;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        int max = 0;
        Szamla szamla = null;
        for (Szamla item : szamlak) {
            if (item.getTulajdonos() == tulajdonos && item.getAktualisEgyenleg() > max) {
                max = item.getAktualisEgyenleg();
                szamla = item;
            }
        }
        return szamla;
    }

    public int getOsszEgyenleg(Tulajdonos tulajdonos) {
        int osszEgyenleg = 0;
        for (Szamla item : szamlak) {
            if (item.getTulajdonos() == tulajdonos) {
                osszEgyenleg += item.getAktualisEgyenleg();
            }
        }
        return osszEgyenleg;
    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelKeret) {
        Szamla szamla;
        try {
            if (hitelKeret == 0) {
                szamla = new MegtakaritasiSzamla(tulajdonos);
                szamlak.add(szamla);
            } else if (hitelKeret > 0) {
                szamla = new HitelSzamla(tulajdonos, hitelKeret);
                szamlak.add(szamla);
            }
            else {
                throw new Exception("hitelkeret nem lehet negatív szám");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        return szamla;
    }

}
