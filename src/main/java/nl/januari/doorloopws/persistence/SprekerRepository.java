package nl.januari.doorloopws.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.januari.doorloopws.model.Spreker;

@Component
public interface SprekerRepository extends CrudRepository<Spreker,Long> {

}
