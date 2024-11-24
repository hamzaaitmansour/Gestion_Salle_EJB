package EjbSession;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.ejb.Local;
import metier.entities.Emploi_Temps;
import metier.entities.Filiere;
import metier.entities.Matiere;
import metier.entities.Salle;
@Local

public interface EmploiServiceLocal {

void ajouterEmploiTemps(LocalDate date, LocalTime heureDebut, LocalTime heureFin, String typeSeance, 

List<Matiere> matieres, List<Salle> salles, Filiere filiere);
void supprimerEmploiTemps(long id);
void modifierEmploiTemps(long id, LocalDate nouvelleDate, LocalTime nouvelleHeureDebut, LocalTime nouvelleHeureFin, String nouveauTypeSeance, 
List<Matiere> nouvellesMatieres, List<Salle> nouvellesSalles, Filiere nouvelleFiliere);
List<Emploi_Temps> listerTousLesEmploisTemps();  
List<Emploi_Temps> trouverParFiliere(Filiere filiere);   
}
