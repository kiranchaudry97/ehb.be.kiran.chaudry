package be.ehb.kiran_chaudry.Anderlecht.Ngo.DAO;

import be.ehb.kiran_chaudry.Anderlecht.Ngo.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// interface en verwijzen lijsten vanuit de event model  om op te zoeken en te sorteren op datum van de event
@Repository
public interface EventDAO extends JpaRepository<Event, Long> {
    List<Event> findAllByOrderByDatumTijdDesc();
}
