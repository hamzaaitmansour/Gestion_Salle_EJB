package EjbSession;
import java.util.List;

import javax.ejb.Local;

import metier.entities.Filiere;
import metier.entities.Matiere;
@Local

public interface MatiereServiceLocal {
	 void ajouterMatiere(String nom, int chargeHoraire);
	    void modifierMatiere(long id, String Nom, int ChargeHoraire);
	    void supprimerMatiere(long id);
	    List<Matiere> consulterMatieresParFiliere(Filiere filiere);
	
	
}
