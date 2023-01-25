package lt.karolis.hotel.repository.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Integer id;

    @ToString.Exclude
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<Reservation> reservations;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    public Customer(Integer id, String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public Customer(Integer id, List<Reservation> reservations, String name, String surname, String phone, String email) {
        this.id = id;
        this.reservations = reservations;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }
}