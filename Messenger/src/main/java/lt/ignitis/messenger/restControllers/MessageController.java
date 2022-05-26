package lt.ignitis.messenger.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.ignitis.messenger.classes.ClientsCount;
import lt.ignitis.messenger.classes.MessageFirstDate;
import lt.ignitis.messenger.classes.MessageLastDate;
import lt.ignitis.messenger.classes.MessagesAvarageLength;
import lt.ignitis.messenger.classes.MessagesCount;
import lt.ignitis.messenger.classes.MessagesLastText;
import lt.ignitis.messenger.entities.Message;
import lt.ignitis.messenger.services.MessageService;

@RestController
@RequestMapping("/")
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	@CrossOrigin
	@GetMapping("/getAllMessage")
	public List<Message> index(){
		return messageService.getMessage();
	}
	
	@CrossOrigin
	@PostMapping("/createMessage")
	public Message add(@RequestBody Message s)
	{
		return messageService.saveMessage(s);
	}
	
	@CrossOrigin
	@PatchMapping("/editMessage/{id}")
	public Message update(@PathVariable Integer id, @RequestBody Message s) {
		
		return messageService.updateMessage(s);
	}
	
	@CrossOrigin
	@DeleteMapping("/deleteMessage/{id}")
	public Boolean delete(@PathVariable Integer id) {
		messageService.deleteMessage(id);
		return true;
	}
	
	
	@CrossOrigin
	@GetMapping("/statistic/clientscount")
	public List<ClientsCount> clientscount(){
		return messageService.clientsCount();
	}
	
	@CrossOrigin
	@GetMapping("/statistic/messagescount/{username}")
	public List<MessagesCount> messagesCount(@PathVariable String username){
		return messageService.messagesCount(username);
	}
	
	@CrossOrigin
	@GetMapping("/statistic/messagefirstdate/{username}")
	public List<MessageFirstDate> messageFirstDate(@PathVariable String username){
		return messageService.messageFirstDate(username);
	}
	
	@CrossOrigin
	@GetMapping("/statistic/messagelastdate/{username}")
	public List<MessageLastDate> messageLastDate(@PathVariable String username){
		return messageService.messageLastDate(username);
	}
	
	@CrossOrigin
	@GetMapping("/statistic/messagesavaragelength/{username}")
	public List<MessagesAvarageLength> messagesAvarageLength(@PathVariable String username){
		return messageService.messagesAvarageLength(username);
	}
	
	@CrossOrigin
	@GetMapping("/statistic/messageslasttext/{username}")
	public List<MessagesLastText> messagesLastText(@PathVariable String username){
		return messageService.messagesLastText(username);
	}
	
	
	
}



