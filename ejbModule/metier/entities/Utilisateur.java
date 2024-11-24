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
@Table(name="utilisateur")
public class Utilisateur {
	//Les données d'utilisateur
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String email;
    private String motDePasse;
    private String role;

    //Utilisateur peut recevoir une ou plusieurs notification
    @OneToMany(mappedBy = "destinataire")  
    private List<Notification> notifications;

    //Utilisateur peut effectuer une ou plusieurs reservations
    @OneToMany(mappedBy = "utilisateur")
    private List<Reservation> reservations;

    //Utilisateur peut effectuer un ou plusieurs emplois de temps 
    @ManyToMany(mappedBy = "utilisateurs")
    private List<Emploi_Temps> emploisDuTemps;
    
    //Les constructeur:
    //Le constructeur sans parametres:
    public Utilisateur() {
		
	}
    //Constructeur avec parametres


    // Getters et Setters
    //Le getter et setter d'id:
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //Le getter et setter de nom:
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //Le getter et setter d'email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Le getter et setter 
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //Le getter et setter de mot passe 
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    //Le getter et setter d'emploi de temps
    public List<Emploi_Temps> getEmploisDuTemps() {
        return emploisDuTemps;
    }

    public void setEmploisDuTemps(List<Emploi_Temps> emploisDuTemps) {
        this.emploisDuTemps = emploisDuTemps;
    }

    //Le getter et setter de reservation
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    //Le getter et setter de notification
    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
