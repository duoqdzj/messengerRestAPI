package lt.ignitis.messenger.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import lt.ignitis.messenger.classes.ClientsCount;
import lt.ignitis.messenger.classes.MessageFirstDate;
import lt.ignitis.messenger.classes.MessageLastDate;
import lt.ignitis.messenger.classes.MessagesAvarageLength;
import lt.ignitis.messenger.classes.MessagesCount;
import lt.ignitis.messenger.classes.MessagesLastText;
import lt.ignitis.messenger.entities.Message;


public interface MessageRepository extends JpaRepository<Message, Integer>  {

	Message findByClientId(Integer id); 
	
	
	@Query("SELECT new lt.ignitis.messenger.classes.ClientsCount(c.name, count(*)) FROM client c GROUP BY c.id")
	List<ClientsCount> clientsCount();
	
	
	@Query("SELECT new lt.ignitis.messenger.classes.MessagesCount(c.author, count(*)) FROM client c LEFT JOIN message r ON c.username = r.name GROUP BY c.username")
	List<MessagesCount> messagesCount(String username);
	
	
	@Query("SELECT new lt.ignitis.messenger.classes.MessageFirstDate(c.author, r.created) FROM client c LEFT JOIN message r ON c.username = r.name GROUP BY r.created ASC LIMIT 1")
	List<MessageFirstDate> messageFirstDate(String username);
	
	
	@Query("SELECT new lt.ignitis.messenger.classes.MessageLastDate(c.author, r.created) FROM client c LEFT JOIN message r ON c.username = r.name GROUP BY r.created DESC LIMIT 1")
	List<MessageLastDate> messageLastDate(String username);
	
	
	@Query("SELECT new lt.ignitis.messenger.classes.MessagesAvarageLength(c.author, avg(length(r.message))) FROM client c LEFT JOIN message r ON c.username = r.name GROUP BY c.username")
	List<MessagesAvarageLength> messagesAvarageLength(String username);
	
	
	@Query("SELECT new lt.ignitis.messenger.classes.MessagesLastText(c.author, r.message) FROM client c LEFT JOIN message r ON c.username = r.name GROUP BY r.created DESC LIMIT 1")
	List<MessagesLastText> messagesLastText(String username);
	
	
	
	
	

}
