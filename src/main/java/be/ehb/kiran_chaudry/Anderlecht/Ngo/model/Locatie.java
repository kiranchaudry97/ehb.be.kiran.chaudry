package be.ehb.kiran_chaudry.Anderlecht.Ngo.model;

import jakarta.persistence.*;

@Entity
public class Locatie {
// de inhoud van locatie
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String naam;
    private String adres;
    private int capaciteit;


    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Locatie)) return false;
        Locatie locatie = (Locatie) o;
        return id != null && id.equals(locatie.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}