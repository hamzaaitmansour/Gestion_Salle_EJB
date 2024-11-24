package EjbSession;
import java.time.LocalDateTime;
	import java.util.List;

import javax.ejb.Local;
import metier.entities.*;
	@Local
public interface ReservationServiceLocal {
	

	
	    
		 void demanderReservation(String natureSeance, LocalDateTime dateDebut, LocalDateTime dateFin, Filiere filiere);

	    
	    void annulerReservation(long id);


	   
	    List<Reservation> consulterReservationsParUtilisateur(Utilisateur utilisateur);

	   
	    List<Reservation> consulterReservationsParSalle(Salle salle);

	  
	    List<Reservation> consulterToutesLesReservations();

	   
	    Reservation trouverReservationParId(long id);
	    
	    String proposerAlternative(String natureSeance, LocalDateTime dateDebut, LocalDateTime dateFin, Filiere filiere);
	    
	    
	

}
