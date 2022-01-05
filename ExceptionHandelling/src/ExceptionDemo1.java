import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("hello");
		
		//correct all the syntaxes to compile the program 
		//copiletime errors comes because there is a problem in the sysntax
		//runtime erors are nothing but exceptions 
		//runtime error will occur at runtime
		//runtime errors are caused by invalid input
		
		
		
		
		//
		
		findSqure(10);
		
		
		

	}
	
	
	
	static void findSqure(int num) throws FileNotFoundException {
		System.out.println(num*num);
		readFile();
	}



	private static void readFile() throws FileNotFoundException {
		// TODO Auto-generated method stub
		//checked exceptions 
		//unchecked exceptions 
		FileReader fr = new FileReader("abc.txt");
	}
	
	

}
