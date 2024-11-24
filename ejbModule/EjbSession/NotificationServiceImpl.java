package EjbSession;

import java.util.List;

import metier.entities.Notification;
import metier.entities.Utilisateur;

public class NotificationServiceImpl implements NotificationServiceLocal, NotificationServiceRemote {

	@Override
	public void envoyerNotification(Utilisateur utilisateur, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Notification> consulterNotificationsParUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerNotification(long id) {
		// TODO Auto-generated method stub
		
	}

}
