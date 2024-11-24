package EjbSession;

import javax.ejb.Local;

import metier.entities.Utilisateur;
@Local

public interface UtilisateurServiceLocal {
	 void ajouterUtilisateur(String nom, String email, String motDePasse, String role);
	 Utilisateur trouverUtilisateur(long id);
	 Utilisateur authentifier(String email, String motDePasse);

}
