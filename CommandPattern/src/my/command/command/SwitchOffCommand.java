package my.command.command;

import java.util.List;

import my.command.receiver.ConsumerElectronics;

public class SwitchOffCommand implements Command {
	
	private  List<ConsumerElectronics> list;
	
	public SwitchOffCommand(List<ConsumerElectronics> list) {
		// TODO Auto-generated constructor stub
		this.list=list;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(ConsumerElectronics ce : list) {
			ce.switchOff();
		}
	}

}
