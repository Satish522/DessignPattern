package my.command.command;

import my.command.receiver.ConsumerElectronics;

public class MuteCommand implements Command {
	
	private ConsumerElectronics ce;
		
	public MuteCommand(ConsumerElectronics ce) {
		this.ce = ce;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ce.mute();
	}

}
