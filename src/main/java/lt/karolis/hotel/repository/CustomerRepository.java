package lt.karolis.hotel.repository;

import lt.karolis.hotel.repository.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
