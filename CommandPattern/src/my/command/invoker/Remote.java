package my.command.invoker;

import my.command.command.Command;

//Invoker class
public class Remote {
	private Command command;
	
	public Remote(Command command) {
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}
}
