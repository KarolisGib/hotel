package lt.karolis.hotel.repository.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "rooms")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id")
    private Integer id;

    @ToString.Exclude
    @OneToMany(mappedBy = "room", fetch = FetchType.EAGER)
    private List<Reservation> reservations;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "room", nullable = false)
    private String room;

    @Column(name = "price", nullable = false)
    private Double price;

    public Room(String city, String room, Double price) {
        this.city = city;
        this.room = room;
        this.price = price;
    }

    public Room(Integer id, String city, String room, Double price) {
        this.id = id;
        this.city = city;
        this.room = room;
        this.price = price;
    }
}