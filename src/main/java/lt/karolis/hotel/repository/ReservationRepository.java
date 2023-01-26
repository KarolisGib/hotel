package lt.karolis.hotel.repository;

import lt.karolis.hotel.repository.model.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    Optional<Reservation> findByStartDate(String startDate);
}
