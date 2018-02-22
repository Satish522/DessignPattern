package my.journaldev.momento;

public class FileWriterUtilCareTaker {
	private Object obj;
	
	public void save(FileWriterUtil fileWriterUtil) {
		this.obj=fileWriterUtil.save();
	}
	
	public void undoLast(FileWriterUtil fileWriterUtil) {
		fileWriterUtil.undoLastSave(obj);
	}
}
