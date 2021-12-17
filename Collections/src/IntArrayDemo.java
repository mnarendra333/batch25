import java.util.ArrayList;
import java.util.Scanner;

public class IntArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer[] i1 = new Integer[5];
		
		//0 1 2 3 4
		
		//i1[0] = 10.5f;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter inputs");
		for (int i = 0; i < i1.length; i++) {
			i1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < i1.length; i++) {
			System.out.println(i1[i]);
		}
		
		
		/*Object[] obj = new Object[5];
		obj[0] = new Integer(10);
		obj[1] = new Student();
		obj[2] = new Employee();
		obj[3] = new Float(10.5f);*/
		
		
		//diff bw arrays and collections
		
		//arrays are homojenious where are collections can store different types
		//array are fixed in size where as collections are growbale
		//we dont have any built in method support in arrays where as collections has very good method support 
		//arrays wont fallow any internal data structure where as each collection has some some
		//arrays are faster than collections
		
		
		
		
		
		
		
		

	}

}
