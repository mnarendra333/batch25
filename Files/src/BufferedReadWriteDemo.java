import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReadWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			
			br = new BufferedReader(new FileReader("sample.txt"));
			bw = new BufferedWriter(new FileWriter("target.txt"));
			String line = null;
			while ((line = br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
			System.out.println("Done!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
