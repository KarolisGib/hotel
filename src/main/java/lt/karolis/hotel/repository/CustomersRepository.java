package lt.karolis.hotel.repository;

import lt.karolis.hotel.repository.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Integer> {

}
