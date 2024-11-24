package EjbSession;

import metier.entities.Utilisateur;

public class UtilisateurServiceImpl implements UtilisateurServiceRemote, UtilisateurServiceLocal {

	@Override
	public void ajouterUtilisateur(String nom, String email, String motDePasse, String role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Utilisateur trouverUtilisateur(long id) {
		// TODO Auto-generated method stub
		return null;
	}
   
	@Override
	public Utilisateur authentifier(String email, String motDePasse) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
