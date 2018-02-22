package my.journaldev.momento;

public class FileWriterUtil {
	private String fileName;
	private StringBuilder content;
	public FileWriterUtil(String fileName) {
		this.fileName = fileName;
		content=new StringBuilder();
	}
	
	@Override
	public String toString() {
		return this.content.toString();
	}
	
	public void write(String str) {
		this.content.append(str);
	}
	
	public Momento save() {
		return new Momento(this.fileName, this.content);
	}
	
	public void undoLastSave(Object obj) {
		Momento momento=(Momento)obj;
		this.fileName=momento.fileName;
		this.content=momento.content;
	}
	
	
	private class Momento{
		private String fileName;
		private StringBuilder content;
		public Momento(String fileName, StringBuilder content) {
			this.fileName = fileName;
			this.content = new StringBuilder(content);
		}
		
		
		
	}
	
}
