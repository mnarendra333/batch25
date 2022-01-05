import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//read the file
		
		try {
			FileReader fr = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] names = new String[] {"ravi","arun"};
		System.out.println(names[5]);
		
		
		
		

	}

}
