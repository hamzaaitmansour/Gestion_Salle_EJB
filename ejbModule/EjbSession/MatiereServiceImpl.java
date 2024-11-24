
package EjbSession;

import java.util.List;

import metier.entities.Filiere;
import metier.entities.Matiere;

public class MatiereServiceImpl implements MatiereServiceLocal, MatiereServiceRemote {

	

	@Override
	public void ajouterMatiere(String nom, int chargeHoraire) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierMatiere(long id, String Nom, int ChargeHoraire) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerMatiere(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Matiere> consulterMatieresParFiliere(Filiere filiere) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
