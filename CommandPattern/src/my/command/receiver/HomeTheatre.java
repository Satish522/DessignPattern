package my.command.receiver;

public class HomeTheatre implements ConsumerElectronics {

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("Switch On Home Theatre");
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Switch Off Home Theatre");
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("Muted Home Theatre");
	}

}
