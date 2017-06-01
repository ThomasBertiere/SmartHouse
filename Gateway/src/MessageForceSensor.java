


import java.io.Serializable;

public class MessageForceSensor extends Message implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int value ; 
	
	public MessageForceSensor(int value) {
		this.value=value ; 
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
