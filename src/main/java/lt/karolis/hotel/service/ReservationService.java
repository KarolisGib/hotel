package lt.karolis.hotel.service;

import lt.karolis.hotel.repository.model.Reservation;
import lt.karolis.hotel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation getReservationById(Integer id) {
        return reservationRepository.findById(id).get();
    }

    public Reservation getReservationByStartDate(String startDate) {
        return reservationRepository.findByStartDate(startDate).get();
    }
}
