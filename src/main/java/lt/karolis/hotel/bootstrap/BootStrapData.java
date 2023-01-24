package lt.karolis.hotel.bootstrap;

import lt.karolis.hotel.repository.CustomerRepository;
import lt.karolis.hotel.repository.ReservationRepository;
import lt.karolis.hotel.repository.RoomRepository;
import lt.karolis.hotel.repository.model.Customer;
import lt.karolis.hotel.repository.model.Reservation;
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

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n===========================================================\n");

//        Room room = new Room("hotel_name", "room_102", 25.59);
//        roomRepository.save(room);
        roomRepository.findAll().forEach(System.out::println);

        System.out.println("\n===========================================================\n");

//        Customer customer01 = new Customer("Customer_name_01","surname_01","asdfa","asdf@asd.df");
//        Customer customer02 = new Customer("Customer_name_02","surname_02","987654","dddds@asd.df");
//        customerRepository.save(customer01);
//        customerRepository.save(customer02);
        customerRepository.findAll().forEach(System.out::println);

        System.out.println("\n===========================================================\n");

//        Reservation reservation01 = new Reservation(1,2,"2023-01-24","2023-01-25");
//        Reservation reservation02 = new Reservation(2,1,"2023-01-26","2023-01-30");
//        reservationRepository.save(reservation01);
//        reservationRepository.save(reservation02);
        reservationRepository.findAll().forEach(System.out::println);

        System.out.println("\n===========================================================\n");
        System.out.println(reservationRepository.findById(1));

    }
}
