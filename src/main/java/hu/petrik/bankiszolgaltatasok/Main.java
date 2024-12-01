package hu.petrik.bankiszolgaltatasok;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank();
        Tulajdonos tulajdonos = new Tulajdonos("Minden Áron");
        bank.szamlaNyitas(tulajdonos,10000);
        bank.szamlak.get(0).kivesz(10000);
        System.out.println(bank.szamlak.get(0).getAktualisEgyenleg());
        bank.szamlak.get(0).befizet(20000);
        System.out.println(bank.szamlak.get(0).getAktualisEgyenleg());
        bank.szamlak.get(0).kivesz(5000);
        System.out.println(bank.szamlak.get(0).getAktualisEgyenleg());

    }








}


