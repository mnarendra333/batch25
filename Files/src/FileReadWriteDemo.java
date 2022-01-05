import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("sample.txt");
			FileWriter fw = new FileWriter("dest.txt");
			
			int ch;
			while ((ch=fr.read())!=-1) {
				fw.write((char)ch);
			}
			fw.flush();
			System.out.println("Done!");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
