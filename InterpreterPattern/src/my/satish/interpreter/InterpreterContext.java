package my.satish.interpreter;

public class InterpreterContext {
	public String getBinaryFormat(int i) {
		return Integer.toBinaryString(i);
	}
	
	public String getHexaFormat(int i) {
		return Integer.toHexString(i);
	}
}
