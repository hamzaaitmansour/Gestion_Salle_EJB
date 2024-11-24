package metier.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emploi_temps")
public class Emploi_Temps {
    // Les données d'emploi du temps :
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String typeSeance;

    //Emploi de temps est associé à une seule filière
    
    @OneToOne(mappedBy = "emploi_temps") 
    private Filiere filiere;

    //Emploi de temps contient plusieurs salles
    @ManyToMany
    @JoinTable(
        name = "emploi_salle", 
        joinColumns = @JoinColumn(name = "emploi_id"), 
        inverseJoinColumns = @JoinColumn(name = "salle_id")
    )
    private List<Salle> salles;

    //Emploi de temps contient plusieurs matieres
    
    @ManyToMany
    @JoinTable(
        name = "emploi_matiere", 
        joinColumns = @JoinColumn(name = "emploi_id"), 
        inverseJoinColumns = @JoinColumn(name = "matiere_id")
    )
    private List<Matiere> matieres;

    //Emploi de temps s'effectue par un ou plusieurs matieres
    @ManyToMany
    @JoinTable(
        name = "emploi_utilisateur", 
        joinColumns = @JoinColumn(name = "emploi_id"), 
        inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private List<Utilisateur> utilisateurs;

    // Les constructeurs :
    public Emploi_Temps() {
    }

    public Emploi_Temps(LocalDate date, LocalTime heureDebut, LocalTime heureFin, String typeSeance,
                        List<Matiere> matieres, List<Salle> salles, Filiere filiere) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.typeSeance = typeSeance;
        this.matieres = matieres;
        this.salles = salles;
        this.filiere = filiere;
    }

    // Getters et setters :
    //Le getter et setter d'id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //Le getter et setter de date 
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //Le getter et setter d'heure de debut
    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    //Le getter et setter d'heure de fin
    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    //Le getter et setter de type de seance
    public String getTypeSeance() {
        return typeSeance;
    }

    public void setTypeSeance(String typeSeance) {
        this.typeSeance = typeSeance;
    }

    //Le getter et setter de filiere
    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    //Le getter et setter de salle
    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }

    //Le getter et setter de matiere
    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }

    //Le getter et setter d'utilisateur
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
