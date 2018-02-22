package my.satish.interpreter;

public class IntToHexExpression implements Expression {
	
	private int i;
	
	public IntToHexExpression(int c) {
		this.i=c;
	}
		
	@Override
	public String interpret(InterpreterContext context) {
		// TODO Auto-generated method stub
		return context.getHexaFormat(i);
	}

}
