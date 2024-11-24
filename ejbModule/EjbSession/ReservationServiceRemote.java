package EjbSession;

import java.time.LocalDateTime;
import java.util.List;	
import javax.ejb.Remote;
import metier.entities.*;

@Remote

public interface ReservationServiceRemote {		
//creer une reservation par user	
void demanderReservation(id_user,id_salle,String natureSeance, LocalDateTime dateDebut, LocalDateTime dateFin, Filiere filiere);
// si salle dispo   
// si defintimenet
void annulerReservation(long id);
//si defintimenet
void annulerReservationExceptionnel(long id,date_fin,date_debut); 
//suprrimer la reservation et rendre la salle dispo --20hour , ---prof annuler

//List<Reservation> consulterReservationsParUtilisateur(Utilisateur utilisateur);
   		   
//List<Reservation> consulterReservationsParSalle(Salle salle);
		  
List<Reservation> consulterToutesLesReservations();
//get reservation		   
Reservation trouverReservationParId(long id); 
// 
// String proposerAlternative(String natureSeance, LocalDateTime dateDebut, LocalDateTime dateFin, Filiere filiere);
// 
// 
}
