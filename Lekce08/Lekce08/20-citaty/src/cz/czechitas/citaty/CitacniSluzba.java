package cz.czechitas.citaty;

import java.util.*;
import cz.czechitas.citaty.zdroje.*;

public class CitacniSluzba {

    private ZdrojCitatu zdroj;

    public CitacniSluzba(ZdrojCitatu zdroj) {
        this.zdroj = zdroj;
    }

    public Citat getNahodnyCitat() {
        Random random = new Random();
        int cisloCitatu = random.nextInt(getPocetCitatu());

        Citat nahodnyCitat = zdroj.getCitaty().get(cisloCitatu);
        return nahodnyCitat;

    }

    public int getPocetCitatu() {
        int pocetCitatu = zdroj.getCitaty().size();
        return pocetCitatu;
    }
}