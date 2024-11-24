package metier.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation {
	//Les données de reservations:
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime creneauHoraire;
    private String typeSeance;
    private String statut;

    //Reservation peut etre fait pour plusieurs salle 
    @ManyToOne
    @JoinColumn(name = "salle_id")
    private Salle salle;

    //Reservation se fait par un seul utilisateur
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
	
	//Les constructeurs:
	//Le constructeur par defaut:
	public Reservation() {
		
	}
	
	//Le constructeur avec les données:
	public Reservation(String typeSeance , LocalDateTime crenea , String statu, Salle salle , Utilisateur utilis ) {
		this.typeSeance=typeSeance;
		this.creneauHoraire=crenea;
		this.statut=statu;
		this.salle = salle;
		this.utilisateur=utilis;
	}
	
	//Les getters et setters :
	//Le getter et setter d'id:
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	//Le getter et setter de typeSeance:
	public void setTypeSeance(String typeSeance) {
		this.typeSeance = typeSeance;
	}
	
	public String getTypeSeance() {
		return typeSeance;
	}
	
	
	//Le getter et setter de statut:
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public String getStatut() {
		return statut;
	}
	
	//Le setter et getter de salle:
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	public Salle getSalle() {
		return salle;
	}
	
	
	//Le getter et setter d'utilisateur:
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	
	
}
