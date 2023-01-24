package lt.karolis.hotel.repository;

import lt.karolis.hotel.repository.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Integer> {

}
