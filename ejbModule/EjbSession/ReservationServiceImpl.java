package EjbSession;

import java.time.LocalDateTime;
import java.util.List;

import metier.entities.Filiere;
import metier.entities.Reservation;
import metier.entities.Salle;
import metier.entities.Utilisateur;

public class ReservationServiceImpl implements ReservationServiceRemote, ReservationServiceLocal {

	

	@Override
	public void annulerReservation(long id) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public List<Reservation> consulterReservationsParUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> consulterReservationsParSalle(Salle salle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> consulterToutesLesReservations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation trouverReservationParId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void demanderReservation(String natureSeance, LocalDateTime dateDebut, LocalDateTime dateFin,
			Filiere filiere) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String proposerAlternative(String natureSeance, LocalDateTime dateDebut, LocalDateTime dateFin,
			Filiere filiere) {
		// TODO Auto-generated method stub
		return null;
	}

}
