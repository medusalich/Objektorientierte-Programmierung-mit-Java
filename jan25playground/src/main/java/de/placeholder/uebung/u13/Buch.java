package de.placeholder.uebung.u13;

public class Buch {

    private String isbn;
    private String autor;
    private String titel;
    private int erscheinungsjahr;
    private String verlag;
    private String genre;
    private int seitenanzahl;
    private boolean ausgeliehen;

    public Buch() {
    }

    public Buch(String isbn, String autor, String titel, int erscheinungsjahr, String verlag, String genre, int seitenanzahl) {
        this.isbn = isbn;
        this.autor = autor;
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.verlag = verlag;
        this.genre = genre;
        this.seitenanzahl = seitenanzahl;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        if(erscheinungsjahr >= 0) this.erscheinungsjahr = erscheinungsjahr;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        if(seitenanzahl >= 0) this.seitenanzahl = seitenanzahl;
    }

    public boolean isAusgeliehen() {
        return ausgeliehen;
    }

    public void setAusgeliehen(boolean ausgeliehen) {
        this.ausgeliehen = ausgeliehen;
    }

    @Override
    public String toString() {
        return "Buecher{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", titel='" + titel + '\'' +
                ", erscheinungsjahr=" + erscheinungsjahr +
                ", verlag='" + verlag + '\'' +
                ", genre='" + genre + '\'' +
                ", seitenanzahl=" + seitenanzahl +
                '}';
    }
}
