package cz.czechitas.citaty;

import java.io.*;
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

    public Citat getNahodnyCitatAutora(String autor) {
        List<Citat> nahodnyCitatAutora = new ArrayList<>();

        for (Citat citat : zdroj.getCitaty()) {
            if (citat.getAutor().equals(autor)) {
                nahodnyCitatAutora.add(citat);
            }
        }
        int citatAutora = nahodnyCitatAutora.size();

        Random randomAutor = new Random();
        int jmenoAutora = randomAutor.nextInt(citatAutora);

        Citat nahodnyCitatOdAutora = nahodnyCitatAutora.get(jmenoAutora);
        return nahodnyCitatOdAutora;
    }
    
    public int getPocetCitatu() {
        int pocetCitatu = zdroj.getCitaty().size();
        return pocetCitatu;
    }

    public int getPocetAutoru() {
        Set<String> jmenaAutoru = new HashSet();

        for (Citat citat : zdroj.getCitaty()) {
            String jmeno;
            jmeno = citat.getAutor();
            jmenaAutoru.add(jmeno);
        }
        int pocet = jmenaAutoru.size();
        return pocet;
    }

    public Citat getNahodnyOblibenyCitat() {
        List<Citat> oblibeneCitaty = new ArrayList<>();

        for (Citat citat : zdroj.getCitaty()) {

            if (citat.isOblibeny()) {
                oblibeneCitaty.add(citat);
            }
        }
        int oblibenyCitat = oblibeneCitaty.size();

        Random randomOblibeny = new Random();
        int oblibenyNahodnyCitat = randomOblibeny.nextInt(oblibenyCitat);

        Citat nahodnyOblibenyCitat = oblibeneCitaty.get(oblibenyNahodnyCitat);
        return nahodnyOblibenyCitat;
    }
}
