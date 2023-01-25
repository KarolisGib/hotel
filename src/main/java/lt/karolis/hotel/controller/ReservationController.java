package lt.karolis.hotel.controller;

import lt.karolis.hotel.repository.model.Reservation;
import lt.karolis.hotel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller //http://localhost:8080/
@RequestMapping(path = "/reservationmapping") //http://localhost:8080/reservationmapping

public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping(path = "/allcustomers") //http://localhost:8080/reservationmapping/allcustomers

    public @ResponseBody List<Reservation> getQuerryAllCustomers() {
        return reservationService.getQueryAllCustomers();
    }
}
