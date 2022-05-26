package lt.ignitis.messenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.ignitis.messenger.entities.Client;



public interface ClientRepository  extends JpaRepository<Client, Integer>  {
	Client findByUsername(String username);
}
