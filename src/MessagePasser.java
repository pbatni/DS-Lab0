


import java.util.ArrayList;
import java.util.Queue;

public class MessagePasser 
{
	//List of all current rules
	ArrayList<Rule> currentRuleSet;
	
	//Queues for sending and receiving
	Queue<Message> sendQueue,receiveQueue;
	
	//Thread for receiver
	Thread receiverThread;
	
	public MessagePasser(String config_filename, String local_name)
	{
		//TODO:Read config file and parse and save the config state(may need a separate class for this)
			//YAML stuff here
		
		
		//TODO:set up sockets based on config file
			//Single TCP connection to remain alive
			//Use ConnectionFactory class here perhaps?
		
		
		//TODO: Setup message queues for sending and receiving
		
		//TODO:Setup additional threads?? Thread management?
		
		//TODO:Init seq number
		
		//TODO:Call receiverThreadFunctionality()
	}
	
	void send(Message message)
	{
		//Check config file for change
		//Reload if changed
		if(checkConfigFileValidity() == false)
		{
			reloadConfigFile();
		}
		
		//TODO:Set seq number and increment
		
		//TODO:Check message for send rules
		
		
	}
	
	Message receive()
	{
		//Wait until received???
		
		//Check config file for change
		//Reload if changed
		if(checkConfigFileValidity() == false)
		{
			reloadConfigFile();
			
			//TODO:Kill and restart receiverThread
			
		}
			
			
		//TODO:Process a single message waiting in the buffer
		
		
		return null;
		
	}
	
	//TODO:
	void receiverThreadFunctionality()
	{
		//Receive side:
			//Setup listener thread that populates receive queue
			//Check each incoming message for receive rules
	}
	
	//TODO:
	void reloadConfigFile()
	{
		
	}
	
	//TODO:
	Boolean checkConfigFileValidity()
	{
		return true;
	}
}
