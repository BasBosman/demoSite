package nl.nextprogram.demo.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String naam;
	private String wachtwoord;
	private String woonplaats;
	private String aanmaakdatum;
	
	//@ManyToOne
	
	@Column(unique=true)
	private String email;
	
//	@OneToMany
//	private Set<Review>reviews;
	
	public Account() {}
	public Account(String naam, String watchwoord, String woonplaats, String email) {
		this.naam = naam;
		this.wachtwoord = watchwoord;
		this.woonplaats = woonplaats;
		this.email = email;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy",Locale.ENGLISH);
		LocalDate date = LocalDate.now();
		
		this.aanmaakdatum = formatter.format(date);
//		this.reviews = new HashSet<Review>();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	public String getWoonplaats() {
		return woonplaats;
	}
	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}
	public String getAanmaakdatum() {
		return aanmaakdatum;
	}
	public void setAanmaakdatum(String aanmaakdatum) {
		this.aanmaakdatum = aanmaakdatum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}