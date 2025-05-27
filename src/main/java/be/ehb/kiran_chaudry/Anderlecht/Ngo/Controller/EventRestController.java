package be.ehb.kiran_chaudry.Anderlecht.Ngo.Controller;

import be.ehb.kiran_chaudry.Anderlecht.Ngo.DAO.EventDAO;
import be.ehb.kiran_chaudry.Anderlecht.Ngo.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// om met postman te gebruiken
@RestController
@RequestMapping("/events")
public class EventRestController {

    @Autowired
    private EventDAO eventDAO;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllEvents() {
        List<Event> events = eventDAO.findAllByOrderByDatumTijdDesc();

        Map<String, Object> response = new HashMap<>();
        response.put("timestamp", OffsetDateTime.now(ZoneOffset.UTC).toString());
        response.put("status", 200);

        Map<String, Object> data = new HashMap<>();
        data.put("events", events);
        response.put("data", data);


        response.put("operations", List.of());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable Long id) {
        return eventDAO.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        Event saved = eventDAO.save(event);
        return ResponseEntity.ok(saved);
    }

    @PostMapping("/save")
    public ResponseEntity<Event> saveEvent(@RequestBody Event event) {
        Event saved = eventDAO.save(event);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event updated) {
        return eventDAO.findById(id)
                .map(event -> {
                    event.setTitel(updated.getTitel());
                    event.setBeschrijving(updated.getBeschrijving());
                    event.setDatumTijd(updated.getDatumTijd());
                    event.setOrganisatie(updated.getOrganisatie());
                    event.setContactInformatie(updated.getContactInformatie());
                    event.setLocatie(updated.getLocatie());
                    Event saved = eventDAO.save(event);
                    return ResponseEntity.ok(saved);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        if(eventDAO.existsById(id)) {
            eventDAO.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }



    }
}
