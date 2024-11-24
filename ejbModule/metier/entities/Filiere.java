package metier.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="filiere")
public class Filiere {
    // Les données de filière:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private int effectif;

    //Filiere a un seul emploi de temps
    @OneToOne
    @JoinColumn(name = "emploiDuTemps_id") 
    private Emploi_Temps emploi_temps;

    //Filiere peut etre associe a une ou plusieurs matieres
    @OneToMany(mappedBy = "filiere")
    private List<Matiere> matieres;

    // Les constructeurs:
    public Filiere() {
    }
    //Le constructeur avec paramètres
    public Filiere(String nom, int effectif, Emploi_Temps emploi, List<Matiere> mat) {
        this.nom = nom;
        this.effectif = effectif;
        this.emploi_temps = emploi;
        this.matieres = mat;
    }

    // Getters et setters:
    //Le getter et setter d'id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //Le getter et setter de nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //Le getter et setter d'effectif
    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    //Le getter et setter d'emploi de temps
    public Emploi_Temps getEmploi_temps() {
        return emploi_temps;
    }

    public void setEmploi_temps(Emploi_Temps emploi_temps) {
        this.emploi_temps = emploi_temps;
    }

    //Le getter et setter de matiere
    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }
}
