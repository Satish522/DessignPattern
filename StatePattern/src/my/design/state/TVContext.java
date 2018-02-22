package my.design.state;

public class TVContext implements State {
	State tvState;
		
	public State getTvState() {
		return tvState;
	}

	public void setTvState(State tvState) {
		this.tvState = tvState;
	}

	@Override
	public void doAction() {
		tvState.doAction();
	}

}
