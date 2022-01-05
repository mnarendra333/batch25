
public class ExceptionDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20,y=0;
		
		// ArithmeticException 
		try {
			/*int res = x/y; 
			System.out.println("res is "+res);*/
			//1-1000
			
			int numbers[] = {10,20,30,40,50};
			System.out.println(numbers[10]);
			
			String str = null;
			int length = str.length();
			
		} 
		
		catch (ArithmeticException e) {
			System.out.println("i am from ArithmeticException catch- dont enter 0 in denominator");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("i am from NullPointerException catch | make sure add all the values");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("i am from ArrayIndexOutOfBoundsException catch | enter valid index");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception occured in the backed");
		}
		
		
		
				
		int res2 = x+y;
		System.out.println("sum is "+res2);
	}

}
