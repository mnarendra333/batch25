import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			FileWriter fw = new FileWriter("names.txt");
			//A to Z && a to z 
			
			for (int i = 97; i <=122; i++) {
				fw.write((char)i);
			}
			fw.write("\n");
			for (int i = 65; i <=90; i++) {
				fw.write((char)i);
			}
			fw.write("\n");
			fw.write("hello");
			fw.write('a');
			
			char ch[] = {'a','e','i','o','u'};
			fw.write(ch);
			
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
