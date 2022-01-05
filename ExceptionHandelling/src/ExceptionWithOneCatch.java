
public class ExceptionWithOneCatch {

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
		catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			
			
			if(e instanceof ArithmeticException)
				System.out.println("dont enter zero in denominator");
			else if(e instanceof NullPointerException)
				System.out.println("dony call any method with null object");
			else if(e instanceof ArrayIndexOutOfBoundsException)
				System.out.println("enter valid index");
			
			System.out.println(e.getMessage());
			
		}
		
		
				
		int res2 = x+y;
		System.out.println("sum is "+res2);

	}

}
