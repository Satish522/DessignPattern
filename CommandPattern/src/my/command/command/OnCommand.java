package my.command.command;

import my.command.receiver.ConsumerElectronics;

public class OnCommand implements Command {
	
	private ConsumerElectronics ce;
	
	public OnCommand(ConsumerElectronics ce) {
		this.ce=ce;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ce.switchOn();
	}

}
