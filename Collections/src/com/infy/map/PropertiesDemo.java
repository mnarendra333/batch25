package com.infy.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {    // Dictionary->Hashtable-> Properties 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Properties props = new Properties();
			props.load(new FileInputStream("abc.properties"));
			
			System.out.println(props.getProperty("username"));
			System.out.println(props.getProperty("password"));
			
			Set<Entry<Object, Object>> map = props.entrySet();
			System.out.println("=====================");
			for (Entry<Object, Object> entry : map) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
