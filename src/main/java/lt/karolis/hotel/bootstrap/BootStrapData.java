package lt.karolis.hotel.bootstrap;

import lt.karolis.hotel.repository.ReservationRepository;
import lt.karolis.hotel.repository.RoomRepository;
import lt.karolis.hotel.repository.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class BootStrapData implements CommandLineRunner {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n===========================================================\n");

        Room room = new Room("hotel_name", "room_102", 25.59);
        roomRepository.save(room);
        roomRepository.findAll().forEach(System.out::println);

        System.out.println("\n===========================================================\n");
        reservationRepository.findAll().forEach(System.out::println);
        System.out.println("\n===========================================================\n");
        System.out.println(reservationRepository.findById(1));

    }
}
