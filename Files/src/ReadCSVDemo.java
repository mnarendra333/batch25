import java.io.File;
import java.util.Scanner;

public class ReadCSVDemo {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(new File("/Users/nmunnang/Downloads/dummy.csv"));
			sc.useDelimiter(","); // sets the delimiter pattern

			while (sc.hasNext()) // returns a boolean value
			{
				System.out.print(sc.next()); // find and returns the next complete token from this scanner
			}
			sc.close(); // closes the scanner

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
