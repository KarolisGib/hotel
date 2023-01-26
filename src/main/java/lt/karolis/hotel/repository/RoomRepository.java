package lt.karolis.hotel.repository;

import lt.karolis.hotel.repository.model.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoomRepository extends CrudRepository<Room, Integer> {

    Optional<Room> findByCity(String city);
}
