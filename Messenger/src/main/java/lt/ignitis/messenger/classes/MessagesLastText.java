package lt.ignitis.messenger.classes;

public class MessagesLastText {
	private String name;
	
	private String messagesLastText;
	
	

	public MessagesLastText() {

	}

	public MessagesLastText(String name, String messagesLastText) {
		super();
		this.name = name;
		this.messagesLastText = messagesLastText;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessagesLastText() {
		return messagesLastText;
	}

	public void setMessagesLastText(String messagesLastText) {
		this.messagesLastText = messagesLastText;
	}

	@Override
	public String toString() {
		return "MessagesLastText [name=" + name + ", messagesLastText=" + messagesLastText + "]";
	}
	
	
	
	

}
