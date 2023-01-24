package lt.karolis.hotel.repository.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Table(name = "reservation")
@Getter @Setter @NoArgsConstructor @ToString
public class Reservation {

    @ManyToMany
    @JoinTable(
            name = "Reservation",
            joinColumns = @JoinColumn(name = "customerid"),
            inverseJoinColumns = @JoinColumn(name = "roomid"))
    Set<Rooms> haveReservation;
    Set<Customers> giveReservation;

    @Id
    @Column(name = "customerid")
    private Integer customerId;

    @Column(name = "roomid")
    private Integer roomId;

    @Column(name = "startdate")
    private String startDate;

    @Column(name = "enddate")
    private String endDate;
}