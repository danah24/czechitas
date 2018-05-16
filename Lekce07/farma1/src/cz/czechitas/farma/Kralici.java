package cz.czechitas.farma;

// Trieda reprezentujuca vsetky kraliky na farme,
// viz triedu Husy
public class Kralici {

    private int pocet;

    private static final int POCET_HLAV = 1;
    private static final int POCET_NOHOU = 4;

    public Kralici(int pocetK) {
        pocet = pocetK;
    }

    public int getPocetHlav() {
        return pocet * POCET_HLAV;
    }

    public int getPocetNohou() {
        return pocet * POCET_NOHOU;
    }
}
