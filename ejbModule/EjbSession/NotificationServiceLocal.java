package EjbSession;
import java.util.List;
import metier.entities.*;
import javax.ejb.Local;
@Local



public interface NotificationServiceLocal {
	void envoyerNotification(Utilisateur utilisateur, String message);
    List<Notification> consulterNotificationsParUtilisateur(Utilisateur utilisateur);
    void supprimerNotification(long id);
}
