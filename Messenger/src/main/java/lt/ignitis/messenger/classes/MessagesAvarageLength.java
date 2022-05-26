package lt.ignitis.messenger.classes;

public class MessagesAvarageLength {
	
	private String name;
	
	private Long messagesAvarageLength;

	public MessagesAvarageLength(String name, Long messagesAvarageLength) {
		super();
		this.name = name;
		this.messagesAvarageLength = messagesAvarageLength;
	}

	public MessagesAvarageLength() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMessagesAvarageLength() {
		return messagesAvarageLength;
	}

	public void setMessagesAvarageLength(Long messagesAvarageLength) {
		this.messagesAvarageLength = messagesAvarageLength;
	}

	@Override
	public String toString() {
		return "MessagesAvarageLength [name=" + name + ", messagesAvarageLength=" + messagesAvarageLength + "]";
	}
	
	

	
}
