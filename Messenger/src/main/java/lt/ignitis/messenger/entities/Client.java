package lt.ignitis.messenger.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany( mappedBy = "Client" )
	private List<Message> message;
		
	@Column(nullable = false, unique = true)
	//@NotEmpty
	private String username;

	@Column(nullable = false)
	//@NotEmpty
	private String role="user";

	public Client(Integer id, List<Message> message, String username, String role) {
		super();
		this.id = id;
		this.message = message;
		this.username = username;
		this.role = role;
	}

	public Client() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
