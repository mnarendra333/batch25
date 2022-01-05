import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
	
	
	
	public static void main(String[] args) {
		
		
		try {
			
			FileReader fr = new FileReader("names.txt");
			int ch;
			while ((ch = fr.read())!=-1) {
				System.out.print((char)ch);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//jpg jpeg images //zip files 
		
	}

}
