package lt.karolis.hotel.service;

import lt.karolis.hotel.repository.model.Reservation;
import lt.karolis.hotel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;


    public Reservation getReservationById(int id) {
        return reservationRepository.findById(id).get();
    }

    public List<Reservation> getQueryAllCustomers() {
        return reservationRepository.getAllCustomers();
    }
}
