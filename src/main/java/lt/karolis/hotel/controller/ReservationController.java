package lt.karolis.hotel.controller;

import lt.karolis.hotel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //http://localhost:8080/
@RequestMapping(path = "/reservationmapping") //http://localhost:8080/reservationmapping

public class ReservationController {

    @Autowired
    private ReservationService reservationService;

}
