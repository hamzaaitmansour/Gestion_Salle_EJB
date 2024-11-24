package EjbSession;

import java.util.List;

import javax.ejb.Local;
import metier.entities.*;

@Local
public interface FiliereServiceLocal {
	
	
	public void AjouterFiliere(String nom,int effectif);
	
	public void ModifierFiliere();
	
	public void SupprimerFiliere(long id);
	
	List<Filiere> consulterToutesLesFilieres();
	

}
