package lt.ignitis.messenger.classes;

public class MessagesCount {

	private String name;
	
	private Long messagesNumber;

	public MessagesCount() {
	}

	public MessagesCount(String name, Long messagesNumber) {
		super();
		this.name = name;
		this.messagesNumber = messagesNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMessagesNumber() {
		return messagesNumber;
	}

	public void setMessagesNumber(Long messagesNumber) {
		this.messagesNumber = messagesNumber;
	}

	@Override
	public String toString() {
		return "MessagesCount [name=" + name + ", messagesNumber=" + messagesNumber + "]";
	}
	
	
}
