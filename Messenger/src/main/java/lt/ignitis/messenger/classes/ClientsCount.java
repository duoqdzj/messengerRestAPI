package lt.ignitis.messenger.classes;

public class ClientsCount {
	private String name;
		
	private Long clientsNumber;

	public ClientsCount() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getClientsNumber() {
		return clientsNumber;
	}

	public void setClientsNumber(Long clientsNumber) {
		this.clientsNumber = clientsNumber;
	}

	public ClientsCount(String name, Long clientsNumber) {
		super();
		this.name = name;
		this.clientsNumber = clientsNumber;
	}

	@Override
	public String toString() {
		return "ClientsCount [name=" + name + ", clientsNumber=" + clientsNumber + "]";
	}
	
	
}
