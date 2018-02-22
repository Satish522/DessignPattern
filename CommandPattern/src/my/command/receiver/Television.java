package my.command.receiver;

public class Television implements ConsumerElectronics {

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("Switch On Television");
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Switch Off Television");
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("Mute Television");
	}

}
