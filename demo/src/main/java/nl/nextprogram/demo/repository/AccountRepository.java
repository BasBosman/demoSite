package nl.nextprogram.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nl.nextprogram.demo.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

	Optional<Account> findByEmail(String email);

}
