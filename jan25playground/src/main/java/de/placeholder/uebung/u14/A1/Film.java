package de.placeholder.uebung.u14.A1;

import java.util.Objects;

public class Film {
    private String titel;
    private String genre;

    public Film(String titel, String genre) {
        this.titel = titel;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(titel, film.titel) && Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, genre);
    }
}


