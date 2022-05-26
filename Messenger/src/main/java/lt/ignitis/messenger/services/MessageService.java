package lt.ignitis.messenger.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lt.ignitis.messenger.classes.ClientsCount;
import lt.ignitis.messenger.classes.MessageFirstDate;
import lt.ignitis.messenger.classes.MessageLastDate;
import lt.ignitis.messenger.classes.MessagesAvarageLength;
import lt.ignitis.messenger.classes.MessagesCount;
import lt.ignitis.messenger.classes.MessagesLastText;
import lt.ignitis.messenger.entities.Message;
import lt.ignitis.messenger.repositories.MessageRepository;



public class MessageService {
	@Autowired
	MessageRepository messageRepository;
	
	public List<Message> getMessage(){
		return messageRepository.findAll();
	}
	
	public Message saveMessage(Message message) {
		return messageRepository.save(message);
	}
	
	
	public Message getMessage(Integer id) {
		return messageRepository.findById(id).orElse(null);
	}
	
	
	public Message updateMessage(Message s) {
		Message old=this.getMessage(s.getId());
		old.setClient(s.getClient());
		old.setCreated(s.getCreated());
		old.setMessage(s.getMessage());
		
		messageRepository.save(old);
		return old;
	}
	
	public void deleteMessage(Integer id) {
		messageRepository.deleteById(id);
	}
	
	
	public Message findByClientId(Integer id) {
		return messageRepository.findByClientId(id);
	}

	public List<ClientsCount> clientsCount(){
		return messageRepository.clientsCount();
	}
	
	public List<MessagesCount> messagesCount(String username) {
		return messageRepository.messagesCount(username);
	}
	
	public List<MessageFirstDate> messageFirstDate(String username) {
		return messageRepository.messageFirstDate(username);
	}
	
	public List<MessageLastDate> messageLastDate(String username) {
		return messageRepository.messageLastDate(username);
	}
	
	public List<MessagesAvarageLength> messagesAvarageLength(String username) {
		return messageRepository.messagesAvarageLength(username);
	}
	
	public List<MessagesLastText> messagesLastText(String username) {
		return messageRepository.messagesLastText(username);
	}
}