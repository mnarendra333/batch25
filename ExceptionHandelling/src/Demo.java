
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//outer try
			
			try {
				//inner try
			} catch (Exception e2) {
				//inner catch
			}
		} 
		catch (ArithmeticException e) {
			//outer catch
			
			try {
				//inner try
			} catch (Exception e2) {
				//inner catch
			}
			
		}
		finally {
			try {
				
			} catch (Exception e2) {
			}
		}

	}

}
