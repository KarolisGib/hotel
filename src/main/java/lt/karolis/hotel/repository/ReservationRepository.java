package lt.karolis.hotel.repository;

import lt.karolis.hotel.repository.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    @Query(value = "SELECT * FROM customers JOIN rooms", nativeQuery = true)
    List<Reservation> getAllCustomers(Integer customerId);
}
