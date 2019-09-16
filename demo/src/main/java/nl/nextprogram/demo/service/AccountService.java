package nl.nextprogram.demo.service;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.nextprogram.demo.tools.HashWachtwoord;
import nl.nextprogram.demo.domain.Account;
import nl.nextprogram.demo.repository.AccountRepository;
 
@Service
@Transactional
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;


	public Account save(Account account) {
		return accountRepository.save(account);
	}

	public Optional<Account> findById(long id) {
		return accountRepository.findById(id);
	}

	public Optional<Account> findByEmail(String email) {
		return accountRepository.findByEmail(email);
	}
	
	public Iterable<Account> findAll() {
		return accountRepository.findAll();
	}

	public void deleteById(long id) {
		accountRepository.deleteById(id);
	}
	
	@PostConstruct
	public void initPersonen() {
		
		Account john  = accountRepository.save(new Account("John", HashWachtwoord.md5("john"), "Amsterdam", "email1@gmail.pk"));
	}
	
}
