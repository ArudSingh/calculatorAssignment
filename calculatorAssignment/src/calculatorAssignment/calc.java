package calculatorAssignment;

import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
	
		System.out.println("enter the first number and press ENTER key :-");
		double a= sr.nextDouble();
		
		System.out.println("enter the operation:-\n"
				+ "PRESS '+' for ADDITION\n"
				+ "PRESS '-' for SUBSTRACTION\n"
				+ "PRESS '*' for MULTIPLICATION\n"
				+ "PRESS '/' for DIVISION");
		String op= sr.next();

		
		System.out.println("enter the second number and press ENTER key:-");  
		double b= sr.nextDouble();
		
		double c= 0;
		
		calculator obj =new calculator(a,b);
		
		switch(op) {
		case"+" : c=obj.add();
		break;
		case"-" : c=obj.sub();
		break;
		case"*" : c=obj.mul();
		break;
		case"/" : c=obj.div();
		break;
		default : System.out.println("invalid operation");
		break;
		}
		float sol = (float)c;    // Typecasting
								 // convert double value to float to decrease decimal points
		if (c!=0)
		System.out.println("your answer is ");
		System.out.println("" + a +  op  + b + " = " + sol );
}

}

