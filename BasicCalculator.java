package Projects;

import java.util.Scanner;

public class BasicCalculator{
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		System.out.println("Type your first number:");
		int num1 = in.nextInt();
		System.out.println("Choose one of the operations:+,-,*,/");
		String str = in.next();
		System.out.println("Type your second number:");
		int num2 = in.nextInt();
		switch (str) {
			case "+":
				System.out.println("Answer:");
				System.out.println(num1+num2);
				break;

			case "-":
			System.out.println("Answer:");
				System.out.println(num1-num2);
				break;

			case "*":
			System.out.println("Answer:");
				System.out.println(num1*num2);
				break;

			case "/":
			System.out.println("Answer:");
				System.out.println(num1/num2);
				break;
		
			default:
				break;
		}
		in.close();
	}
}