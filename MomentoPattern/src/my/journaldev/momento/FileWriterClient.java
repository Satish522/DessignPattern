package my.journaldev.momento;

import java.util.List;
import java.util.ArrayList;

public class FileWriterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		FileWriterUtilCareTaker fileWriterCaretaker=new FileWriterUtilCareTaker();
		
		FileWriterUtil fileWriterUtil=new FileWriterUtil("sample.txt");
		
		fileWriterUtil.write("This is first line. \n");
		
		fileWriterCaretaker.save(fileWriterUtil);
		System.out.println(fileWriterUtil);
		
				
		fileWriterUtil.write("This is second line of this object");
		System.out.println(fileWriterUtil);
				
		
		fileWriterCaretaker.undoLast(fileWriterUtil);
		System.out.println(fileWriterUtil);
		
	}

}
