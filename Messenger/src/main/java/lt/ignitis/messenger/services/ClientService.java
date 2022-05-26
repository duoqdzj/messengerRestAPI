package lt.ignitis.messenger.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lt.ignitis.messenger.entities.Client;
import lt.ignitis.messenger.repositories.ClientRepository;



public class ClientService {
	@Autowired
	ClientRepository clientRepository;
	
	public List<Client> getClient(){
		return clientRepository.findAll();
	}
	
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}
	
	
	public Client getClient(Integer id) {
		return clientRepository.findById(id).orElse(null);
	}
	
	
	public Client updateClient(Client s) {
		Client old=this.getClient(s.getId());
		old.setUsername(s.getUsername());
		old.setRole(s.getRole());
		old.setMessage(s.getMessage());
		
		clientRepository.save(old);
		return old;
	}
	
	public void deleteClient(Integer id) {
		clientRepository.deleteById(id);
	}
	
	
	public Client findByUsername(String username) {
		return clientRepository.findByUsername(username);
	}

}