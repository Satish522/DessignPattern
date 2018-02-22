package my.design.state;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVContext tvContext=new TVContext();
		TVStartState startState=new TVStartState();
		TVStopState stopState=new TVStopState();
		
		tvContext.setTvState(startState);
		tvContext.doAction();
		
		tvContext.setTvState(stopState);
		tvContext.doAction();
	}

}
