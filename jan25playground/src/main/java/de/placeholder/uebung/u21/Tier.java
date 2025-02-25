package de.placeholder.uebung.u21;

public class Tier {

    private int id;
    private int chip_nr;
    private String name;
    private String tierart;
    private String rasse;
    private boolean aktiv;

    public Tier() {
    }

    public Tier(int chip_nr, String name, String tierart, String rasse) {
        this.chip_nr = chip_nr;
        this.name = name;
        this.tierart = tierart;
        this.rasse = rasse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChip_nr() {
        return chip_nr;
    }

    public void setChip_nr(int chip_nr) {
        this.chip_nr = chip_nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTierart() {
        return tierart;
    }

    public void setTierart(String tierart) {
        this.tierart = tierart;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tiere{");
        sb.append("id=").append(id);
        sb.append(", chip_nr=").append(chip_nr);
        sb.append(", name='").append(name).append('\'');
        sb.append(", tierart='").append(tierart).append('\'');
        sb.append(", rasse='").append(rasse).append('\'');
        sb.append(", aktiv=").append(aktiv);
        sb.append('}');
        return sb.toString();
    }
}
