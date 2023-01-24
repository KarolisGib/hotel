package lt.karolis.hotel.repository.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Reservation {

//    @ManyToMany
//    @JoinTable(
//            name = "Reservation",
//            joinColumns = @JoinColumn(name = "customerid"),
//            inverseJoinColumns = @JoinColumn(name = "roomid"))
//    Set<Rooms> haveReservation;
//    Set<Customers> giveReservation;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "customerid")
    private Integer customerId;

    @Column(name = "roomid")
    private Integer roomId;

    @Column(name = "startdate")
    private String startDate;

    @Column(name = "enddate")
    private String endDate;

    public Reservation(Integer customerId, Integer roomId, String startDate, String endDate) {
        this.customerId = customerId;
        this.roomId = roomId;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}