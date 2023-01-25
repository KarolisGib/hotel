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

import java.util.Arrays;
import java.util.NoSuchElementException;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RoomRepository roomRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n===========================================================\n");

        Room room01 = findRoom(1);
        Room room02 = findRoom(2);
        roomRepository.findAll().forEach(System.out::println);

        System.out.println("\n===========================================================\n");

        Customer customer01 = findCustomer(1);
        Customer customer02 = findCustomer(2);

        customerRepository.findAll().forEach(System.out::println);

        System.out.println("\n===========================================================\n");

        Reservation reservation01 = new Reservation(customer01, room02, "2023-01-01", "2023-01-05");
        Reservation reservation02 = new Reservation(customer02, room01, "2023-01-26", "2023-01-30");
        Reservation reservation03 = new Reservation(customer01, room02, "2023-01-10", "2023-01-12");
        Reservation reservation04 = new Reservation(customer01, room01, "2023-01-24", "2023-01-25");
        reservationRepository.save(reservation01);
        reservationRepository.save(reservation02);
        reservationRepository.save(reservation02);
        reservationRepository.save(reservation02);
        reservationRepository.saveAll(Arrays.asList(reservation01, reservation02, reservation03,reservation04));
        reservationRepository.findAll().forEach(System.out::println);


        System.out.println("\n===========================================================\n");
        System.out.println(reservationRepository.findById(1));
        System.out.println(reservationRepository.findById(1).get().getId());
        System.out.println(reservationRepository.findById(1).get().getEndDate());
        System.out.println(reservationRepository.findById(1).get().getStartDate());
        System.out.println("\n" + reservationRepository.findById(1).get().getCustomer());
        System.out.println(reservationRepository.findById(1).get().getCustomer().getId());
        System.out.println(reservationRepository.findById(1).get().getCustomer().getName());
        System.out.println(reservationRepository.findById(1).get().getCustomer().getSurname());
        System.out.println(reservationRepository.findById(1).get().getCustomer().getPhone());
        System.out.println(reservationRepository.findById(1).get().getCustomer().getEmail());

        System.out.println("\n===========================================================\n");

        Customer customer = customerRepository.findById(1).get();
        System.out.println(customer);

        customerRepository.findById(1).get().getReservations().forEach(System.out::println);

    }

    private Customer findCustomer(int customerId) {

        Customer customer;

        try {
            customer = customerRepository.findById(customerId).get();
        } catch (NoSuchElementException e) {
            customer = new Customer(
                    customerId, "Customer_name_01", "surname_01", "asdfa", "asdf@asd.df"
            );
            customerRepository.save(customer);
        }
        return customer;
    }

    private Room findRoom(int roomId) {

        Room room;

        try {
            room = roomRepository.findById(roomId).get();
        } catch (NoSuchElementException e) {
            room = new Room(
                    roomId, "Kaunas", "luxury", 249.00
            );
            roomRepository.save(room);
        }
        return room;
    }
}