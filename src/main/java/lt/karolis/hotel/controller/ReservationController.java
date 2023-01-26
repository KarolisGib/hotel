package lt.karolis.hotel.controller;

import lt.karolis.hotel.repository.model.Reservation;
import lt.karolis.hotel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller //http://localhost:8080/
@RequestMapping(path = "/reservationmapping") //http://localhost:8080/reservationmapping

public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping(path = "/reservation/{id}") //http://localhost:8080/reservationmapping/reservation/1
    public @ResponseBody Reservation getReservationById(@PathVariable Integer id) {
        return reservationService.getReservationById(id);
    }
}
