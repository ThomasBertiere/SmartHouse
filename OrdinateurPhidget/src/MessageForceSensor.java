import java.io.Serializable;

public class MessageForceSensor extends Message implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int value ; 
	
	/*
	 * Message dedicated to the force sensor
	 */
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
