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
@RequestMapping(path = "/template") //http://localhost:8080/template

public class ReservationTemplateController {
    @Autowired
    private ReservationService reservationService;


    //http://localhost:8080/template/reservation/1
    @GetMapping(path = "/reservation/{id}")
    public String getReservationTemplateById(Model model, @PathVariable Integer id) {

        Reservation reservation = reservationService.getReservationById(id);
        model.addAttribute("reservation_id", reservation.getId());
        model.addAttribute("name", reservation.getCustomer().getName());
        model.addAttribute("surname", reservation.getCustomer().getSurname());
        model.addAttribute("phone", reservation.getCustomer().getPhone());
        model.addAttribute("email", reservation.getCustomer().getEmail());
        model.addAttribute("city", reservation.getRoom().getCity());
        model.addAttribute("room", reservation.getRoom().getRoom());
        model.addAttribute("price", reservation.getRoom().getPrice());
        model.addAttribute("startDate", reservation.getStartDate());
        model.addAttribute("endDate", reservation.getEndDate());
        return "/pages/reservation_template";
    }

    //    http://localhost:8080/template/reservation/getandpost
    @RequestMapping(value = "/reservation/getandpost", method = RequestMethod.GET)
    public String getReservationById(Model model) {
        model.addAttribute("key_reservation", new Reservation());
        model.addAttribute("key_reservations", Collections.emptyList());
        return "/pages/get_post_reservation";
    }

    @RequestMapping(value = "/reservation/getandpost", method = RequestMethod.POST)
    public String postReservationById(
            Model model, @ModelAttribute(value = "key_reservation") Reservation reservation) {
        reservationService.getReservationById(reservation.getId());
        model.addAttribute("key_reservations", reservation);
        return "/pages/get_post_reservation";
    }
}