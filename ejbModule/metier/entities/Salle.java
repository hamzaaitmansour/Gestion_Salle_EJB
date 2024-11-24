package metier.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="salle")
public class Salle {
	//Les données de salle:
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String localisation;
    private int capacite;
    private String type;
    private boolean disponibilite;
    

    //Salle a une plusseule reservation
    @OneToMany(mappedBy = "salle")
    private List<Reservation> reservations;
    
    

    //Salle peut avoir plusieurs emplois de temps
    @ManyToMany(mappedBy = "salles")
    private List<Emploi_Temps> emploisDuTemps;
	
    
	//Les constructeurs:
	//Le constructeur par defaut:
	public Salle() {
		
	}
	//Le constructeur avec les données:
	public Salle(String nom , String localisation , int cap , String ty, boolean disp , List<Reservation> reserv ) {
		this.nom=nom;
		this.localisation=localisation;
		this.capacite=cap;
		this.type=ty;
		this.disponibilite=disp;
		this.reservations=reserv;
	}
	
	//Les getters et setters:
	//Le getter et setter d'id:
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	//Le getter et setter de nom:
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	//le getter et setter de localisation:
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	
	public String getLocalisation() {
		return localisation;
	}
	
	//le getter et setter de capacite:
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	public int getCapacite() {
		return capacite;
	}
	
	//Le getter et setter de disponibilite:
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	
	public boolean getDisponibilite() {
		return disponibilite;
	}
	
	//Le getter et setter de reservation:
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public List<Reservation> getReservations() {
		return reservations;
	}
	
	
	
	
}
