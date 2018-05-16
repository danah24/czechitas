package cz.czechitas.farma;

// Trieda reprezentujuca vsetky husy na farme
public class Husy {

    // Pocet kraliku, atribut typu cele cislo
    private int pocet;

    // Dve konstanty

    // private = viz. Farma

    // static znamena, ze ta sama promenna (alebo metoda),
    // sa pouzije pre vsetky objekty danej tridy,
    // ina interpretacia - premenna patri tride nie konkretnym objektom danej triedy.
    // Napr. String.valueOf zmeni vstup na String. Tato metoda nepotrebuje
    // konkretny objekt typu String, napr. "bla bla",
    // v istom zmysle tato metoda patri celej tride String

    // final = Java nam nedovoli priradit novu hodnotu - skuste si to
    private static final int POCET_HLAV = 1;
    private static final int POCET_NOHOU = 2;
    // Pouzivame VELKE_PISMENA pre nazvy konstant ako konvenciu.
    // Priklad konstanty (public static final double): Math.PI (vyskusajte)

    // Konstruktor, viz. Farma
    public Husy(int pocetHus /* <- argument (parameter) metody */) {
        // priradime hodnotu ktoru sme dostali v konstruktore do atributu "pocet"
        pocet = pocetHus;
    }

    // Alternativne mozeme zavolat tuto metodu namiesto konstruktoru:
    //public void setPocet(int pocetHus) {
    //        pocet = pocetHus;
    //}

    public int getPocetHlav() {
        int vysledek = pocet * POCET_HLAV;
        return vysledek; // return = vrat hodnotu ako vysledok metody
        // ak ma metoda navratovy typ void, tak sa return nepouziva, pretoze nie je co vratit
    }

    public int getPocetNohou() {
        return pocet * POCET_NOHOU; // to same na jednom radku
    }

}
