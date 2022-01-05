import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			
		
		try {
			File file = new File("abc.txt");
			file.createNewFile();
			System.out.println("file created");
			
			//file.delete();
			
			//if you want to fecth all files and dolders in specfic dir we can use 
			//listFiles method 
			File file2 = new File("/users/nmunnang");
			File[] files = file2.listFiles();
			for (File file3 : files) {
				if(file3.isFile())
				System.out.println(file3.getName());
			}
			
			//createNewFile
			//listFiles
			//isFile
			//isDirectory();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
