package cz.czechitas.citaty;

public class Citat {
    private String autor;
    private String text;

    public Citat(String autor, String text) {
        this.autor = autor;
        this.text = text;
    }

    public String getAutor() {
        return autor;
    }

    public String getText () {
        return text;
    }
}
