package lt.karolis.hotel.bootstrap;

import lt.karolis.hotel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class BootStrapData implements CommandLineRunner {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n===========================================================\n");
        reservationRepository.findAll().forEach(System.out::println);
        System.out.println("\n===========================================================\n");
        System.out.println(reservationRepository.findById(1));
    }
}
