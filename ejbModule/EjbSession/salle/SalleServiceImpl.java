package EjbSession.salle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import EjbSession.SalleServiceLocal;
import EjbSession.SalleServiceRemote;
import metier.entities.Salle;

public class SalleServiceImpl implements SalleServiceRemote, SalleServiceLocal {

	@Override
	public void ajouterSalle(String nom, String localisation, int capacite, String type, boolean disponibilite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierSalle(long id, String Nom, String Localisation, int Capacite, String Type,
			boolean disponibilite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerSalle(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Salle trouverSalle(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Salle> consulterSallesDisponibles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void libererSalleDefinitivement(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void libererSalleExceptionnellement(long id, LocalDate dateFinLiberation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifierDisponibiliteSalle(Salle salle, LocalDate date, LocalTime heureDebut, LocalTime heureFin) {
		// TODO Auto-generated method stub
		return false;
	}

}
