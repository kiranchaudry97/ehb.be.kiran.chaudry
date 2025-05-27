package be.ehb.kiran_chaudry.Anderlecht.Ngo.Controller;

import be.ehb.kiran_chaudry.Anderlecht.Ngo.DAO.EventDAO;
import be.ehb.kiran_chaudry.Anderlecht.Ngo.DAO.LocatieDAO;
import be.ehb.kiran_chaudry.Anderlecht.Ngo.model.Event;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

// de web controller de inhoud van andere beans toevoegen en samen te zetten met event en locatie interface

@Controller
public class WebEventController {

    @Autowired
    private EventDAO eventDAO;

    @Autowired
    private LocatieDAO locatieDAO;
  // het aanroepen van get event model van de index en terug te sturen naar de index vooral te vinden om datum en tijd van de events

    // Homepagina: toont laatste 10 evenementen
    @GetMapping({"/", "/index"})
    public String showEvents(Model model) {
        System.out.println("Aantal evenementen in DB: " + eventDAO.findAll().size()); // Debug log
        model.addAttribute("events", eventDAO.findAllByOrderByDatumTijdDesc());
        return "index"; // index.html in src/main/resources/templates
    }

    // Formulier om nieuw evenement toe te voegen
    @GetMapping("/new")
    public String showNewEventForm(Model model) {
        model.addAttribute("event", new Event());
        model.addAttribute("locaties", locatieDAO.findAll());
        return "new"; // new.html in templates
    }

    // Opslaan van evenement met validatie
    @PostMapping(value = "/save")
    public String saveEvent(@Valid @ModelAttribute("event") Event event,
                            BindingResult result,
                            Model model) {
        if (result.hasErrors()) {
            model.addAttribute("locaties", locatieDAO.findAll());
            return "new"; // formulier opnieuw tonen bij fouten
        }

        eventDAO.save(event);
        return "redirect:/"; // terug naar homepagina
    }

    // Detailpagina voor één evenement
    @GetMapping("/details/{id}")
    public String showDetails(@PathVariable Long id, Model model) {
        return eventDAO.findById(id)
                .map(event -> {
                    model.addAttribute("event", event);
                    return "details"; // details.html in templates
                })
                .orElse("redirect:/"); // of aparte errorpagina tonen
    }

    // About pagina
    @GetMapping("/about")
    public String showAboutPage() {
        return "about"; // about.html in templates
    }
}