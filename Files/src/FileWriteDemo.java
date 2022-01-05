import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("names.txt",true));
			bw.write("today is holiday");
			bw.newLine();
			bw.write(100);
			bw.flush();
			System.out.println("Done!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
