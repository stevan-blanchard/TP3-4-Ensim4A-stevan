package TP1.Stevan.TP3.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface AddressRepository extends CrudRepository<Address, Long> {
}
