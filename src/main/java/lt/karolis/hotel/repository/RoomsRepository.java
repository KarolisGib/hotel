package lt.karolis.hotel.repository;

import lt.karolis.hotel.repository.model.Rooms;
import org.springframework.data.repository.CrudRepository;

public interface RoomsRepository extends CrudRepository<Rooms, Integer> {

}
