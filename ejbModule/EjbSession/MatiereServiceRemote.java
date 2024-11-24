package EjbSession;

import java.util.List;


import javax.ejb.Remote;

import metier.entities.Filiere;
import metier.entities.Matiere;
@Remote

public interface MatiereServiceRemote {
	 void ajouterMatiere(String nom, int chargeHoraire);
	    void modifierMatiere(long id, String Nom, int ChargeHoraire);
	    void supprimerMatiere(long id);
	    List<Matiere> consulterMatieresParFiliere(Filiere filiere);
	
	
}
