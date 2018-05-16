package cz.czechitas.farma;

// Trieda reprezentujuca nas system "Farma"
// Metafora: Trieda je "plan na auto", objekt je "auto"
public class Farma {

    // Farma obsahuje kraliky...
    private Kralici kralici;
    // ... a husy
    private Husy husy;
    // Pouzili sme tzv. premenne triedy / atributy / polia (fields)
    // ktore budu mat vlastnu hodnotu v kazdom objekte (instanci)
    // triedy Farma. Jedna farma moze mat napr. 10 kralikov, ina 20, atd.

    // private (soukromy) znamena, ze ked mate objekt triedy Farma,
    // nevidide na jeho atributy kralici a husy.
    // Skuste si to v triede HlavniOkno:
    // Promenna farma.kralici je nedostupna, ale pokud zmenite private na public,
    // tak bude dostupna
    // Dovod je skryvanie detailov ktore nie su dolezite pre pouzivatela objektu
    // (sofer nutne nepotrebuje vediet ako funguje spalovaci motor aby mohol
    // stlacit plynovy pedal)

    // farma vie poskytnut pocet hlav, to je cele cislo
    public int getPocetHlav() {
        // dotaz na objekty reprezentujuce kraliky a husy na farme
        // kazda trieda ma byt zodpovedna za svoju oblast systemu
        return kralici.getPocetHlav() + husy.getPocetHlav();
    }

    public int getPocetNohou() {
        return kralici.getPocetNohou() + husy.getPocetNohou();
    }

    public void prepocitaj(int pocetKraliku, int pocetHus) {
        // Farma dostane novy pocet kralikov a hus
        // vytvorime objekty typu Husy a typu Kralici.
        // Pri vytvarani objektu sa zavola konstruktor,
        // co je specialna metoda, ktora nam dostane objekt
        // do validneho stavu.
        // V tomto pripadne musime zadat pocet hus a pocet kraliku.
        husy = new Husy(pocetHus);
        kralici = new Kralici(pocetKraliku);

    }
}
