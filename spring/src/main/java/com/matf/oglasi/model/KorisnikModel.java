package com.matf.oglasi.model;

import javax.validation.constraints.Size;

public class KorisnikModel {
	
	private Integer id;
	
	@Size(min = 3, max = 30, message = "Ime korisnika ne sme da bude manje od 3, a veće od 30 karaktera.")
	private String ime;
	
	@Size(min = 3, max = 30, message = "Prezime korisnika ne sme da bude manje od 3, a veće od 30 karaktera.")
	private String prezime;
	
	@Size(min = 3, max = 30, message = "Lozinka korisnika ne sme da bude kraca od 3, a duza od 30 karaktera.")
	private String lozinka;
	
	@Size(min = 3, max = 30, message = "Korisnicko ime ne sme da bude krace od 3, a duze od 30 karaktera.")
	private String korisnickoIme;
	
	private String dozvola= "ROLE_USER";
	
	public String getDozvola() {
		return dozvola;
	}

	public void setDozvola(String dozvola) {
		this.dozvola = dozvola;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
