package com.matf.oglasi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matf.oglasi.dao.AutomobilDao;
import com.matf.oglasi.dao.KorisnikDao;
import com.matf.oglasi.domain.Automobil;
import com.matf.oglasi.domain.Korisnik;
import com.matf.oglasi.model.AutomobilModel;
import com.matf.oglasi.model.KorisnikModel;
import com.matf.oglasi.service.KorisnikService;

@Service
public class KorisnikServiceImpl implements KorisnikService {

	@Autowired
	private KorisnikDao korisnikDao;
	
	@Override
	@Transactional
	public boolean dodajKorisnik(KorisnikModel noviKorisnik) {
		Korisnik korisnik = new Korisnik();
		korisnik.setId(noviKorisnik.getId());
		korisnik.setIme(noviKorisnik.getIme());
		korisnik.setPrezime(noviKorisnik.getPrezime());
		korisnik.setEmail(noviKorisnik.getEmail());
		korisnik.setLozinka(noviKorisnik.getLozinka());
		korisnik.setKorisnickoIme(noviKorisnik.getKorisnickoIme());
		korisnik.setDozvola(noviKorisnik.getDozvola());
		
		korisnikDao.dodajKorisnik(korisnik);
		
		return true;
	}
	
	@Override
	public List<KorisnikModel> listaKorisnika() {
		List<KorisnikModel> listaKorisnika = new ArrayList<KorisnikModel>();
		for (Korisnik korisnik : korisnikDao.listaKorisnika()) {
			KorisnikModel korisnikModel = new KorisnikModel();
			korisnikModel.setId(korisnik.getId());
			korisnikModel.setIme(korisnik.getIme());
			korisnikModel.setPrezime(korisnik.getPrezime());
			korisnikModel.setEmail(korisnik.getEmail());
			korisnikModel.setLozinka(korisnik.getLozinka());
			korisnikModel.setKorisnickoIme(korisnik.getKorisnickoIme());
			korisnikModel.setDozvola(korisnik.getDozvola());
			
			listaKorisnika.add(korisnikModel);
		}
		
		return listaKorisnika;
	}
	
	@Override
	public KorisnikModel vratiKorisnik(int id) {
		Korisnik korisnik = korisnikDao.vratiKorisnik(id);
		
		KorisnikModel korisnikModel = new KorisnikModel();
		korisnikModel.setId(korisnik.getId());
		korisnikModel.setIme(korisnik.getIme());
		korisnikModel.setPrezime(korisnik.getPrezime());
		korisnikModel.setEmail(korisnik.getEmail());
		korisnikModel.setLozinka(korisnik.getLozinka());
		korisnikModel.setKorisnickoIme(korisnik.getKorisnickoIme());
		korisnikModel.setDozvola(korisnik.getDozvola());		
		
		return korisnikModel;
	}
	
	@Override
	public List<KorisnikModel> listaKorisnikaPoKorisnickomImenu(String nik) {
		List<KorisnikModel> listaKorisnika = new ArrayList<KorisnikModel>();
		for (Korisnik korisnik : korisnikDao.listaKorisnika()) {
			KorisnikModel korisnikModel = new KorisnikModel();
			korisnikModel.setId(korisnik.getId());
			korisnikModel.setIme(korisnik.getIme());
			korisnikModel.setPrezime(korisnik.getPrezime());
			korisnikModel.setEmail(korisnik.getEmail());
			korisnikModel.setLozinka(korisnik.getLozinka());
			korisnikModel.setKorisnickoIme(korisnik.getKorisnickoIme());
			korisnikModel.setDozvola(korisnik.getDozvola());
			
			listaKorisnika.add(korisnikModel);
		}
		
		return listaKorisnika;
	}

	public KorisnikDao getKorisnikDao() {
		return korisnikDao;
	}

	public void setKorisnikDao(KorisnikDao korisnikDao) {
		this.korisnikDao = korisnikDao;
	}

}
