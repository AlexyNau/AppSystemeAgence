package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IVenteDao;
import fr.adaming.model.Vente;

@Service
@Transactional
public class VenteServiceImpl implements IVenteService {

	@Autowired
	private IVenteDao venteDao;
	
	public void setVenteDao(IVenteDao venteDao) {
		this.venteDao = venteDao;
	}

	@Override
	public List<Vente> getAllVente() {
		return venteDao.getAllVente();
	}

	@Override
	public Vente getVenteById(int idVente) {
		return venteDao.getVenteById(idVente);
	}

	@Override
	public Vente updateVente(Vente vente) {
		return venteDao.updateVente(vente);
	}

	@Override
	public Vente addVente(Vente vente) {
		return venteDao.addVente(vente);
	}

	@Override
	public int deleteVente(int idVente) {
		return venteDao.deleteVente(idVente);
	}
	
	

}
