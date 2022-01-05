import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		
		try {
			int counter= 0;
			
			br = new BufferedReader(new FileReader("sample.txt"));
			String str = null;
			while ((str = br.readLine())!=null) {
				counter++;
				System.out.println(str);
			}
			System.out.println(counter);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
