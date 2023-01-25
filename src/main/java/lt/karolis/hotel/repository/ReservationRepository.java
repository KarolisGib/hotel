package lt.karolis.hotel.repository;

import lt.karolis.hotel.repository.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

}
