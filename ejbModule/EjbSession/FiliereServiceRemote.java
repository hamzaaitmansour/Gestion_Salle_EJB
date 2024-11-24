package EjbSession;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Filiere;

@Remote
public interface FiliereServiceRemote {
public void AjouterFiliere(String nom,int effectif);
	
	public void ModifierFiliere();
	
	public void SupprimerFiliere(long id);
	
	List<Filiere> consulterToutesLesFilieres();
	
}
