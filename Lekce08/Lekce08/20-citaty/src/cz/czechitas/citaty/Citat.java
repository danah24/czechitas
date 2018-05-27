package cz.czechitas.citaty;

public class Citat {
    private String autor;
    private String text;
    private Boolean oblibene;

    public Citat(String autor, String text) {
        this.autor = autor;
        this.text = text;
        this.oblibene = false;
    }

    public String getAutor() {
        return autor;
    }

    public String getText () {
        return text;
    }

    public Boolean isOblibeny(){
        return oblibene;
    }

    public void setOblibene (boolean oblibene) {
        this.oblibene = oblibene;
    }
}
