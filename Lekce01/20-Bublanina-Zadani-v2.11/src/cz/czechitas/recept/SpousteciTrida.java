package cz.czechitas.recept;

import cz.czechitas.recept.naradi.*;
import cz.czechitas.recept.suroviny.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Miska cervenaMiska = new Miska("cervenaMiska");
        Miska zlutaMiska = new Miska("zlutaMiska");
        Mixer mixer = new Mixer("mixer");
        Vaha kuchynskaVaha = new Vaha("vaha");
        PlechNaPeceni plech = new PlechNaPeceni("plech");
        ElektrickaTrouba trouba = new ElektrickaTrouba("trouba");

        Vajicka vajicka = new Vajicka("vajicka");
        Ovoce ovoce = new Ovoce("ovoce");
        Maslo maslo125g = new Maslo("maslo125g");
        Mouka pytlikMouky = new Mouka("pytlikMouky");
        Cukr pytlikCukru = new Cukr("pytlikCukru");
        PrasekDoPeciva prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

        //---------------------------------------------------------------------

        // TODO: Sem napiste recept na bublaninu
        // Pouzivejte napovidani v editoru.
        // Vyskakuje samo nebo pomoci Ctrl+Mezernik

        for (int i = 0; i < 4; i = i + 1) {
            cervenaMiska.nalozJedenKus(vajicka);
        }
        cervenaMiska.nalozCelyObsah(pytlikCukru);
        mixer.zamichej(cervenaMiska);

        cervenaMiska.nalozCelyObsah(maslo125g);
        mixer.zamichej(cervenaMiska);

        kuchynskaVaha.vynulujSeS(zlutaMiska);
        zlutaMiska.nalozTrochu(pytlikMouky);

        while (kuchynskaVaha.zjistiHmotnost(zlutaMiska) != 250) {
            if (kuchynskaVaha.zjistiHmotnost(zlutaMiska) < 250) {
                zlutaMiska.nalozTrochu(pytlikMouky);
            } else {
                zlutaMiska.vylozTrochu();
            }
        }
        cervenaMiska.nalozObsahMisky(zlutaMiska);
        cervenaMiska.nalozCelyObsah(prasekDoPeciva);
        mixer.zamichej(cervenaMiska);

        plech.preberObsah(cervenaMiska);

        for (int i = 0; i < 50; i = i + 1) {
            plech.posypKusem(ovoce);
        }

        trouba.zapniSe(180);
        trouba.nechejPect(5);
        trouba.vlozSiDovnitr(plech);
        trouba.nechejPect(25);
        trouba.vypniSe();
        trouba.vyndejObsahVen();
    }
}
