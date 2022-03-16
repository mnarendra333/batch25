import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// perfect number 1 ...1000 
		//123
		
		
		
		for (int i = 10; i <=1000; i++) {
		
			int sum= 0,rem=0,mul = 1;
			int dupNum = i;
			while (i>0) {
				rem  = i%10;
				sum = sum + rem;
				mul = mul * rem;
				i = i/10;
			}
			i = dupNum;
			if(sum == mul) {
				System.out.println("pefect "+dupNum);
			}
		}
		
		

	}

}
