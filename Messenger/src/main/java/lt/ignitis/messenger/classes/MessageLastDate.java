package lt.ignitis.messenger.classes;

public class MessageLastDate {
	
	private String name;
	
	private String lastDate;

	public MessageLastDate() {
	}

	public MessageLastDate(String name, String lastDate) {
		super();
		this.name = name;
		this.lastDate = lastDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setlastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	@Override
	public String toString() {
		return "MessageFirstDate [name=" + name + ", lastDate=" + lastDate + "]";
	}
	
	
	
	

}
