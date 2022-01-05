import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageReadAndWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			FileInputStream fis = new FileInputStream("/Users/nmunnang/Downloads/sourceImage.jpeg");
			FileOutputStream fos = new FileOutputStream("/Users/nmunnang/Downloads/targetImg.jpeg");
			
			int ch;
			while ((ch = fis.read())!=-1) {
				fos.write((char)ch);
			}
			System.out.println("Image copied");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
