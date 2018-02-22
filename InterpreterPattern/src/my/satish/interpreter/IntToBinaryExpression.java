package my.satish.interpreter;

public class IntToBinaryExpression implements Expression {
	
	private int i;
	
	public IntToBinaryExpression(int c) {
		this.i=c;
	}
	
	@Override
	public String interpret(InterpreterContext context) {
		return context.getBinaryFormat(i);
	}

}
