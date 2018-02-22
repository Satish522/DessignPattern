package my.command.test;

 
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

import my.command.command.Command;
import my.command.command.MuteCommand;
import my.command.command.SwitchOffCommand;
import my.command.invoker.Remote;
import my.command.receiver.ConsumerElectronics;
import my.command.receiver.HomeTheatre;
import my.command.receiver.Television;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Receiver Object to pass 
		ConsumerElectronics ce=new HomeTheatre();
		Command command=new MuteCommand(ce);
		Remote remote=new Remote(command);
		
		remote.click();
		
		List list=new ArrayList<>();
		list.add(ce);
		list.add(new Television());
		Command switchOff=new SwitchOffCommand(list);
		remote = new Remote(switchOff);
		
		remote.click();
		
		
	}

}
