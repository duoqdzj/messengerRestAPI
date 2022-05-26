package lt.ignitis.messenger.classes;

public class MessageFirstDate {
	
	private String name;
	
	private String firstDate;

	public MessageFirstDate() {
	}

	public MessageFirstDate(String name, String firstDate) {
		super();
		this.name = name;
		this.firstDate = firstDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstDate() {
		return firstDate;
	}

	public void setFirstDate(String firstDate) {
		this.firstDate = firstDate;
	}

	@Override
	public String toString() {
		return "MessageFirstDate [name=" + name + ", firstDate=" + firstDate + "]";
	}
	
	
	
	

}
