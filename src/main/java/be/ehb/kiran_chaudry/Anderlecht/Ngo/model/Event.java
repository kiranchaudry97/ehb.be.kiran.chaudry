package be.ehb.kiran_chaudry.Anderlecht.Ngo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
public class Event {
// de inhoud van event
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Datum en tijd is verplicht")
    private LocalDateTime datumTijd;

    @NotBlank(message = "Titel is verplicht")
    private String titel;

    @NotBlank(message = "Beschrijving is verplicht")
    private String beschrijving;

    @NotBlank(message = "Organisatie is verplicht")
    private String organisatie;

    @NotBlank(message = "Contactinformatie is verplicht")
    @Email(message = "Geef een geldig e-mailadres")
    private String contactInformatie;

    @NotNull(message = "Locatie is verplicht")
    @ManyToOne
    @JoinColumn(name = "locatie_id")
    private Locatie locatie;

    // Getters & Setters aanmaken
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public LocalDateTime getDatumTijd() { return datumTijd; }

    public void setDatumTijd(LocalDateTime datumTijd) { this.datumTijd = datumTijd; }

    public String getTitel() { return titel; }

    public void setTitel(String titel) { this.titel = titel; }

    public String getBeschrijving() { return beschrijving; }

    public void setBeschrijving(String beschrijving) { this.beschrijving = beschrijving; }

    public String getOrganisatie() { return organisatie; }

    public void setOrganisatie(String organisatie) { this.organisatie = organisatie; }

    public String getContactInformatie() { return contactInformatie; }

    public void setContactInformatie(String contactInformatie) { this.contactInformatie = contactInformatie; }

    public Locatie getLocatie() { return locatie; }

    public void setLocatie(Locatie locatie) { this.locatie = locatie; }
}