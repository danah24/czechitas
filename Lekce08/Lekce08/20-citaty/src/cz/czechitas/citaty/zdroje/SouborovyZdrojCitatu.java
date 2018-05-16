package cz.czechitas.citaty.zdroje;

import java.io.*;
import java.util.*;
import cz.czechitas.citaty.*;

public class SouborovyZdrojCitatu implements ZdrojCitatu {

    private List<Citat> citaty;
    private File soubor;

    public SouborovyZdrojCitatu(File soubor) {
        citaty = nactiCitatyZeSouboru(soubor);
        this.soubor = soubor;
    }
    //private nelze volat na objektu
    private List<Citat> nactiCitatyZeSouboru(File zdrojovySoubor) {
        List<Citat> citaty = new ArrayList<>();   //Vytvorime novy prazdny seznam.
        Pomocnik honzik = new Pomocnik();

        List<String> radky = honzik.nactiRadkySouboru(zdrojovySoubor);

        for (int i = 0; i < radky.size(); i = i +3)  {
             String autor = radky.get(i);
             String text = radky.get(i+2);

             Citat nactenyCitat = new Citat(autor, text);
             citaty.add(nactenyCitat);
        }

        return citaty;
    }

    @Override
    public List<Citat> getCitaty() {
        return citaty;
    }
}
