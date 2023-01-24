package lt.karolis.hotel.repository.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "rooms")
@Getter @Setter @NoArgsConstructor @ToString
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

//    @ManyToMany
//    Set<Customers> giveReservation;

    @Column(name = "hotel")
    private String hotel;

    @Column(name = "room")
    private String room;

    @Column(name = "price")
    private Double price;

    public Room(String hotel, String room, Double price) {
        this.hotel = hotel;
        this.room = room;
        this.price = price;
    }
}