package metier.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="matiere")
public class Matiere {
	//Les données de matiere:
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private int heures;

    //Matiere peut etre dans plusieurs filieres
    @ManyToOne
    @JoinColumn(name = "filiere_id")
    private Filiere filiere;

    //Matiere peut avoir plusieurs emlpois de temps
    @ManyToMany(mappedBy = "matieres")
    private List<Emploi_Temps> emploisDuTemps;

    // Constructeur par défaut
    public Matiere() {}

    // Constructeur avec paramètres
    public Matiere(String nom) {
        this.nom = nom;
    }

    // Getters et setters
    //Le getter et setter d'id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //Le getter et setter de nom:
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    //Le getter et setter d'heures:
    public void setHeures(int heures) {
		this.heures = heures;
	}
    
    public int getHeures() {
		return heures;
	}

    //Le getter et setter d'emploi du temps 
    public List<Emploi_Temps> getEmploisDuTemps() {
        return emploisDuTemps;
    }

    public void setEmploisDuTemps(List<Emploi_Temps> emploisDuTemps) {
        this.emploisDuTemps = emploisDuTemps;
    }

    //Le getter et setter de filière:
    public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
    
    public Filiere getFiliere() {
		return filiere;
	}
}
