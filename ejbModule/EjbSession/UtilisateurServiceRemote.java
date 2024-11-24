package EjbSession;


import javax.ejb.Remote;

import metier.entities.Utilisateur;
@Remote

public interface UtilisateurServiceRemote {
	 void ajouterUtilisateur(String nom, String email, String motDePasse, String role);
	 Utilisateur trouverUtilisateur(long id);
	 Utilisateur authentifier(String email, String motDePasse);

}
