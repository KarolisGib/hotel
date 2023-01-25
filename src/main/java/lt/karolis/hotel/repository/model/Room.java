package lt.karolis.hotel.repository.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "rooms")
@Getter @Setter @NoArgsConstructor @ToString
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id")
    private Integer id;

    @ToString.Exclude
    @OneToMany(mappedBy = "room", fetch = FetchType.EAGER)
    private List<Reservation> reservations;

    @Column(name = "hotel")
    private String hotel;

    @Column(name = "room")
    private String room;

    @Column(name = "price")
    private Double price;

    public Room(Integer id, String hotel, String room, Double price) {
        this.id = id;
        this.hotel = hotel;
        this.room = room;
        this.price = price;
    }

    public Room(Integer id, List<Reservation> reservations, String hotel, String room, Double price) {
        this.id = id;
        this.reservations = reservations;
        this.hotel = hotel;
        this.room = room;
        this.price = price;
    }
}