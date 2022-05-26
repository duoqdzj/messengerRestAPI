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

import lt.ignitis.messenger.entities.Client;
import lt.ignitis.messenger.services.ClientService;

public class ClientController {

	@Autowired
	ClientService clientService;
	
	@CrossOrigin
	@GetMapping("/client")
	public List<Client> index(){
		return clientService.getClient();
	}
	
	@CrossOrigin
	@PostMapping("/client")
	public Client add(@RequestBody Client s)
	{
		return clientService.saveClient(s);
	}
	
	@CrossOrigin
	@PatchMapping("/client/{id}")
	public Client update(@PathVariable Integer id, @RequestBody Client s) {
		
		return clientService.updateClient(s);
	}
	
	@CrossOrigin
	@DeleteMapping("/client/{id}")
	public Boolean delete(@PathVariable Integer id) {
		clientService.deleteClient(id);
		return true;
	}
	
	
}
