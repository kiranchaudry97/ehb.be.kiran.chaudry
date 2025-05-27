package be.ehb.kiran_chaudry.Anderlecht.Ngo.DAO;

import be.ehb.kiran_chaudry.Anderlecht.Ngo.model.Event;
import be.ehb.kiran_chaudry.Anderlecht.Ngo.model.Locatie;
import jakarta.validation.Valid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// interface van locatie met valid

import java.util.List;
@Valid
@Repository
public interface LocatieDAO extends JpaRepository<Locatie, Long> {

}