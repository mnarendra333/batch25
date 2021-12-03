package com.infy.smartapplication;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("select option to perform the job\n" + "1.Add\n" + "2.Sub\n" + "3.Mul\n" + "4.Div\n");

		int input = sc.nextInt();

		System.out.println("Enter input for x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();

		switch (input) {
		case 1:
			System.out.println(x + y);
			break;
		case 2:
			System.out.println(x - y);
			break;

		case 3:
			System.out.println(x * y);
			break;

		case 4:
			System.out.println(x / y);
			break;

		default:System.out.println("none of the option matched");
			break;
		}

	}

}
