package Projects;

import java.util.Scanner;

public class BasicCalculator{
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		String str = in.next();
		int num2 = in.nextInt();
		switch (str) {
			case "+":
				System.out.println(num1+num2);
				break;

			case "-":
				System.out.println(num1-num2);
				break;

			case "*":
				System.out.println(num1*num2);
				break;

			case "/":
				System.out.println(num1/num2);
				break;
		
			default:
				break;
		}
		in.close();
	}
}