package lt.ignitis.messenger.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name="author")
	private Client client;
	

	@Column
	private Date created;
	
	@Column
	private String message;
	
	public Message() {
	}

	public Message(Integer id, Client client, Date created, String message) {
		super();
		this.id = id;
		this.client = client;
		this.created = created;
		this.message = message;
	}
	
	public Message(Client client, Date created, String message) {
		super();
		this.client = client;
		this.created = created;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

}
