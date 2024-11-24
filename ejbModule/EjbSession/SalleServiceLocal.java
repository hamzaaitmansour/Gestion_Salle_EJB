package EjbSession;

import javax.ejb.Local;
import metier.entities.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

@Local

public interface SalleServiceLocal {
	
	void ajouterSalle(String nom, String localisation, int capacite, String type,boolean disponibilite);
    
	void modifierSalle(long id, String Nom, String Localisation, int Capacite, String Type,boolean disponibilite);
    
    void supprimerSalle(long id);
    
    Salle trouverSalle(long id);
    
    List<Salle> consulterSallesDisponibles();
    
    //deplacer a reservation
    
    void libererSalleDefinitivement(long id);
    
    void libererSalleExceptionnellement(long id, LocalDate dateFinLiberation); 
    
    boolean verifierDisponibiliteSalle(Salle salle, LocalDate date, LocalTime heureDebut, LocalTime heureFin);   
    
    List<Salle> getallsalleDipo(date,typeSalle);
    
}
