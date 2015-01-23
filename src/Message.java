
import java.io.Serializable;

public class Message implements Serializable
{
	// TODO:Data:
	/*
	 * Header:
	 * 	- String destinationNodeName
	 * 	- int Sequence number...not generated here but initialized to a default
	 * 	- Boolean flag_duplicate
	 * 	- String messageType
	 * Payload:
	 * 	-Anything...Object for now
	 * */
	public Message(String dest, String kind, Object data)
	{
		
	}
}

